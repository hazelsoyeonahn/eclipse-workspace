import java.util.Arrays;

public class sort {	
	
	void sortArray(int numbers[]) {
	
		for(int i = 0; i < numbers.length - 1; i++) {
			int min = i;
			
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[j] < numbers[min]) {
					min = j;
				}
			}
			
			//Temporarily to print out
			int temp = numbers[i];
			numbers[i] = numbers[min];
			numbers[min] = temp;
		}
		
	}
	
	public static void main(String[] args) {
		int[] inputNumber = { 6, 26, 1, 2, 8};
		sort s = new sort();
		s.sortArray(inputNumber);
		System.out.println(Arrays.toString(inputNumber));	
	}
}