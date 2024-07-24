package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.entities.ProductEntity;
import com.productapp.repo.ProductRepo;

@SpringBootApplication
public class Productappv1Application implements CommandLineRunner{

	@Autowired
	private ProductRepo productRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Productappv1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepo.save(new ProductEntity("laptop cover", 1200));
		productRepo.save(new ProductEntity("rich data poor dad", 200));
		System.out.println("-============records are added ===========");
		
	}

	//i wnat to insert some records as soon as app start
	//CommandLineRunner
}
