package com.productapp.vo;

//srp: used to trasfer the data from one layer to another
public class ProductVO {
	private Integer id;
	
	private String name;
	private int price;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ProductVO(Integer id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	public ProductVO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public ProductVO() {}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
