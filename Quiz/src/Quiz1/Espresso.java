package Quiz1;
/*
 * This is a simple child class of Coffee.
 * It contains informations to generate espresso order 
 * via parameter in a constructor.
 * 
 * @author Hazel Ahn 16945085
 */

public class Espresso extends Coffee{
	public Espresso(char size) {
		super(size, "Espresso", false, 2.4, CoffeeType.STRONG);
	}

}
