package Assignment2;
/*
 * This is a driver class of LinkedHashMapWithChaining and Node class
 * This class contains constructor which is also a value of map 
 * This class instantiate LinkedHashMapWithChaining class to implement
 * underlying doubly linked hash table then map with it in this class
 * This class ask user what they want to do.
 * At very bottom there is unused code to test 
 * LinkedHashMapWithChaining class's functionality.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainHashMap {
	String name;
	
	//constructor for this class
	public MainHashMap(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "-"+name+" ";
	}
	
	public static void main(String[] args) {
		Map<Integer, MainHashMap> map = new HashMap<Integer, MainHashMap>();
		LinkedHashMapWithChaining linkedHash = new LinkedHashMapWithChaining();
		Scanner scan = new Scanner(System.in);
		int operator = 0;
		
		System.out.println("Welcome to LinkedHashMapWithChaining app!!!\n");
		
		//start looping. This will loop even the user inputs out of range
		while(operator != 6) {
		
			System.out.println("Choose the operator you want\n");
			System.out.println("1. insert more key and value");
			System.out.println("2. remove key and value");
			System.out.println("3. print the hash table");
			System.out.println("4. find the value for specific key");
			System.out.println("5. clear all key and value");
			System.out.println("6. quit");
			int userInput = scan.nextInt();
			
			//insert
			if(userInput == 1) {
				System.out.println("Type your key in integer value");
				int key = scan.nextInt(); //will throw error if key is not integer
				linkedHash.insert(key); //put key in linked hash
				
				scan.nextLine();
				
				System.out.println("Type the name to match with they key");
				String sName = scan.nextLine(); //will throw error if name is not String
				map.put(key, new MainHashMap(sName)); //map key and name
			}
			
			//remove
			if(userInput == 2) {
				System.out.println("Type the key you want to remove");
				int key = scan.nextInt();
				linkedHash.remove(key);
				map.remove(key);
			}
			
			//print hash table
			if(userInput == 3) {
				
				System.out.println();
				for(int i=0; i<linkedHash.hashTable.length; i++) {
					System.out.print("At "+ i + ": ");
					
					Node start = linkedHash.hashTable[i];
					
					while(start!=null) {
						System.out.print(start.data+""+map.get(start.data));
						start = start.next;
					}
					System.out.println();
				}

			}
			
			//find value for specific key
			if(userInput == 4) {
				int key = scan.nextInt();
				System.out.println("key: "+key+map.get(key));
			}
			
			//clear all
			if(userInput == 5) {
				linkedHash.clear();
				map.clear();
			}
			
			System.out.print("\n");
		}
		
		
		//testing functionality, delete comment symbol if wish to test
	/*	linkedHash.insert(99);
		linkedHash.insert(23);
		linkedHash.insert(36);
		linkedHash.insert(47);
		linkedHash.insert(80);
		linkedHash.insert(2);
		
		linkedHash.printHashTable();
		linkedHash.insert(92);
		linkedHash.insert(49);
		
		linkedHash.printHashTable();
		
		linkedHash.remove(99);
		linkedHash.printHashTable();
		
		linkedHash.clear();
		linkedHash.printHashTable();
		
		System.out.println(linkedHash.isEmpty());*/
	}
}
