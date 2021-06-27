package com.axsosacademy.categoriesandproducts.mvc.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsosacademy.categoriesandproducts.mvc.models.Category;
import com.axsosacademy.categoriesandproducts.mvc.models.Product;
import com.axsosacademy.categoriesandproducts.mvc.services.CategoriesService;
import com.axsosacademy.categoriesandproducts.mvc.services.ProductsService;

@Controller
public class ProductsController {
	private final ProductsService ps;
	private final CategoriesService cs;
	
	public ProductsController(ProductsService ps, CategoriesService cs) {
		this.ps = ps;
		this.cs = cs;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/products/new";
	}
	
	@RequestMapping("products/new")
	public String showProduct(@ModelAttribute("products") Product product) {
		return "product.jsp";
	}
	
	@RequestMapping("/addNewProduct")
	public String addNewProduct(@Valid @ModelAttribute("products") Product product,
			@RequestParam(value="name") String name,
			@RequestParam(value="description") String description,
			@RequestParam(value="price") double price,
			BindingResult result) {
		if(result.hasErrors()) {
			return "product.jsp";
		}else {
			this.ps.addNewProduct(name, description, price);
			return "redirect:/products/new";
		}
	}
	
	@RequestMapping("/products/{id}")
	public String showProductPage(@ModelAttribute(value="products") Product product,
			@PathVariable("id") Long id,
			Model model,
			HttpSession session) {
		Product p = this.ps.retrieveProduct(id);
		model.addAttribute("product", p);
		model.addAttribute("categories", this.cs.retrieveCategories(p));
		session.setAttribute("productId", id);
		return "productsPage.jsp";
	}
	
	@RequestMapping(value="/addCategory", method = RequestMethod.POST)
	public String addCategory(@Valid @ModelAttribute(value="products") Product product,
			@RequestParam(value = "categories") Category category,
			BindingResult result,
			HttpSession session) {
		if(result.hasErrors()) {
			return "productsPage.jsp";
		}
		this.ps.addCategory(category, (Long) session.getAttribute("productId"));
		return "redirect:/products/"+session.getAttribute("productId");
	}
	
	@RequestMapping(value="/addCategoryToProduct", method=RequestMethod.POST)
	public String addCategor(@Valid @ModelAttribute("products") Product product,
			@RequestParam(value="categories") Long categoryId,
			BindingResult result,
			HttpSession session){
		if(result.hasErrors()) {
			return "productsPage.jsp";
		}else {
			this.ps.addNewCategory(categoryId, (Long) session.getAttribute("productId"));
			return "redirect:/products/"+session.getAttribute("productId");
		}
	}
}
