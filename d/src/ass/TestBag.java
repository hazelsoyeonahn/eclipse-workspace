package ass;

import java.util.Scanner;

public class TestBag {
	public static void main(String[] args) {
		
		//generating items
		Object i1 = new String();
		int i2;
		Object i3 = new String();
		int i4;
		float i5;
		String i6;
		
		i1 = "hi";
		i2 = 5;
		i3 = "happy";
		i4 = 71;
		i5 = 0.1F;
		i6 = "Thanks";
		
		//instantiate scanner object
		Scanner s = new Scanner(System.in);
		
		//instantiate ArrayBag with fixed capacity
		System.out.println("You are using fixed capacity ArrayBag");
		ArrayBag a = new ArrayBag();
		
		//add items
		System.out.println("Adding items...");
		a.add(i1);
		a.add(i2);
		a.add(i3);
		a.add(i4);
		a.add(i5);
		a.add(i6);
		
		//grab a random item
		System.out.println("\nGrab a random item...");
		System.out.print(a.grab());
		
		//remove a specific item
		System.out.println("\n\nRemoving specific item...i1");
		a.remove(i1);
		
		//get size of items
		System.out.println("\nGetting the number of itmes...");
		System.out.print(a.size());
		
		//get the remaining capacity
		System.out.println("\n\nGetting remaining capacity...");
		System.out.print(a.capacityRemaining());
		
		//You will get notify that the bag is full when adding too many items
		
		//check if bag is empty
		boolean empty1 = a.isEmpty();
		System.out.println("\n\nChekcing if bag is empty..");
		System.out.print(empty1);
		
		//iterate your items all over
		System.out.println("\n\nIterating all itmes all over...");
		a.iterator();
		
		//returns an array of the same type of all items left
		System.out.println("\nReturning same type of items");
		a.toArray();
		
		//clear all items in the bag
		System.out.println("\nClearing all items...");
		a.clear();
		

		//instantiate ArrayBag with user dependent capacity
		System.out.println("\n************new bag**************");
		System.out.println("\nYou are using user dependent capacity");
		System.out.println("Type how many capacity do you want?");
		int userInput = s.nextInt();
		ArrayBag b = new ArrayBag(userInput);
		
		//add items.
		System.out.println("Adding items...");
		b.add(i1);
		b.add(i2);
		b.add(i3);
		b.add(i4);
		b.add(i5);
		b.add(i6);
		
		//grab a random item
		System.out.println("\nGrab a random item...");
		System.out.print(b.grab());
				
		//remove a specific item
		System.out.println("\n\nRemoving specific item...i1");
		b.remove(i1);
			
		//get size of items
		System.out.println("\nGetting the number of itmes...");
		System.out.print(b.size());
		
		//get the remaining capacity
		System.out.println("\n\nGetting remaining capacity...");
		System.out.print(b.capacityRemaining());
			
		//You will get notify that the bag is full when adding too many items
				
		//check if bag is empty
		boolean empty2 = b.isEmpty();
		System.out.println("\n\nChekcing if bag is empty..");
		System.out.print(empty2);
				
		//iterate your items all over
		System.out.println("\n\nIterating all itmes all over...");
		b.iterator();
				
		//returns an array of the same type of all items left
		System.out.println("\nReturning same type of items");
		b.toArray();
				
		//clear all items in the bag
		System.out.println("\n\nClearing all items...");
		b.clear();
		
		System.out.println("\n************new bag**************");
		//instatiate LinkedBag with fixed capacity
		System.out.println("You are using fixed capacity LinkedBag");
		LinkedBag c = new LinkedBag();
		
		//add items
		System.out.println("Adding items...");
		c.add(i1);
		c.add(i2);
		c.add(i3);
		c.add(i4);
		c.add(i5);
		c.add(i6);
		
		//grab a random item
		System.out.println("\nGrab a random item...");
		System.out.print(c.grab());
						
		//remove a specific item
		System.out.println("\n\nRemoving specific item...i1");
		c.remove(i1);
					
		//get size of items
		System.out.println("\nGetting the number of itmes...");
		System.out.print(c.size());
				
		//get the remaining capacity
		System.out.println("\n\nGetting remaining capacity...");
		System.out.print(c.capacityRemaining());
					
		//You will get notify that the bag is full when adding too many items
						
		//check if bag is empty
		boolean empty3 = c.isEmpty();
		System.out.println("\\n\\nChekcing if bag is empty..");
		System.out.print(empty3);
						
		//iterate your items all over
		System.out.println("\nIterating all itmes all over...");
		c.iterator();
						
		//returns an array of the same type of all items left
		System.out.println("\nReturning same type of items");
		c.toArray();
						
		//clear all items in the bag
		System.out.println("\n\nClearing all items...");
		c.clear();
		
		System.out.println("\n************new bag**************");
		//instantiate LinkedBag with user dependent capacity
		System.out.println("\nYou are using user dependent capacity");
		System.out.println("Type how many capacity do you want?");
		int userInput2 = s.nextInt();
		LinkedBag d = new LinkedBag(userInput2);

		//add items
		System.out.println("Adding items...");
		d.add(i1);
		d.add(i2);
		d.add(i3);
		d.add(i4);
		d.add(i5);
		d.add(i6);
				
		//grab a random item
		System.out.println("\nGrab a random item...");
		System.out.print(d.grab());
								
		//remove a specific item
		System.out.println("\n\nRemoving specific item...i1");
		d.remove(i1);
							
		//get size of items
		System.out.println("\nGetting the number of itmes...");
		System.out.print(d.size());
						
		//get the remaining capacity
		System.out.println("\n\nGetting remaining capacity...");
		System.out.print(d.capacityRemaining());
							
		//You will get notify that the bag is full when adding too many items
								
		//check if bag is empty
		boolean empty4 = d.isEmpty();
		System.out.println("\\n\\nChekcing if bag is empty..");
		System.out.print(empty4);
								
		//iterate your items all over
		System.out.println("\nIterating all itmes all over...");
		d.iterator();
								
		//returns an array of the same type of all items left
		System.out.println("\nReturning same type of items");
		d.toArray();
								
		//clear all items in the bag
		System.out.println("\n\nClearing all items...");
		d.clear();
	}
}
