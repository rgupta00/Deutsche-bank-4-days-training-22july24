package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.repo.Product;
import com.productapp.repo.ProductDao;

//DP, OOAD, SOLID

@Service(value = "productService")
public class ProductServiceImpl implements ProductService {

	// autowire : field , setter , constuctor

//	@Autowired
	private ProductDao productDao;

	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}

//	@Autowired
//	public void setProductDao(ProductDao productDao) {
//		this.productDao = productDao;
//	}

	@Override
	public List<Product> getProducts() {
		List<Product> products = productDao.getProducts();
		return products;
	}
}
