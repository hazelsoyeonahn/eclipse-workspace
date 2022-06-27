package examples;

public class Person2Tester {

	public static void main(String[] args) {








		Person2[] persons = new Person2[]{
				new Person2("Alice",24,true,'F'),
				new Person2("Bob",40,false,'M'),
				new Person2("Carl",0,false,'M'),
				new Person2("Darrin",120,false,'M'),
				new Person2("Eve",20,false,'M'),
				new Person2("Fred",920,false,'M'),
		};



		for(Person2 p1 : persons)
		{
			System.out.println(p1.oldest(persons));
		}

	}
}
