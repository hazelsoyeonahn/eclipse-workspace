package assignment1;
/*
 * This class is a driver class of this application.
 * Information Center Application is built for university staff member who works for Student Hub.
 * This application is used when staffs are trying to help university students.
 * This application allows the staffs to search student information 
 * and have few more functionality to help student to provide services in university.
 * Such as booking peer mentor and student ambassadors for students.
 * Or help them enroll or withdraw papers.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class InformationCenterApp {	
	//this method returns Student object in the list by name
	public static Student findStudentName(String name, ArrayList<Student> st) {
		for(Student stList : st) {
			if(stList.getName().equals(name)) {
				return stList;
			}
		}
		return null;
	}
	
	//this method returns Student object in the list by id
	public static Student findStudentId(int id, ArrayList<Student> st) {
		for(Student stList : st) {
			if(stList.getId() == id) {
				return stList;
			}
		}
		return null;
	}
	
	//this method returns true if student trying to enroll same paper again
	public static boolean isPaperDuplicated(String newPaperName, ArrayList<Paper> p) {
		for(Paper pList: p) {
			if(pList.getCode().equals(newPaperName))
				return true;
		}
		return false;
	}
	
	//this method finds the matching paper code and returns its index number. 
	//It returns 5, if paper can not be find.
	public static int findPaperIndex(String paperName) {
		int index;
		if(paperName.equals("COMP500"))
			return 0;
		if(paperName.equals("COMP503"))
			return 1;
		if(paperName.equals("INFS600"))
			return 2;
		if(paperName.equals("COMP610"))
			return 3;
		if(paperName.equals("COMP603"))
			return 4;
		return 5;
	}
	
	//this method returns the mentor who have completed the requested paper
	public static StudentMentor findMentor(Paper p, ArrayList<Student> st, Student needMentor) {
		//make sure mentors cannot be booked by themselves
		if(!needMentor.equals(st.get(18))) {
			if(st.get(18).getPaperList().contains(p))
			return (StudentMentor)st.get(18);
		}
		if(!needMentor.equals(st.get(19))) {
			if(st.get(19).getPaperList().contains(p))
			return (StudentMentor)st.get(19);
		}		
		return null;
	}

	//main method
	public static void main(String args[]) throws FileNotFoundException {
		ArrayList<Student> student = new ArrayList<Student>();
		//add students
		student.add(new Student("Edna Mode",1200423,'F',"15/10/98","BSC"));
		student.add(new Student("Randle McMurphy", 9827773, 'M',"19/12/99","BCIS"));
		student.add(new Student("Optimus Prime", 1428333,'M',"21/02/99","BSC"));
		student.add(new Student("Norman Bates", 2322211,'M',"04/10/20","BSC"));
		student.add(new Student("Sergio Pablos", 7876661,'M',"10/10/95","MSC"));
		student.add(new Student("Russell Crowe", 9283311,'M', "14/12/98","MCIS"));
		student.add(new Student("Christina Ricci", 8939211,'F',"01/01/99","BSC"));
		student.add(new Student("Douglas Rain",2553332,'M',"14/03/20","BEN"));
		student.add(new Student("Linda Blair", 2433312,'F',"11/12/98","BEN"));
		student.add(new Student("Shannon Whirry", 1425513,'F',"03/02/95","BCIS"));
		student.add(new Student("Bobbie Phillips", 1321222,'F',"04/05/93","MEN"));
		student.add(new Student("Tatyana Ali", 1123511,'F',"10/10/99","BSC"));
		student.add(new Student("Pam Grier",5623411,'F',"19/02/20","MSC"));
		student.add(new Student("Keshia Pulliam",2531112,'F',"26/04/96","BCIS"));
		student.add(new Student("Sofia Vergara", 2143312,'F',"25/07/99","BCIS"));
		student.add(new Student("Salma Hayek", 2314222,'F',"25/11/94","BCIS"));
		student.add(new StudentAmbassador("Leonardo DiCaprio",1522132,'M',"11/01/20","BSC"));
		student.add(new StudentAmbassador("Anthony Hopkins",1115292,'M',"02/03/97","DSC"));
		student.add(new StudentMentor("Al Pacino",5233111,'M',"12/07/95","BSC"));
		student.add(new StudentMentor("Morgan Freeman",2911292,'M',"12/25/94","BCIS"));
		
		//Create list of students text file
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream("out.txt"));
			for(Student stList: student) {
				pw.println(stList.getName()+" "+stList.getId());
			}
			pw.close();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//there are 5 available papers
		Paper[] aPaper = new Paper[5];	
		aPaper[0] = new Paper("COMP500");
		aPaper[1] = new Paper("COMP503");
		aPaper[2] = new Paper("INFS600");
		aPaper[3] = new Paper("COMP610");
		aPaper[4] = new Paper("COMP603");
		
		//some students are enrolled in papers
		student.get(0).addPaper(aPaper[0]);student.get(0).addPaper(aPaper[1]);
		student.get(2).addPaper(aPaper[0]);student.get(2).addPaper(aPaper[4]);
		student.get(4).addPaper(aPaper[1]);student.get(4).addPaper(aPaper[1]);
		student.get(5).addPaper(aPaper[0]);student.get(5).addPaper(aPaper[1]);
		student.get(5).addPaper(aPaper[2]);student.get(5).addPaper(aPaper[3]);
		student.get(7).addPaper(aPaper[3]);student.get(8).addPaper(aPaper[2]);
		
		//mentors done most of the papers
		student.get(18).addPaper(aPaper[0]);student.get(18).addPaper(aPaper[1]);
		student.get(18).addPaper(aPaper[2]);student.get(18).addPaper(aPaper[4]);
		student.get(19).addPaper(aPaper[0]);student.get(19).addPaper(aPaper[1]);
		student.get(19).addPaper(aPaper[2]);student.get(19).addPaper(aPaper[3]);

		
		//completed papers are always graded
		//integer parameter indicate the index number of paperList
		student.get(18).gradePaper(aPaper[0], Grade.A); student.get(18).gradePaper(aPaper[1], Grade.APLUS);
		student.get(18).gradePaper(aPaper[2], Grade.AMINUS);student.get(18).gradePaper(aPaper[4], Grade.A); 
		student.get(19).gradePaper(aPaper[0], Grade.APLUS);student.get(19).gradePaper(aPaper[1], Grade.APLUS); 
		student.get(19).gradePaper(aPaper[2], Grade.BPLUS);student.get(19).gradePaper(aPaper[3], Grade.A); 
		
		//set available booking time for ambassadors and mentors
		String[] ambassador1 = new String[2];
		String[] ambassador2 = new String[2];
		String[] mentor1 = new String[2];
		String[] mentor2 = new String[2];
		ambassador1[0] = "Monday, 12:00pm - 2:00pm";
		ambassador1[1] = "Friday, 10:00am - 12:00pm";
		ambassador2[0] = "Tuesday, 3:00pm - 5:00pm";
		ambassador2[1] = "Wednesday, 11:00am - 1:00pm";
		mentor1[0] = "Wednesday, 2:00pm - 4:00pm";
		mentor1[1] = "Friday, 3:00pm - 5:00pm";
		mentor2[0] = "Monday, 2:00pm - 4:00pm";
		mentor2[1] = "Thursday, 11:00am - 1:00pm";
		
		((StudentAmbassador)student.get(16)).setBookingTime(ambassador1); //set for Leonardo
		((StudentAmbassador)student.get(17)).setBookingTime(ambassador2); //set for Anthony
		((StudentMentor)student.get(18)).setBookingTime(mentor1); //Set for Al
		((StudentMentor)student.get(19)).setBookingTime(mentor2); //Set for Morgan
		
		//The Information Center Application starts here
		int userInput = 0;		
		Scanner scan = new Scanner(System.in);
		
		while(userInput!=4) {
			System.out.println("Welcome to Student Information Center");
			System.out.println("1.Add new student");
			System.out.println("2.Find student");
			System.out.println("3.List of student");
			System.out.println("4.Quit");
			userInput = scan.nextInt();
			scan.nextLine();
			
			//add new student
			if(userInput == 1) {
				String name = "";
				int id = 0;
				char gender = 0;
				String birthday = "";
				String degree = "";
				
				System.out.println("Name: ");
				name = scan.nextLine();
				System.out.println("Id: ");
				id = scan.nextInt();
				System.out.println("Gender: ");
				gender = scan.next().charAt(0);
				System.out.println("Birthday: ");
				birthday = scan.nextLine();
				scan.nextLine();
				System.out.println("Degree: ");
				degree = scan.nextLine();
				
					//add new student name and id to the text file
					pw = new PrintWriter(new FileOutputStream("out.txt",true));
					pw.println(name+" "+id);
					pw.close();

				student.add(new Student(name,id,gender,birthday,degree));
			}
			//find student
			else if(userInput == 2) {
				System.out.println("Find student by 1.name or 2.id");
				int find = scan.nextInt();
				Student findedSt = null;
	
				if(find == 1) {
					scan.nextLine();
					boolean nameFound = false;
					while(!nameFound){
						System.out.println("Type name: ");
						String findName = scan.nextLine();
						findedSt = findStudentName(findName,student);
					
						if(findedSt == null) {
							System.out.println("Student not found, enter accurate name");
						}	
						else{
							System.out.println("Student found: ");
							System.out.println(findedSt);
							nameFound = true;
						}
					}
				}
				else if(find == 2) {
					scan.nextLine();
					boolean idFound = false;
					while(!idFound) {
						System.out.println("Type id: ");
						int findId = scan.nextInt();
						findedSt = findStudentId(findId,student);
						if(findedSt == null) {
							System.out.println("Student not found, enter accurate id");
						}	
						else{
							System.out.println("Student found: ");
							System.out.println(findedSt+"\n");
							idFound = true;
						}
					}
				}
				
				find = 0;
				//if student is found, you can operate this functions
				System.out.println("\nDo you want to..");
				System.out.println("1. View enrolled paper");
				System.out.println("2. Enroll new paper");
				System.out.println("3. Withdraw a paper");
				System.out.println("4. Find Ambassador");
				System.out.println("5. Find Mentor\n");
				
				find = scan.nextInt();
				//view enrolled paper
				if(find == 1) {
					for(Paper p: findedSt.getPaperList()) {
						System.out.println(p);
					}
				}
				//enroll new paper
				else if(find == 2) {
					System.out.println("Enter new paper code to enter");
					scan.nextLine();
					String newPaperName = scan.nextLine();
					//if paper is not duplicated, add paper
					if(!isPaperDuplicated(newPaperName, findedSt.getPaperList())) {
						int index = findPaperIndex(newPaperName);
						if(index == 5) {
							System.out.println("The paper code is unavailable");
						}
						else {
							findedSt.addPaper(aPaper[index]); //add new paper
							System.out.println(newPaperName+" is added");
						}
					}
					else {
						System.out.println("You have already enrolled the paper");
					}
				}
				//withdraw paper
				else if(find == 3) {
					System.out.println("Enter the paper code to withdraw");
					scan.nextLine();
					String withdrawPaper = scan.nextLine();
					//if paper is duplicated, withdraw paper
					if(isPaperDuplicated(withdrawPaper,findedSt.getPaperList())) {
						int index = findPaperIndex(withdrawPaper);
						findedSt.withdrawPaper(aPaper[index]);
						System.out.println(withdrawPaper+ " is withdrawed");
					}
				}
				//find student ambassadors 
				else if(find == 4) {
					boolean foundAmb = (((StudentAmbassador)student.get(16)).bookingTime());
					if(!foundAmb) {
						boolean foundAmb2 = (((StudentAmbassador)student.get(17)).bookingTime());
						if(!foundAmb2)
							System.out.println("Cannot find student ambassador, try next time");
					}
						
				}
				//find student mentors
				else if(find == 5) {
					System.out.println("Enter the paper code you want to get help");
					scan.nextLine();
					String helpPaper = scan.nextLine();
					int index = findPaperIndex(helpPaper);
					StudentMentor mentor = findMentor(aPaper[index], student, findedSt);
					if(mentor == null) {
						System.out.println("Mentoring is unavailble, can't find a matching mentor");
					}
					else {
						if(mentor.bookingTime()) {
							System.out.println("Your mentoring session is booked with "+mentor.getName());
						}
					}
				}
			}
			//read the list of student text file
			else if(userInput == 3) {
				try {
					FileReader fr = new FileReader("out.txt");
					BufferedReader inputStream = new BufferedReader(fr);
					String line = null;

					while((line=inputStream.readLine())!=null)
						System.out.println(line);
					inputStream.close();
				}catch(FileNotFoundException e) {
					System.out.println("File not found");
				}catch(Exception e) {
					System.out.println("Error reading from file");
				}
			}
			System.out.println();
		}
	}
}
