package exercises;

public class NumberListTest {
	public static void main(String[] args) {
		
		NumberList numberList = new NumberList();
		
		System.out.println("Number of list: "+numberList.size()+"\n");
		
		//true if an input index is in the range of the list, otherwise false
		System.out.println("\ninput index validation: "+numberList.valid(5));
		
		//updates the ith number of the array to value.
		numberList.update(0, 2);
		numberList.update(1, 1);
		numberList.update(2, 0);
		numberList.update(3, 0);
		numberList.update(4, 98);
		numberList.update(5, 23);
		numberList.update(6, 21);
		numberList.update(7, 0);
		numberList.update(8, 8);
		
		//print the number of list
		System.out.println(numberList);
		
		//find minimum value
		System.out.println("Minimum: "+numberList.min());
		
		//find maximum value
		System.out.println("Maximum: "+numberList.max());
		
		//get an array of non-zero values//need to fix one integer to whole
		System.out.println("None zero values: "+numberList.nonZero());
		
		//find average value
		System.out.println("Average: "+numberList.average());
		
		//make the value absolute
		numberList.absolute();
		
		//scale the value by 2 yields
		numberList.scale(2);
		
		//Choose start index to end index that you want to print
		System.out.println("Your chosen index: "+numberList.sub(3, 7));
	}

}
