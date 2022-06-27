package lectureCode;

public class TimerTest {
	private static final int NUM_ITERATIONS = 100000000;

	public static void main(String[] args) {
		StopWatch intLoopWatch = new StopWatch();
		StopWatch doubleLoopWatch = new StopWatch();
		System.out.println("Timing some loops - please wait");
// time a for loop that iterates using an int counter
		int intDummy;
		intLoopWatch.start();
		for (int i = 0; i < NUM_ITERATIONS; i++)
			intDummy = i * i;
		intLoopWatch.stop();
// time a for loop that iterates using a double counter
		double doubleDummy;
		doubleLoopWatch.start();
		for (double i = 0.0; i < NUM_ITERATIONS; i++)
			doubleDummy = i * i;
		doubleLoopWatch.stop(); // summarize the results
		System.out.println("The for with int counter took " + intLoopWatch.getTime() + " seconds");
		System.out.println("The for loop with double counter took " + doubleLoopWatch.getTime() + " seconds");
	}
}
