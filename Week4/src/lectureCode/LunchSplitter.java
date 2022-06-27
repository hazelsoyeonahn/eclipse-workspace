package lectureCode;

import java.util.Scanner;

public class LunchSplitter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total cost for lunch");
		double bill = Double.parseDouble(scan.nextLine());
		System.out.println("Enter number of people at lunch");
		int number = Integer.parseInt(scan.nextLine());
		double costEach = bill / number;
		System.out.println("Each person pays " + costEach);
		scan.close();
	}
}
