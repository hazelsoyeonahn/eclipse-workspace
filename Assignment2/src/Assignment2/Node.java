package Assignment2;
/*
 * This Node class helps LinkedHashMapWithChaining class to have 
 * underlying doubly linked structure
 */

public class Node {
	Node next, prev;
	int data;
	
	//constructor
	public Node(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
}
