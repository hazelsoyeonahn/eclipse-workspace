package ass;

import java.util.Iterator;
import java.util.Random;

public class ArrayBag<E> implements Bag<E> {
	
	//initialise variables
	int capacity;
	int position = -1;
	E[] bag;
	//generate random
	Random r = new Random();
	
	public ArrayBag() {
		capacity = 10;
		bag = (E[]) new Object[capacity];
	}
	
	public ArrayBag(int capacity) {
		this.capacity = capacity;
		bag = (E[]) new Object[capacity];
	}
	
	//add item if it can fit.
	@Override
	public boolean add(E item) {
		if(isFull()) {
			System.out.println("Cannot add an item. The bag is full.");
			return false;
		}
		else {
			bag[++position] = item;
			System.out.println("The item has benn added");
			return true;
		}
	}

	//The only way to get an item in the bag
	//This method grabs an random item from the bag.
	@Override
	public E grab() {
		int index = r.nextInt((position - 0) + 1);
		return bag[index];
	}

	//This method removes a specific item.
	@Override
	public boolean remove(E item) {
		for(int i=0; i<capacity; i++) {
			if(bag[i].equals(item)) {
				bag[i] = null;
				System.out.println("Item removed");
				return true;
			}
		}
		System.out.println("Item not found");
		return false;
	}

	//This method returns the size of bag as integer.
	@Override
	public int size() {
		int count = 0;
		for(int i=0; i<capacity; i++) {
			if(bag[i] != null) {
				++count;
			}
		}
		return count;
	}

	//This method returns the remaining capacity of the bag
	@Override
	public int capacityRemaining() {
		int count = 0;
		for(int i=0; i<capacity; i++) {
			if(bag[i] == null) {
				++count;
			}
		}
		return count;
	}

	//This method returns true if bag is full
	@Override
	public boolean isFull() {
		return position == bag.length;
	}

	//This method returns true if bag is empty
	@Override
	public boolean isEmpty() {
		int count = 0;
		for(int i=0; i<capacity; i++) {
			if(bag[i] == null) {
				count++;
			}
		}
		if(count == 10) {
			return true;
		}
		return false;
	}

	//This method clears all items in the bag
	@Override
	public void clear() {
		for(int i=0; i<position; ++i) {
			bag[i] = null;
		}
		System.out.println("The bag is cleared");
	}

	//This method allows the items to be iterated over
	@Override
	public Iterator<E> iterator() {
		System.out.println("Item has been iterated");
		return new ArrayIterator<E>(bag,position);
	}

	//This method returns an array of the same type of all items
	@Override
	public E[] toArray() {
		E[] returnThis = (E[]) new Object[capacity];
		int count = 0;
		
		for(int i=1; i<position; ++i) {
		
		}
		return returnThis;
	}

}
