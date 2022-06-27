package ass;
/*
 * This ArrayDequeTest is a driver class of ArrayDeque
 * This class add and remove characters from Harry Potter
 * With queue implements using doubly linked list.
 */

public class ArrayDequeTest {
	public static void main(String args[]) {
		
		//instantiate ArrayDeque object
		ArrayDeque a = new ArrayDeque();
		
		//testing enqueueRear method
		System.out.println("Harry, Ron, Sirius and Herminone are adding at enqueueRear...");
		a.enqueueRear("Harry");
		a.enqueueRear("Ron");
		a.enqueueRear("Sirius");
		a.enqueueRear("Hermione");
		
		System.out.println("\n\nWhat is the first element?");
		System.out.print(a.first());
		
		System.out.println("\n\nWhat is the last element?");
		System.out.print(a.last());
		
		System.out.println("\n\nRemoving Harry and Ron...");
		//Harry and Ron has been removed
		a.dequeueFront();
		a.dequeueFront();
		
		System.out.println("\n\nGregory and Argus are adding at enqueueFront...");
		//testing enqueueFront method
		a.enqueueFront("Gregory");
		a.enqueueFront("Argus");
		
		System.out.println("\n\nRemoving Hermione...");
		//Hermione has been removed
		a.dequeueRear();
		
		//check if the queue is empty
		Boolean b = a.isEmpty();
		System.out.print("\n\nIs queue empty? "+b);
		
		//check intSize
		int size = a.size();
		System.out.print("\n\nThe size of queue is "+size);
		
		//check currentNode
		System.out.print("\n\nThe currentNode is "+a.toString());
	}
}
