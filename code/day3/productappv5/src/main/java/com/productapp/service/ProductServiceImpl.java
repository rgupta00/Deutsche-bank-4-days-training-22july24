package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.excpetions.ProductNotFoundException;
import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;

@Service
@Transactional// spring data will do the tx for you
public class ProductServiceImpl implements ProductService{

	private ProductRepo productRepo;
	
	@Autowired
	public ProductServiceImpl(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	@Override
	public Product getById(int id) {
		//java 8 stream processing*
		return productRepo.findById(id)
				.orElseThrow(()-> new ProductNotFoundException("product with id "+id +" is not found"));
	}

	@Override
	public List<Product> getProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		productRepo.save(product);
		return product;
	}

	@Override
	public Product updateProduct(int id, Product product) {
		Product productToUpdate= getById(id);
		productToUpdate.setPrice(product.getPrice());
		
		productRepo.save(productToUpdate);
		
		return productToUpdate;
	}

	@Override
	public Product deleteProduct(int id) {
		Product productToDelete= getById(id);
		productRepo.delete(productToDelete);
		return productToDelete;
	}

}
