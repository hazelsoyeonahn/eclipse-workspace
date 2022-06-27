package exercises;

import java.text.NumberFormat;

public class Purchase {
	private String object;
	private double price;
	NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	
	public String toString() {
		return this.getObject()+" "+currencyFormat.format(this.getPrice());
	}
	
	public Purchase(String object, double price) {
		this.object = object;
		this.price = price;
	}
	
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
