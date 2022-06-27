package lectureCode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RightAngleTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first side of Triangle (a)");
		double a = Double.parseDouble(scan.nextLine());
		System.out.println("Enter the first side of Triangle (b)");
		double b = Double.parseDouble(scan.nextLine());
		double c = Math.sqrt((a * a) + (b * b));
		System.out.println("VERY PRECISE Hypotenuse is " + c);
		DecimalFormat formatter = new DecimalFormat("0.##");
		System.out.println("User Friendly Hypotenuse is " + formatter.format(c));
		scan.close();
	}
}
