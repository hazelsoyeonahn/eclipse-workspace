package exercises;

import java.text.NumberFormat;

/**
 * This is a description of the BasketApp class.
 * It is going to store shopping list informations.
 * Use Basket method to input the number of array.
 * Use addPurchase method to input your shopping list.
 * Use getNpurchase to get a number of items.
 * Use getMostExpensive to find the most expensive item.
 * Use total method to find total price.
 * Use printReceipt to print receipt.
 * 
 * @author Hazel Soyeon Ahn
 */

public class BasketApp {
	public static void main(String[] args) {
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		
		//Decide how many new Basket object you want to make and input it in the parameter
		Basket basket = new Basket(7);
		
		//Input your items
		basket.addPurchase(new Purchase("Book", 5.99));
		basket.addPurchase(new Purchase("Onion", 0.80));
		basket.addPurchase(new Purchase("Soap", 4.00));
		basket.addPurchase(new Purchase("Toilet Paper", 7.99));
		basket.addPurchase(new Purchase("Cheese", 8.70));
		basket.addPurchase(new Purchase("Tomato", 0.99));
		basket.addPurchase(new Purchase("Bagle", 5.50));
		
		//find out the number of purchase
		System.out.print("The number of purchased item: "+basket.getNpurchases()+"\n");
		
		//find out the most expensive item
		System.out.print("The most expensive item: "+basket.getMostExpensive()+"\n");
		
		//returns an array of purchase
		System.out.print(basket.getPurchases()+"\n");
		
		//find out the total price
		System.out.print("The total price: "+currencyFormat.format(basket.total())+"\n\n");
		
		//print receipt
		basket.printReceipt();
		
	}

}
