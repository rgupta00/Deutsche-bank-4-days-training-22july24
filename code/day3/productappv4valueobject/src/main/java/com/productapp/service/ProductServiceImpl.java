package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.entities.ProductEntity;
import com.productapp.excpetions.ProductNotFoundException;
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
	public ProductEntity getById(int id) {
		//java 8 stream processing*
		return productRepo.findById(id)
				.orElseThrow(()-> new ProductNotFoundException("product with id "+id +" is not found"));
	}

	@Override
	public List<ProductEntity> getProducts() {
		return productRepo.findAll();
	}

	@Override
	public ProductEntity addProduct(ProductEntity product) {
		productRepo.save(product);
		return product;
	}

	@Override
	public ProductEntity updateProduct(int id, ProductEntity product) {
		ProductEntity productToUpdate= getById(id);
		productToUpdate.setPrice(product.getPrice());
		
		productRepo.save(productToUpdate);
		
		return productToUpdate;
	}

	@Override
	public ProductEntity deleteProduct(int id) {
		ProductEntity productToDelete= getById(id);
		productRepo.delete(productToDelete);
		return productToDelete;
	}

}
