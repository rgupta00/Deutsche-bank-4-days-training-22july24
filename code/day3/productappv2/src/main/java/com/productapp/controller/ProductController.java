package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
