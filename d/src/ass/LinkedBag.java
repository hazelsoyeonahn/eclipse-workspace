package ass;
/*
 *This class implements Bag<E> interface
 *This class uses doubly linked list 
 *This class has few method add,grab,remove,size,capaictyRemaining,
 *isFull,isEmpty,clear(uncompleted), iterator(umcompleted),toArray
 */

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class LinkedBag<E> implements Bag<E> {

	//initialize variables
	int capacity;
	int position;
	Random r = new Random();
	E[] bag;
	NodeL<E> firstNode, lastNode = null;
	
	public LinkedBag() {
		capacity = 10;
		position = 0;
	}
	
	public LinkedBag(int capacity) {
		this.capacity = capacity;
		position = 0;
	}
	
	//add item if it can fit it
	@Override
	public boolean add(E item) {
		if(isEmpty()) {
			return false;
		}
		else {
			NodeL newNode = new NodeL(item, lastNode, firstNode);
			if(firstNode != null) {
				newNode = firstNode.next;
				lastNode = newNode;
			}
			else{
			firstNode = newNode;
			lastNode = firstNode;
			}
			position++;
			System.out.println("adding: "+item);
		}
		return true;
	}

	@Override
	public E grab() {
		int index = r.nextInt((position-0) + 1);
		NodeL<E> currentNode = null;
		NodeL<E> movingNode = null;
		if(index == 0) {
			currentNode = firstNode;
		}
		else {
			for(int i=0; i<index; ++i) {
				firstNode.next = currentNode;
				currentNode = firstNode.next;
			}
		}
		return (E)currentNode;
	}

	@Override
	public boolean remove(E item) {
		NodeL<E> removeNode = firstNode;
		for(int i=0; i<capacity; i++) {
			firstNode.next = removeNode;
			firstNode = firstNode.next;
			
			if(removeNode.equals(item)) {
				firstNode = null;
				return true;
			}
		}
		return false;
	}

	//return number of itmes in the bag
	@Override
	public int size() {
		int size = 0;
		NodeL<E> sizeNode = firstNode;
		for(int i=0; i<capacity; i++) {
			firstNode.next = sizeNode;
			firstNode = firstNode.next;
			++size;
		}
		return size;
	}

	//return number of remaining capacity
	@Override
	public int capacityRemaining() {
		return capacity - size();
	}

	//return true if bag is full
	@Override
	public boolean isFull() {
		if(capacityRemaining() == 0) {
			return true;
		}
		return false;
	}

	//return true if bag is empty
	@Override
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
	}

	//iterate all nodes over
	@Override
	public Iterator<E> iterator() {
		NodeL newNode = firstNode;
		while(newNode != null) {
			System.out.println(newNode.element);
			newNode = newNode.next;
		}
		return null;
	}

	@Override
	public E[] toArray() {
		return null;
	}
	

}
