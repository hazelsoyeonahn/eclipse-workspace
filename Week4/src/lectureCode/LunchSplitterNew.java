package lectureCode;

import java.text.NumberFormat;
import java.util.Scanner;

public class LunchSplitterNew {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		System.out.println("Enter total cost for lunch");
		double bill = Double.parseDouble(scan.nextLine());
		System.out.println("Enter number of people at lunch");
		int number = Integer.parseInt(scan.nextLine());
		double costEach = bill / number;
		System.out.println("Each person pays " + currencyFormat.format(costEach));
		scan.close();
	}

}
