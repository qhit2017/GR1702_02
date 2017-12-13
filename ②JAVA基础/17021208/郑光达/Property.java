/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月6日 下午6:52:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package com.Test03;

public class Property {
	
	private String id;
	private String name;
	private double price;
	private int number;
	public Property() {
	}
	public Property(String id, String name, double price, int number) {
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
	public int getNumber() {
		return number;
	}

	public void setNumber(int d) {
		this.number = d;
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", name=" + name + ", price=" + price
				+ ", number=" + number + "]";
	}
	

}
