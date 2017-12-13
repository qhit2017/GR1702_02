package com.stock;

public class Stock {

	private String name;
	private String id;
	private double price;
	private int quantity;
	
	public Stock(String name, String id, double price, int quantity) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", id=" + id + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
}
