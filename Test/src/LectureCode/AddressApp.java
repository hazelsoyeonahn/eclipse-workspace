package LectureCode;

public class AddressApp {
	public static void main(String[] args) {
		Address anAddress = new Address();
		anAddress.city = "Auckland";
		anAddress.StreetName = "Wakefield";
		System.out.println(anAddress.city + "-" + anAddress.StreetName);
		Address anAddress2 = new Address();
		// if you get rid of new write anAddress;
		// it will locate the memory in the same place.
		
		anAddress2.city = "Auckland";
		anAddress2.StreetName = "Wakefield";
		System.out.println(anAddress2.city + "-" + anAddress2.StreetName);
		
		System.out.println(anAddress);
		System.out.println(anAddress2);
		
		//this will print out the address of memory space
		//with dot operator, you have an access to that memory space 
		//and able to modify the value.
	}

}
