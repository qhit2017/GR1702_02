package com.deal;

public class Deal {
	
	private String id;
	
	private String name;

	private double price;
	
	private double number;

	public Deal(String id, String name, double price, double number) {
		
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

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Deal [id=" + id + ", name=" + name + ", price=" + price
				+ ", number=" + number + "]";
	}
	
	
}
