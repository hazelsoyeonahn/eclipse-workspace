package Quiz1;

/*
 * This Student class is an extended class of ComputerUser
 * It has a constructor to check the condition for the user names.
 * And has an address instance variable.
 * 
 * @author Hazel Ahn 16945085
 */

public class Student extends ComputerUser {
	private String address;
	//constructor
	public Student(String username, String password) {
		super(username, password);
		
		//checking if it has any space
		String name = username;
		
		if(!hasSpaces(name)) {
			//check the length is less or equal to 8
			if(name.length() >= 8) {
				setUsername(name.toLowerCase());
			}
		}
		else {
			this.username = "defaultstudent2020";
		}
	}
	
	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
