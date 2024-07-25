package com.productapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.productapp.repo.ProductDao;
import com.productapp.repo.ProductDaoDsImpl;
import com.productapp.repo.ProductDaoJdbcImpl;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

@Configuration //hey this is a config class , that will mange the dep
public class AppConfig {

    //object whose life cycle  is manged by spring
    @Bean
    public ProductDao productDao() {
		return new ProductDaoJdbcImpl();
	}

   // @Scope("prototype")
	@Bean
	public ProductService productService(ProductDao dao) {
		return new ProductServiceImpl(dao);
	}
}
