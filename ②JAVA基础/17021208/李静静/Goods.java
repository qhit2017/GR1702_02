package lijingjing;

public class Goods {
	private String name;
	private String number;
	private double price;
	private int amount;

	public Goods() {
		
	}

	public Goods(String name, String number, double price, int amount) {
		super();
		this.name = name;
		this.number = number;
		this.price = price;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", number=" + number + ", price="
				+ price + ", amount=" + amount + "]";
	}

}
