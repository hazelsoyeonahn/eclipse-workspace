package lectureCode;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random rand = new Random();
		int num1;
		float num2;

		num1 = rand.nextInt();
		System.out.println("A random integer: " + num1);

		num1 = rand.nextInt(10);
		System.out.println("From 0 to 9: " + num1);

		num1 = rand.nextInt(10) + 1;
		System.out.println("From 1 to 10: " + num1);

		num1 = rand.nextInt(15) + 20;
		System.out.println("From 20 to 34 " + num1);

		num2 = rand.nextFloat();
		System.out.println("A random float (0-1):" + num2);

		num2 = rand.nextFloat() * 6;// 0.0 - 5.999999
		num1 = (int) num2 + 1;
		System.out.println("From 1 to 6: " + num1);
		System.out.println("Coin Toss:" + (rand.nextBoolean() ? "Heads" : "Tails"));
	}
}
