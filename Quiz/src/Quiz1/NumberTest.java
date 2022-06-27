package Quiz1;
/*
 * This class includes the method to count specific number.
 * Put chosen number into parameter to figure out how many 
 * chosen numbers are in the array.
 * 
 * @author Hazel Ahn 16945085
 */

import java.util.ArrayList;
import java.util.Arrays;

public class NumberTest {
	
	//a method to count the chosen number.
	//* @param number the array list
	//* @param value what number to find
	public static int countNumber(ArrayList<Integer> number, int value) {
		int count = 0;
		for(int i = 0; i < number.size(); ++i) {
			if(number.get(i) == value) {
				++count;
			}
		}
		return count;
	}
	
	//main method 
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 3, 7, 3, 10, 11, 12, 18, 3, 25, 45));
		System.out.println(countNumber(nums,3));
	}
	

}
