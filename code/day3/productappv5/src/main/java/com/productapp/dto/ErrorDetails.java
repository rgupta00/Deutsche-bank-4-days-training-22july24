package com.productapp.dto;

import java.util.Date;

public class ErrorDetails {
	private String message;
	private String details;
	
	private String name;
	private Date date;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ErrorDetails(String message, String details, String name, Date date) {
		super();
		this.message = message;
		this.details = details;
		this.name = name;
		this.date = date;
	}
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
