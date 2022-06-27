package examples;
/**
 * 
 * This example demonstrates the usage of an array of primitive data in Java
 * Note how arrays are initialised and data is set and accessed.
 * Use .length to determine how many data elements are in the array
 * As always, array indicies start at 0!  
 * 
 * */
public class IntegerArrayExample {

	public static void main(String[] args) 
	{
	//initialise an array of 5 integer primitives.		
	int[] numbers = new int[5];//what happens when you change 5 to 10?
	
	//store even numbers 2,4,6,8,10...
	for(int i=0;i<numbers.length;i++)
	{
		numbers[i] = (i+1)*2;
		System.out.println(numbers[i]);//print numbers to the screen
	}
	
	//Sum the numbers in the array
	int sum = 0;
	
	for(int i=0;i<numbers.length;i++)
	{
		sum += numbers[i];
	}

	System.out.println("The sum of the numbers is: "+sum);
	
	}

}
