package ass;
/*
 * This interface Bag implements <E> generic type.
 * This interface contains abstact methods.
 * 
 */
import java.util.Iterator;

public interface Bag<E>{
	
	//add item if it can fit it.
	boolean add(E item);
	
	//The only way to get an item in the bag
	//which gives back an item in the bag at random
	E grab();
	
	//remove a specific item from the bag
	boolean remove(E item);
	
	//giving the number of items in the bag
	int size();
	
	//returns how many items can still be added to bag
	//before it is full.
	int capacityRemaining();
	
	//return true if the bag is full
	boolean isFull();
	
	//return true if the bag is empty
	boolean isEmpty();
	
	//removes all items from the bag.
	void clear();
	
	//allowas items to be iterated over
	Iterator<E> iterator();
	
	//returns an array of the same type of all itmes left in the bag
	E[] toArray();
}
