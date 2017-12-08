package kaoshi3;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年12月6日 下午6:23:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Commodity {

	private String number;//编号
	private String name;//名称
	private int price;//价钱
	private int amount;//数量
	public Commodity(String number, String name, int price, int amount) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
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
		return "Commodity [number=" + number + ", name=" + name + ", price="
				+ price + ", amount=" + amount + "]";
	}
	
	
}
