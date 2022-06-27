package Assignment2;
/*
 * This class is designed to be underlying doubly linked hash table
 * This class only manages the hash table not related to the mapping
 * The hash table has load factor of <75% and maintains hash code of the key
 * This class resolve any collision with chaining. 
 */

public class LinkedHashMapWithChaining {
	Node[] hashTable;
	MainHashMap main;
	//size of hashTable
	int size;
	int hashTableSize = 4;
	
	//constructor for this class
	public LinkedHashMapWithChaining() {
		hashTable = new Node[hashTableSize];
		this.size = 0;
	}
	
	//insert method with parameter of key value
	public void insert(int key) {
		size++;
		int position = hash(key);
		
		Node node = new Node(key);
		Node start = hashTable[position];
		if (hashTable[position] == null)
			hashTable[position] = node;
		else {
			node.next = start;
			start.prev = node;
			hashTable[position] = node;
		}
		loadFactor(); //after adding check the load factor
	}
	
	//remove method with parameter of key value
	public void remove(int key) {
		try {
			int position = hash(key);
			
			Node start = hashTable[position];
			Node end = start;
			
			//if value is found
			if(start.data == key) {
				size--;
				if(start.next == null) {
				hashTable[position] = null;
				return;
				}
			start = start.next;
			start.prev = null;
			hashTable[position] = start;
			return;	
			}
			
			//traversing
			while(end.next != null && end.next.data != key)
				end = end.next;
			
			//when value not found
			if(end.next == null) {
				System.out.println("\nElement not found\n");
			}
			
			size--;
			
			if(end.next.next == null) {
				end.next = null;
				return;
			}
			
			end.next.next.prev = end;
			end.next = end.next.next;
			
			hashTable[position] = start;
		}
		catch(Exception e) {
			System.out.println("\nElement not found\n");
		}
		
	}
	
	//clear all elements
	public void clear() {
		int capacity = hashTable.length;
		
		//declare new hash table to delete all elements
		hashTable = new Node[hashTable.length];
		size = 0;
	}
	
	public int getSize() {
		int gSize = 0;
		for(int i=0; i<hashTable.length; i++) {
			Node start = hashTable[i];
			while(start!=null) {
				gSize++;
				start= start.next;
			}
		}
		return gSize;
	}
	
	//check if table is empty
	public boolean isEmpty() {
		return size==0;
	}
	
	//check loadFactor. It will continue be called by insert method
	//until the loadFactor is satisfied
	public void loadFactor() {
		int count = 0;
		for(int i=0; i<hashTable.length; i++) {
			if(hashTable[i]!=null)
				++count;
		}
		
		double loadFactor = (double)count/(double)hashTableSize;
		if(loadFactor>= 0.75) {
			//make an temp array of hashcode value
			int[] temp = new int[getSize()];
			int countTemp = 0;
			for(int i=0; i<hashTable.length; i++) {
				Node start = hashTable[i];
		
				while(start != null){
					temp[countTemp] = start.data;
					start = start.next;
					++countTemp;
				}
			}
			//expand capacity
			hashTableSize *=2;
			hashTable = new Node[hashTableSize];
			//save back the integer to newly sized hashTable
			for(int i=0; i<temp.length; ++i) {
				insert(temp[i]); //recursive until the load faactor satisfied
			}
		}
	}
	
	//create the hash code using modula
	private int hash(Integer n) {
		int hashValue = n.hashCode();
		
		hashValue %= hashTable.length;
	
		if(hashValue < 0)
			hashValue += hashTable.length;
		return hashValue;
	}
	
	//print the hash table just with key
	public void printHashTable() {
		System.out.println();
		for(int i=0; i<hashTable.length; i++) {
			System.out.print("At "+ i + ": ");
			
			Node start = hashTable[i];
			
			while(start!=null) {
				System.out.print(start.data + " ");
				start = start.next;
			}
			System.out.println();
		}
	}

}
