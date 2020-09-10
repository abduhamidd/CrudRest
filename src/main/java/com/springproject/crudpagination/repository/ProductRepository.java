package com.springproject.crudpagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.crudpagination.model.Product;


public interface ProductRepository extends JpaRepository<Product,Long> {
	 Product findByName(String name);

}
