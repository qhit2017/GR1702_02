package lishaoqing;

public class Shop {

	private String num;
	private String name;
	private double price;
	private int amount;
	
	
	public Shop() {
		super();
	}


	public Shop(String num, String name, double price, int amount) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
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


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Shop [num=" + num + ", name=" + name + ", price=" + price
				+ ", amount=" + amount + "]";
	}
	
	
}
