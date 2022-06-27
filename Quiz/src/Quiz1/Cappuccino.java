package Quiz1;
/*
 * This is a simple child class of Coffee.
 * It contains informations to generate cappucino order 
 * via parameter in a constructor.
 * 
 * @author Hazel Ahn 16945085
 */

public class Cappuccino extends Coffee {
	
	public Cappuccino(char size) {
		super(size, "Cappucino", true, 4.3, CoffeeType.SMOOTH);
	}

}
