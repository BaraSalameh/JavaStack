package com.axsosacademy.categoriesandproducts.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsosacademy.categoriesandproducts.mvc.models.Category;
import com.axsosacademy.categoriesandproducts.mvc.models.Product;
import com.axsosacademy.categoriesandproducts.mvc.repositories.CategoriesRepository;
import com.axsosacademy.categoriesandproducts.mvc.repositories.ProductsRepositories;

@Service
public class CategoriesService {
	private final CategoriesRepository cr;
	private final ProductsRepositories pr;
	
	public CategoriesService(CategoriesRepository cr,
			ProductsRepositories pr) {
		this.cr = cr;
		this.pr = pr;
	}
	
	public void addNewCategory(String name) {
		Category category = new Category(name);
		this.cr.save(category);
	}
	
	public List<Category> retrieveCategories(Product p){
		return this.cr.findByProductsNotContaining(p);
	}
	
	public Category retrieveCategory(Long id) {
		Optional<Category> category = this.cr.findById(id);
		if(category.isPresent()) {
			return category.get();
		}
		return null;
	}
	
	public List<Product> retrieveProducts(Long categoryId){
		Category category = this.cr.findById(categoryId).orElse(null);
		return this.pr.findByCategoriesNotContaining(category);
	}
	
	public void addNewProduct(Long productId, Long categoryId) {
		Category category = this.cr.findById(categoryId).orElse(null);
		Product product = this.pr.findById(productId).orElse(null);
		category.getProducts().add(product);
		product.getCategories().add(category);
		this.cr.save(category);
		this.pr.save(product);
	}
}
