package examples;

/**
 * 
 * This class specifies the data to store in Person objects.
 * 
 * @author szolhava
 * */
public class Person {
	
	byte age;
	double weight;
	boolean retired;
	char gender;
	Address address;
	
/**
 * This main method makes an instance of the Person class.
 * 
 * 
 * */
	public static void main(String[] args) 
	{
		
		Person homer = new Person();
		homer.age = 55;
		homer.weight=100.84;
		homer.retired=false;
		homer.gender='M';
		
		Address addr = new Address();		
		addr.name = "Homer Simpson";
		addr.streetNumber = 123;
		addr.suburb = "?";
		addr.city = "Auckland";
		addr.postCode="0001";
		homer.address = addr;
		

	}

}
