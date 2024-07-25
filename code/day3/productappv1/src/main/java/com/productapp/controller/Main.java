package com.productapp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.productapp.config.AppConfig;
////import com.productapp.config.AppConfig;
//import com.productapp.config.AppConfig2;
import com.productapp.repo.Product;
import com.productapp.repo.ProductDao;
import com.productapp.repo.ProductDaoDsImpl;
import com.productapp.repo.ProductDaoJdbcImpl;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		// :<
		
		//Spring DI and IOC (Inversion of control container ) container 
		
		//rather the programmer is creating the object of dao and assigning to service (pull)
		//service is being injected with dao with the help of a famework : spring 
		//i need to teach spring how to do that
		
		// xml(outdated) vs annotation and java config
		
//		ProductDao productDao=new ProductDaoDsImpl();
//		ProductService productService=new ProductServiceImpl(productDao);
//	
//		List<Product> products = productService.getProducts();
//		products.forEach(p-> System.out.println(p));
		
		//i will use spring container .
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductService productService1=ctx.getBean("productService", ProductService.class);
		ProductService productService2=ctx.getBean("productService", ProductService.class);
		System.out.println(productService1);
		System.out.println(productService2);
		
//		List<Product> products = productService.getProducts();
//		products.forEach(p-> System.out.println(p));
	}

}
