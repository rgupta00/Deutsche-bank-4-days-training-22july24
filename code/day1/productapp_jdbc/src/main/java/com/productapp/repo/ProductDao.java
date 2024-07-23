package com.productapp.repo;

import java.util.List;

public interface ProductDao {
	public List<Product> getAll();
	public void addProduct(Product product);
	public Product findById(int id);
	
}
