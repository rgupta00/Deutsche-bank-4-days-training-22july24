package com.productapp.service;

import java.util.List;

import com.productapp.entities.ProductEntity;

public interface ProductService {
	public ProductEntity getById(int id);
	public List<ProductEntity>getProducts();
	public ProductEntity addProduct(ProductEntity product);
	public ProductEntity updateProduct(int id, ProductEntity product);
	public ProductEntity deleteProduct(int id);
}
