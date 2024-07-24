package com.productapp.service;

import java.util.List;

import com.productapp.repo.Product;

public interface ProductService {
	public Product getById(int id);
	public List<Product>getProducts();
	public Product addProduct(Product product);
	public Product updateProduct(int id, Product product);
	public Product deleteProduct(int id);
}
