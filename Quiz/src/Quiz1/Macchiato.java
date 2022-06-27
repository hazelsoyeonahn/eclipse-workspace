package Quiz1;
/*
 * This is a simple child class of Coffee.
 * It contains informations to generate macchiato order 
 * via parameter in a constructor.
 * 
 * @author Hazel Ahn 16945085
 */

public class Macchiato extends Coffee {
	public Macchiato(char size) {
		super(size, "Macchiato", true, 3.7, CoffeeType.STRONG);
	}

}
