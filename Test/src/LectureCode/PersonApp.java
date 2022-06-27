package LectureCode;

public class PersonApp {
	public static void main(String[] args) {
		Person aPerson = new Person();
		aPerson.Name = "Bob";
		aPerson.age = 40;
		aPerson.address = new Address();
		System.out.println(aPerson.Name + "- " + aPerson.age + aPerson.address);
	}

}
