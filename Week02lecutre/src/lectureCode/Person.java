package lectureCode;

public class Person {
	String name;
	int age;
	char gender;
	boolean student;
	Address address;
	
	public Person() {
		name = "UNKNOWN";
	}
	
	public Person(String name, int age, char gender, boolean student, Address address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.student = student;
		this.address = address;
	}
}
