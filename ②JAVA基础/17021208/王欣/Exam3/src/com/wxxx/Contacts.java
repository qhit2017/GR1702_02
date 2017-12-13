package com.wxxx;
/*制作人：王欣
 *日期2017年12月6日时间下午6:42:22
 *邮箱:2408368509@qq.com
 */

public class Contacts {
	private String name;
	private double price;
	private String id;
	private int number;
	public Contacts() {
		super();
	}
	public Contacts(String name, double price, String id, int number) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
		this.number = number;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", price=" + price + ", id=" + id
				+ ", number=" + number + "]";
	}
	
	
}
