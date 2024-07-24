package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;

@RestController
public class ProductController {
	
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	//REST endpoint for getting all products
	@GetMapping(path="products")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	// for getting a particular product byid
	@GetMapping(path="products/{id}")
	public Product getById( @PathVariable(name ="id") int id) {
		return productService.getById(id);
	}
	//ResponseEntity: bag : data + status code
	//save
	@PostMapping(path="products")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(product));
	}
	
	//update
	@PutMapping(path="products/{id}")
	public Product updateProduct(@PathVariable(name ="id") int id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}
	
	//delete
	@DeleteMapping(path="products/{id}")
	public ResponseEntity<Void> deleteById( @PathVariable(name ="id") int id) {
		 productService.deleteProduct(id);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
