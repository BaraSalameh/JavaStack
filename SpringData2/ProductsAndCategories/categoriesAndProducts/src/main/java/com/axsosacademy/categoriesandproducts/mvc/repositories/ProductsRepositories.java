package com.axsosacademy.categoriesandproducts.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.categoriesandproducts.mvc.models.Category;
import com.axsosacademy.categoriesandproducts.mvc.models.Product;

@Repository
public interface ProductsRepositories extends CrudRepository<Product, Long>{
	List<Product> findByCategoriesNotContaining(Category category);
}
