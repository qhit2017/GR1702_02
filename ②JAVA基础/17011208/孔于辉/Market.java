package com;

public class Market {
	// 编号、名称、价格、初始数量
	private String id;
	private String name;
	private double price;
	private int number;
	
	

	public Market() {
		
	}

	public Market(String id, String name, double price, int number) {
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

	public double getNumber() {
		return number;
	}

	public void setNumber(double d) {
		this.number = (int) d;
	}

	@Override
	public String toString() {
		return "商品信息 [编号=" + id + ", 名称=" + name + ", 价格=" + price
				+ "元, 数量=" + number + "个]";
	}

}
