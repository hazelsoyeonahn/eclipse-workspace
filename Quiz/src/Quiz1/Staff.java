package Quiz1;

/*
 * This Staff class is an extended class of ComputerUser
 * It has a constructor to check the condition for the user names.
 * And has a fullname variable.
 * 
 * @author Hazel Ahn 16945085
 */

public class Staff extends ComputerUser{
	
	private String fullname;
	
	//constructor
	public Staff(String username, String password) {
		super(username, password);
		
		//check if there is any space
		String name = username;
		if(!hasSpaces(name)) {
			//check the length is less or equal to 8
			if(name.toString().matches("^[A-Za-z]{5}?[0-9]{5,}?$")) {
				setUsername(name);
			}
			//otherwise return default value
			else {
				this.username = "DefaultStaff2020";
			}
		}
		else {
			this.username = "DefaultStaff2020";
		}
	}
	
	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

}
