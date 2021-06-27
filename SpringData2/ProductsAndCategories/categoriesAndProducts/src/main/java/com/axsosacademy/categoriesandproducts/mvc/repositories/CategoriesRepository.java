package com.axsosacademy.categoriesandproducts.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.categoriesandproducts.mvc.models.Category;
import com.axsosacademy.categoriesandproducts.mvc.models.Product;

@Repository
public interface CategoriesRepository extends CrudRepository<Category, Long>{
	List<Category> findAll();
	List<Category> findByProductsNotContaining(Product product);
}
