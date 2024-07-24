package com.productapp.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.productapp.dto.ErrorDetails;
import com.productapp.excpetions.ProductNotFoundException;

@RestControllerAdvice
public class ExHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorDetails> handle404(Exception ex, WebRequest req){
		ErrorDetails details=new ErrorDetails();
		details.setDate(new Date());
		details.setDetails(req.getDescription(true));
		details.setName("rgupta.mtech@gmail.com");
		details.setDetails(ex.toString());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(details);
	}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handle500(Exception ex, WebRequest req){
		ErrorDetails details=new ErrorDetails();
		details.setDate(new Date());
		details.setDetails(req.getDescription(true));
		details.setName("rgupta.mtech@gmail.com");
		details.setDetails(ex.toString());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(details);
	}

//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ErrorDetails> handle500(Exception ex, WebRequest req){
//		ErrorDetails details=new ErrorDetails();
//		details.setDate(new Date());
//		details.setDetails(req.getDescription(true));
//		details.setName("rgupta.mtech@gmail.com");
//		details.setDetails(ex.toString());
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(details);
//	}

}