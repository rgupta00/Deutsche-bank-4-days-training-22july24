package com.productapp.service;

import java.util.List;

import com.productapp.repo.Product;
import com.productapp.repo.ProductDao;
import com.productapp.repo.ProductDaoImplJdbc;

public class ProductServiceImpl implements ProductService{

	//Spring?
	private ProductDao productDao;
	
	public ProductServiceImpl() {
		productDao=new ProductDaoImplJdbc();
	}
	
	@Override
	public List<Product> getAll() {
		//BL, logging, sec
		return productDao.getAll();
	}

	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
