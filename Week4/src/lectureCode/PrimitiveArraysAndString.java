package lectureCode;

import java.util.Scanner;
/**
 * examples of primitive arrays and strings
 * 
 * @author szolhava
 *
 */
public class PrimitiveArraysAndString {

	int[] highScores = new int[10];

	/**
	 * Counts the instances of x in an array
	 * 
	 * @param numbers, an array of integers
	 * @param a        value x to count
	 * @return number of times x appears in numbers
	 * 
	 */
	public static int countNumber(int[] numbers, int x) {
		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == x) {
				numbers[i] += 10;
				counter++;
			}
		}
		return counter;

	}

	public void printScores() {
		for (int i = 0; i < highScores.length; i++)
			System.out.println(highScores[i]);
	}

	public void printScores2() {
		for (int score : highScores)
			System.out.println(score);
	}

	public void inputHighScores() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input " + highScores.length + " high scores: ");
		for (int i = 0; i < highScores.length; i++)
			highScores[i] = scan.nextInt();
		this.printScores();
		scan.close();
	}

	static public int[] calculateEvens(int n) {
		int[] evens = new int[n];
		for (int i = 0; i < n; i++)
			evens[i] = 2 * (i + 1);
		return evens;
	}

	public int getHighScore() {
		int max = highScores[0];
		for (int i = 1; i < highScores.length; i++)
			if (highScores[i] > max)
				max = highScores[i];
		return max;
	}

	public static void printArray(int[][] grid) {
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++)
				System.out.print(grid[r][c] + ", ");
			System.out.println();
		}
	}

	public String toUpperCase(String s) {
		String output = "";
		for (char ch : s.toCharArray())
			output += (ch >= 'a') && (ch <= 'z') ? (char) (ch - 32) : ch;
		return output;
	}

	public String reverse(String s) {
		String output = "";
		for (int i = s.length() - 1; i >= 0; i--)
			output += s.charAt(i);
		return output;
	}

	public static String[] meetingBookingInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter commands into the console:");
		String inputString = scanner.nextLine();
		String[] tokens = inputString.split(" ");
		for (String t : tokens)
			System.out.println(t);
		scanner.close();
		return tokens;
	}

	public static void main(String[] args) {
		int[] numbers = new int[4];

		numbers[0] = 1;
		numbers[1] = 3;
		numbers[2] = 3;
		numbers[3] = 100;

		int count = countNumber(numbers, 3);
		System.out.println(count);

		int[][] grid = new int[4][3];
		grid[2][2] = 5;
	}

}
