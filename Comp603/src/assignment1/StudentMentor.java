package assignment1;
/*
 * This class inherited its attributes from Student class.
 * This class implements Booking interface.
 * Student Mentor is a student but also a staff. So, it implements booking interface.
 */
import java.util.Scanner;

public class StudentMentor extends Student implements Booking{
	//attributes
	protected String[] bookingTime = new String[2];
	protected boolean[] available = new boolean[2];
	
	public StudentMentor(String name, int id, char gender, String birthday, String degree) {
		super(name, id, gender, birthday, degree);
		available[0] = true;
		available[1] = true;
	}
	
	public boolean[] getAvailable() {
		return available;
	}
	
	public void setAvailable(boolean[] available) {
		this.available = available;
	}

	public String[] getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(String[] bookingTime) {
		this.bookingTime = bookingTime;
	}
	
	//bookingTime method is implemented here.
	//This method designed specifically for the mentors.
	@Override
	public boolean bookingTime() {
		String message;
		Scanner scan = new Scanner(System.in);
		System.out.println("Select booking");
		System.out.println("Mentoring time availability:");
		
		for(int i=0; i<bookingTime.length; i++) {
			if(available[i])
				message = "available";
			else
				message = "unavailable";
			System.out.println(i+1+". "+bookingTime[i]+": "+message);
		}
		if(available[0] == false && available[1]==false) {
			System.out.println("Booking is full, please try to book next time");
			return false;
		}
		else {
			int select = scan.nextInt();
			if(available[select-1] == true) {
				available[select-1] = false;
				System.out.println("Your booking is successful");
				System.out.println("Please meet your mentor at "+bookingTime[select-1]);
				return true;
				
			}
			else {
				System.out.println("You have selected unavailable booking time");
				return false;
			}
		}
	}

	
	
	

}
