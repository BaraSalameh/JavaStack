package com.axsosacademy.categoriesandproducts.mvc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsosacademy.categoriesandproducts.mvc.models.Category;
import com.axsosacademy.categoriesandproducts.mvc.models.Product;
import com.axsosacademy.categoriesandproducts.mvc.repositories.CategoriesRepository;
import com.axsosacademy.categoriesandproducts.mvc.repositories.ProductsRepositories;

@Service
public class ProductsService {
	private final ProductsRepositories pr;
	private final CategoriesRepository cr;
	
	public ProductsService(ProductsRepositories pr, CategoriesRepository cr) {
		this.pr = pr;
		this.cr = cr;
	}
	
	public void addNewProduct(String name, String description, double price) {
		Product product = new Product(name, description, price);
		this.pr.save(product);
	}
	
	public Product retrieveProduct(Long id) {
		Optional<Product> opt = this.pr.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	
	public void addCategory(Category category, Long id) {
		Optional<Product> product = this.pr.findById(id);
		if(product.isPresent()) {
			product.get().getCategories().add(category);
			this.pr.save(product.get());
		}
	}
	
	public void addNewCategory(Long categoryId, Long productId) {
		Category category = this.cr.findById(categoryId).orElse(null);
		Product product = this.pr.findById(productId).orElse(null);
		category.getProducts().add(product);
		product.getCategories().add(category);
		this.cr.save(category);
		this.pr.save(product);
	}
}
