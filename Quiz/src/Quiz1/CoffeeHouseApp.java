package Quiz1;
/*
 * 
 * This class can generate the coffee menu and take order from customer.
 * This class print out the coffee menu.
 * This class includes a main method.
 * The customer gets to ask to input their name and coffee order.
 * Then the receipt will print out the coffee order and how much they should pay.
 * 
 * @author Hazel Ahn 16945085
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class CoffeeHouseApp {
	//generating coffee menu
	private static Coffee[] coffeesInMenu = new Coffee[] { new Espresso('S'), new Macchiato('S'), new Latte('S'), new Cappuccino('S'), new Mocha('S') };
	//to scan user input
	private static Scanner userInput = new Scanner(System.in);
	//to round the decimal of price
	private static DecimalFormat decimal = new DecimalFormat("0.##");
	
	//this method print out the menu
	public static void printMenu() {
		String menuString = "-------------Welcome to Coffee House App-------------\n";
	menuString += "-----------------------------------------------------\n";
	menuString += String.format("%25s%12s%12s", "SMALL", "MEDIUM", "LARGE") + "\n";
		menuString += "-----------------------------------------------------\n";
		for (int i = 0; i < coffeesInMenu.length; i++) {
			menuString += String.format("%d. %12s %8.2f %10.2f %12.2f", (i + 1), coffeesInMenu[i],
					coffeesInMenu[i].calculateCost('S'), coffeesInMenu[i].calculateCost('M'),
					coffeesInMenu[i].calculateCost('L')) + "\n";
		}
		menuString += "-----------------------------------------------------";
		System.out.println(menuString);
		}
	
	static char receiptSize;
	static Coffee coffee;
	
	//users get to ask to select a coffee then this method will create 
	//appropriate object by user input.
	public static Coffee userSelection() {
		
		int whatCoffee;
		System.out.println("Please enter a number 1 - 5");
		whatCoffee = userInput.nextInt();
		
		char whatSize;
		System.out.println("Please enter the size: S, M or L");
		whatSize = userInput.next().charAt(0);
		receiptSize = whatSize;
		
		if(whatCoffee == 1) {
			coffee = new Espresso(whatSize);
		}
		else if(whatCoffee == 2) {
			coffee = new Macchiato(whatSize);
		}
		else if(whatCoffee == 3) {
			coffee = new Latte(whatSize);
		}
		else if(whatCoffee == 4) {
			coffee = new Cappuccino(whatSize);
		}
		else if(whatCoffee == 5) {
			coffee = new Mocha(whatSize);
		}
		return coffee;
	}
	static String user;
	
	//this method print out the receipt of the coffee order
	//@param user the name of user
	//@param userCoffee the coffee for the user.
	public static String generateReceipt(String user, Coffee userCoffee) {
		
		return "-------------The Coffee Receipt for "+user+"-------------\n"+"-----------------------------------------------------\n"+"Coffee: "+coffee+"("+coffee.getSize()+")\nThe cost is: "+decimal.format(coffee.calculateCost(receiptSize));
	}
	
	//main method starts from here
	public static void main(String[] args) {
		//printing the menu
		printMenu();
		
		//getting the user name
		System.out.println("Please enter user name");
		user = userInput.nextLine();
		//getting the user's coffee order
		Coffee userCoffee = userSelection();
		//get the receipt for the customer
		System.out.println(generateReceipt(user, userCoffee));
		userInput.close();
	}
}
