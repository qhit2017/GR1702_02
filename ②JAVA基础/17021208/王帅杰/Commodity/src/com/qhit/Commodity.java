package com.qhit;

public class Commodity {

	private String ID;
	private String name;
	private double price;
	private String quantity;
	
	public Commodity() {
		super();
	}

	public Commodity(String iD, String name, double price, String quantity) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	
	@Override
	public String toString() {
		return "Commodity [ID=" + ID + ", name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	
	
	
}
