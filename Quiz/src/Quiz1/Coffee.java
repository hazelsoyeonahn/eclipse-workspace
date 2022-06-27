package Quiz1;
/*
 * This abstract class is a parent class of the Espresso, Macchiato, Latte,
 * Cappucino, Mocha class. 
 * This class maintains the basic informations for the coffee orders.
 * This class includes the instance variables, constructor, get and set methods
 * ,toString method and a method which calculate the cost of coffee.
 * 
 * @author Hazel Ahn 16945085
 */

public abstract class Coffee {
	private char size;
	private String name;
	private boolean withMilk;
	private double basePrice;
	private CoffeeType type;
	
	//constructor of parent class
	public Coffee(char size, String name, boolean withMilk, double basePrice, CoffeeType type) {
		super();
		this.size = size;
		this.name = name;
		this.withMilk = withMilk;
		this.basePrice = basePrice;
		this.type = type;
	}
	
	//calculate the cost of coffee depends on their sizes.
	public double calculateCost(char size) {
		double cost = 0;
		
		if(size == 'S') {
			cost = basePrice * 1.1; 
		}
		else if(size == 'M'){
			cost = basePrice * 1.25;
		}
		else if(size == 'L'){
			cost = basePrice * 1.75;
		}
		return cost;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isWithMilk() {
		return withMilk;
	}

	public void setWithMilk(boolean withMilk) {
		this.withMilk = withMilk;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public CoffeeType getType() {
		return type;
	}

	public void setType(CoffeeType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return name;
	}
	

}
