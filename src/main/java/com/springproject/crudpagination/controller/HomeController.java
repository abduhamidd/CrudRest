package com.springproject.crudpagination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.crudpagination.Service.ProductService;
import com.springproject.crudpagination.model.Product;
@RestController
public class HomeController {
	@Autowired
	private ProductService service;

	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return service.getProducts();
	}
	@PostMapping("/addProduct")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	 @PostMapping("/addProducts")
	 public   List<Product> saveProducts(@RequestBody List<Product> products) {
		 return service.saveProducts(products);
	 }
	 
	 @PutMapping("/update")
	 public Product updateProduct(@RequestBody Product product) {
		 return service.updateProduct(product);
	 }
	 @DeleteMapping
	 public String deleteProductById(@PathVariable Long id) {
		 return service.deleteProduct(id);
	 }
	 @GetMapping("/getProductById/id")
	 public Product getProductById(@PathVariable Long id) {
		 return service.getProductById(id);
	 }
	 @GetMapping("/search/name")
	 public Product getProductByName(@PathVariable String name) {
		 return service.getProductByName(name);
	 }
	
}
