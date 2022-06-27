package Quiz1;
/*
 * This is a simple child class of Coffee.
 * It contains informations to generate mocha order 
 * It includes a method to check if chocolate is included or not.
 * via parameter in a constructor.
 * 
 * @author Hazel Ahn 16945085
 */

public class Mocha extends Coffee{
	private boolean withChocolate;
	
	public Mocha(char size) {
		super(size, "Mocha", true, 4.5, CoffeeType.SMOOTH);
	}

	public boolean isWithChocolate() {
		return withChocolate;
	}

	public void setWithChocolate(boolean withChocolate) {
		this.withChocolate = withChocolate;
	}
	

}
