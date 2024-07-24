package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.conversion.Convertor;
import com.productapp.entities.ProductEntity;
import com.productapp.service.ProductService;
import com.productapp.vo.ProductVO;

@RestController
public class ProductController {
	
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	//REST endpoint for getting all products
	@GetMapping(path="products")
	public List<ProductVO> getProducts(){
		return productService.getProducts().stream()
				.map(Convertor::toProductVO).toList();
	}
	
	// for getting a particular product byid
	@GetMapping(path="products/{id}")
	public ProductVO getById( @PathVariable(name ="id") int id) {
		return Convertor.toProductVO(productService.getById(id));
	}
	
	//save
	@PostMapping(path="products")
	public ProductVO addProduct(@RequestBody ProductEntity product) {
		return Convertor.toProductVO(productService.addProduct(product));
	}
	
	//update
	@PutMapping(path="products/{id}")
	public ProductVO updateProduct(@PathVariable(name ="id") int id, @RequestBody ProductEntity product) {
		return Convertor.toProductVO(productService.updateProduct(id, product));
	}
	
	//delete
	@DeleteMapping(path="products/{id}")
	public ProductVO deleteById( @PathVariable(name ="id") int id) {
		return Convertor.toProductVO(productService.deleteProduct(id));
	}

}
