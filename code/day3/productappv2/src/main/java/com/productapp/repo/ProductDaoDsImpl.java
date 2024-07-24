package com.productapp.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Repository
@Primary
public class ProductDaoDsImpl implements ProductDao {
	@Override
	public List<Product> getProducts() {
		System.out.println("------------collection impl of Dao----");
		Product p1=new Product(1, "laptop cover", 340) ;
		Product p2=new Product(67, "monk who sold the farrari", 240) ;
		return Arrays.asList(p1, p2);
	}
}
