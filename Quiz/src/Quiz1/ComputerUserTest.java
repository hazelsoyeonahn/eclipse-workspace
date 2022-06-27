package Quiz1;


/*
 * This class contains main method to test the functionality of this program.
 * 
 * @author Hazel Ahn 16945085
 */

public class ComputerUserTest {
	//main
	public static void main(String[] args) {
		
		//creating ComputerUser objects
		ComputerUser[] users = new ComputerUser[10];
		users[0] = new Staff("staff_01", "asdf1233");
		users[1] = new Staff("staff2", "123456789410");
		users[2] = new Staff("staff3", "!@#$  #%");
		users[3] = new Staff("staff4 2019", "1234567891011121314");
		users[4] = new Staff("staff52019", "12345678910111213141");
		users[5] = new Staff("staff6092000", "12345678910111213141");
		users[6] = new Student("student1", "1312111098765432115654");
		users[7] = new Student("student2 ", "1312111098765432115654");
		users[8] = new Student("student_3@", "1312111098765432115654");
		users[9] = new Student("student4@S2_2020", "1312111098765432115654");
		
		//print all users to the console
		for (int i = 0; i <users.length; i++) {
			System.out.println("User " + (i + 1) + ": " + users[i]);
		}
	}

}
