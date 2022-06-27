package lectureCode;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		double sum = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers separated by spaces or commas:");
		String numberList = scan.nextLine();// break up numberList into tokens using specified delimiters
		StringTokenizer tokenizer = new StringTokenizer(numberList, ";,\t ");
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();// convert the string token into a double value
			double number = Double.parseDouble(token);
			sum += number;
		}
		System.out.println("Their sum is " + sum);
		scan.close();
	}
}
