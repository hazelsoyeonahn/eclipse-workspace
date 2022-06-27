package exercises;

public class NumberList {
	
	int[] numberList = new int[10];
	
	NumberList() {
		
		this.numberList[0] = 0;
		this.numberList[1] = 0;
		this.numberList[2] = 0;
		this.numberList[3] = 0;
		this.numberList[4] = 0;
		this.numberList[5] = 0;
		this.numberList[6] = 0;
		this.numberList[7] = 0;
		this.numberList[8] = 0;
		this.numberList[9] = 0;
	}
	
	public int size(){
		return numberList.length;
	}
	
	public String toString() {
		return "Number List:\n"+this.numberList[0]+"\n"+this.numberList[1]+"\n"+this.numberList[2]+"\n"+this.numberList[3]+"\n"+this.numberList[4]+"\n"+this.numberList[5]+"\n"+this.numberList[6]+"\n"+this.numberList[7]+"\n"+this.numberList[8]+"\n"+this.numberList[9];
	}
	
	public boolean valid(int i) {
		for(int x = 0; x < numberList.length; ++x) {
			if (i == numberList[x]) {
				return true;
			}
		}
		return false;
	}
	
	public void update(int index, int value) {	
		numberList[index] = value;
	}
	
	public int min() {
		int min = numberList[0];
		for(int i = 1; i <numberList.length; i++) {
			if(numberList[i] < min) {
				min = numberList[i];
			}
		}
		return min;
	}
	
	public int max() {
		int max = numberList[0];
		for(int i = 1; i <numberList.length; i++) {
			if(numberList[i]>max) {
				max = numberList[i];
			}
		}
		return max;
	}
	
	int x = 0;
	public int nonZero() {
		int returnInt = 0;
		
		for(int i = 0; i <numberList.length; i++) {
			if(numberList[i] != 0) {
				returnInt = numberList[i];
			}
		}
		return returnInt;
	}
	
	public double average() {
		double total = 0;
		double average;
		
		for(int i = 0; i<numberList.length; i++) {
			total = total + numberList[i];
		}
		average = total / numberList.length;
		
		return average;
	}
	
	public int getNumber(int i) {
		int returnInt;
		
		returnInt = numberList[i];
		
		return returnInt;
	}
	
	public void absolute() {
		int i = 0;
		if(!(i >= numberList.length)) {
			Math.abs(numberList[i]);
			++i;
		}
	}
	
	public void scale(int f) {
		for(int i = 0; i < numberList.length; i++) {
			numberList[i] = f * numberList[i];
		}
	}
	
	public NumberList sub(int startIndex,int endIndex) {
		int x = 0;
		for(int i = startIndex; i <= endIndex; i++) {
			numberList[x] = numberList[i];
			++x;
		}
		return this;
	}
}


