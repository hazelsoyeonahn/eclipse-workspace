package exercises;

public class SimpleDate {
	private int day;
	private int month;
	private int year;
	
	public void setDate(int day, int month, int year) {
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}
	
	SimpleDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	SimpleDate(){
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	
	public String toString(){
		return day+"/"+month+"/"+year;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(0 < day && day < 32) {
		this.day = day;	
		}
		else {
		this.day = 0;	
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if(0 < month && month < 13) {
		this.month = month;
		}
		else {
		this.month = 0;	
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if(1999 < year && year < 2021) {
			this.year = year;	
		}
		else {
		this.year = 0;	
		}	
	}
}
