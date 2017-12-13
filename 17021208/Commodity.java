package com.test;

public class Commodity {
//录入商品信息包含商品编号、名称、价格、初始数量
	private String id;
	private String name;
	private double price;
	private int  number;
	public Commodity() {
		super();
	}
	public Commodity(String id, String name, double price, int number) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return (int) number;
	}
	public void setNumber () {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", price=" + price
				+ ", number=" + number + "]";
	}
	
	
}
