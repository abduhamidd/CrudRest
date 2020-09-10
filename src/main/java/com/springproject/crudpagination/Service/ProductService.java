package com.springproject.crudpagination.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.crudpagination.model.Product;
import com.springproject.crudpagination.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	
	public Product saveProduct(Product product) {
		return repo.save(product);
	}
	
public List<Product> saveProducts(List<Product> products){
	return repo.saveAll(products);
}
public  List<Product> getProducts(){
	return repo.findAll();
}
public Product getProductById(Long id) {
	return repo.findById(id).orElse(null);
}
public Product getProductByName(String name) {
	return repo.findByName(name);
}
public String deleteProduct(Long id) {
	repo.deleteById(id);
	return "product removed!!" + id;
}

public Product updateProduct(Product product) {
	Product existingProduct =repo.findById(product.getId()).orElse(null);
	existingProduct.setName(product.getName());
	existingProduct.setQuantity(product.getQuantity());
	existingProduct.setPrice(product.getPrice());
	return repo.save(existingProduct);
	
}

}
