package com.productapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.productapp.repo.ProductDao;
import com.productapp.repo.ProductDaoDsImpl;
import com.productapp.repo.ProductDaoJdbcImpl;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

@Configuration 
@ComponentScan(basePackages = {"com.productapp.repo","com.productapp.service"})
public class AppConfig2 {

}
