package examples;

public class Person2 {
	String name;
	int age;
	boolean student;
	char gender;

	public Person2() {

	}

	public Person2(String name, int age, boolean student, char gender) {
		this.name = name;
		this.age = age;
		this.student = student;
		this.gender = gender;
	}

	void makeAnonymous() {
		this.name = "UNKNOWN";
	}

	Person2 oldest(Person2 persons[]) {
		Person2 oldestPerson = this;

		for (int i = 0; i < persons.length; i++)
			if (oldestPerson.age < persons[i].age)
				oldestPerson = persons[i];

		return oldestPerson;

	}

	Person2 oldest(Person2 aPerson, Person2 anotherPerson) {

		return this.oldest(aPerson).oldest(anotherPerson);

	}

	Person2 oldest(Person2 aPerson) {

		if (this.age > aPerson.age) {
			return this;
		} else {
			return aPerson;
		}
	}

	int computeDiscount() {

		if ((this.student) && (this.age >= 10) && (this.age <= 20)) {
			return 50;
		} else {
			return 0;
		}

	}

}