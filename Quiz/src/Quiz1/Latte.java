package Quiz1;
/*
 * This is a simple child class of Coffee.
 * It contains informations to generate latte order 
 * via parameter in a constructor.
 * 
 * @author Hazel Ahn 16945085
 */

public class Latte extends Coffee{

	public Latte(char size) {
		super(size, "Latte", true, 4.2, CoffeeType.SMOOTH);
	}
	
}
