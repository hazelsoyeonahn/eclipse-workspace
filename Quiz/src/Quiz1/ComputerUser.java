package Quiz1;
/*
 * This class is an abstract parent class of student and staff.
 * This class maintians the username and password.
 * This class includes the booelan hasSpace method.
 * This class includes the constructor to check if password is matching.
 * 
 * @author Hazel Ahn 16945085
 */

public abstract class ComputerUser {
	
	protected String username;
	protected String password;
	
	//constructor for abstract class
	public ComputerUser(String username, String password) {
		super();
		//check if the password is matching the condition
		if(password.toString().matches("^[0-9]{20,}$")) {
			this.password = password;
		}
		//if not set password to default
		else {
			this.password = "GENRALUSERPASS";
		}
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	//to check if there is a space in name
	public boolean hasSpaces(String name) {
		if(name.contains(" ")) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
	
		return "username: "+username+", password: "+password;
	}
	


}
