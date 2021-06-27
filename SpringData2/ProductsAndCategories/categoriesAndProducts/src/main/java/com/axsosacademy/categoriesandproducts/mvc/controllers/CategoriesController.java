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
import com.axsosacademy.categoriesandproducts.mvc.services.CategoriesService;

@Controller
public class CategoriesController {
	private final CategoriesService cs;
	
	public CategoriesController(CategoriesService cs) {
		this.cs = cs;
	}
	
	@RequestMapping("/categories/new")
	public String showCategory(@ModelAttribute("categories") Category category) {
		return "category.jsp";
	}
	
	@RequestMapping("/addNewCategory")
	public String addNewCategory(@Valid @ModelAttribute("categories") Category category,
			@RequestParam(value = "name") String name,
			BindingResult result) {
		if(result.hasErrors()) {
			return "category.jsp";
		}
		this.cs.addNewCategory(name);
		return "redirect:/categories/new";
	}
	
	@RequestMapping("/categories/{id}")
	public String showCategoriesPage(@ModelAttribute(value="categories") Category category,
			@PathVariable("id") Long categoryId,
			Model model,
			HttpSession session) {
		session.setAttribute("categoryId", categoryId);
		Category cat = this.cs.retrieveCategory(categoryId);
		model.addAttribute("category", cat);
		model.addAttribute("products", this.cs.retrieveProducts(categoryId));
		return "categoriesPage.jsp";
	}
	
	@RequestMapping(value="/addProductsToCategory", method=RequestMethod.POST)
	public String addProductsToCategory(@Valid @ModelAttribute("categories") Category category,
			@RequestParam(value= "products") Long productId,
			BindingResult result,
			HttpSession session) {
		if(result.hasErrors()) {
			return "categoriesPage.jsp";
		}else {
			this.cs.addNewProduct(productId, (Long) session.getAttribute("categoryId"));
			return "redirect:/categories/"+session.getAttribute("categoryId");
		}
	}
}
