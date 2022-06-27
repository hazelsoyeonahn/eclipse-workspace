package lectureCode;

public class StopWatch {
	private double startTime = 0.0, stopTime = 0.0;
	private boolean isStarted;

	public StopWatch() {
		isStarted = false;
	}

	public StopWatch(boolean start) {
		isStarted = false;
		if (start)
			start();
	}

	public void start() {
		if (!isStarted) {
			isStarted = true;
			startTime = System.currentTimeMillis();
		}
	}

	public void stop() {
		if (isStarted) {
			isStarted = false;
			stopTime = System.currentTimeMillis();
		}
	}

	public double getTime() {
		if (isStarted)
			return (System.currentTimeMillis() - startTime) / 1000.0;
		return (stopTime - startTime) / 1000.0;
	}
}