package com.goodstrade;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月5日 下午5:18:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trade {

	private String id;
	private String name;
	private double price;
	private int num;
	Trade() {
	}
	Trade(String id, String name, double price, int num) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.num = num;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Trade [id=" + id + ", name=" + name + ", price=" + price
				+ ", num=" + num + "]";
	}
	
}
