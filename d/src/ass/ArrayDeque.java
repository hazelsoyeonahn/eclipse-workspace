package ass;

/* This ArrayDeque<E> class implements DeqeuADT interface provided from COMP610 course
 * This class implements doubly lineked list behavior by using NodeS class
 * This class contains few methods to help iterate queue
 * All method excep toString has O(1) operations.
 */

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayDeque<E> implements DequeADT<E> {
	
	//declare nulElement, frontNode, rearNode
	int numElement;
	NodeS<E> frontNode;
	NodeS<E> rearNode;
	
	//constructor of this class
	public ArrayDeque() {
		numElement = 0;
		frontNode = null;
		rearNode = null;
	}
	
	//constructor for instantiate the collection of E elements
	public ArrayDeque(Collection<? extends E>c) {
		this();
		for(E element: c)
			enqueueRear(element);
	}

	//this method add elements from the rear of the node
	@Override
	public void enqueueRear(E element) {
		NodeS<E> newNode = new NodeS<E>(element);
		
		if(rearNode == null) {
			frontNode = newNode;
			rearNode = newNode;
		}else {
			rearNode.next = newNode;
			rearNode = newNode;
		}
		numElement++;
	}

	//this method removes an element from the front of the element
	//this method throws NoSuchElementException
	@Override
	public E dequeueFront() throws NoSuchElementException {
		if(frontNode != null) {
			E frontElement = frontNode.element;
			frontNode = frontNode.next;
			numElement--;
			if(numElement == 0) {
				rearNode = null;
			}
			return frontElement;
		}
		else {
			throw new NoSuchElementException();
		}
	}
	
	//This method returns first element of the queue
	@Override
	public E first() throws NoSuchElementException{
		if(numElement > 0)
			return frontNode.element;
		else {
			throw new NoSuchElementException();
		}
	}

	//This method returns last element of the queue
	@Override
	public E last() throws NoSuchElementException{
		if(numElement > 0) {
			return rearNode.element;
		}
		else {
			throw new NoSuchElementException();
		}
	}

	//This method enqueue element at the front
	@Override
	public void enqueueFront(E element) {
		NodeS<E> newNode = new NodeS<E>(element);
		if(frontNode == null) {
			frontNode = newNode;
			rearNode = newNode;
		}
		else {
			frontNode.prev = newNode;
			frontNode = newNode;
		}
		++numElement;
		
	}

	//this method remove element from the last of the queue
	@Override
	public E dequeueRear() throws NoSuchElementException{
		if(rearNode != null) {
			E rearElement = rearNode.element;
			rearNode = rearNode.prev;
			numElement--;
			if(numElement == 0) {
				rearNode.next = null;
			}
			return rearElement;
		}
		else {
			throw new NoSuchElementException();
		}
	}

	//This method checks whether any elements are in the deque
	@Override
	public boolean isEmpty() {
		return (numElement==0);
	}

	//This method returns the number of elements in the deque
	@Override
	public int size() {
		return numElement;
	}

	//This method iterate over the elements in the deque.
	@Override
	public Iterator<E> iterator() {
		return new LinkedIterator<E>(frontNode);
	}
	
	//This method print Strings of currentNode
	@Override
	public String toString() {
		String output = "[";
		NodeS currentNode = frontNode;
		while(currentNode != null) {
			output += currentNode.element;
			if(currentNode.next != null)
				output += ",";
			currentNode = currentNode.next;
		}
		output += "]";
		return output;
	}

}
