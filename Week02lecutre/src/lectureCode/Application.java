package lectureCode;

public class Application {
	public static void main(String[] args) {
		Person person1 = new Person("James", 20, 'M', true, new Address(40, "Wellesley", "CBD" ,"Auckland", 1010));
		
		System.out.println("Person 01: " + person1.name + " - " + person1.gender);
	
	}

}
