package examples;
/**
 * 
 * This class stores data relating to a physical address.
 * It contains a method which determines if the postcode is "valid" 
 * (e.g. contains only numbers and is of length 4)
 * 
 * */
public class Address {

	String name;
	int streetNumber;
	String suburb;
	String city;
	String postCode;

	/**
	 * 
	 * 
	 * 
	 * @return a boolean indicating if the postcode is valid
	 * 
	 * www.nzpost.co.nz/personal/sending-within-nz/how-to-address-mail/postcodes/how-postcodes-work
	 * Postcodes are four digits and each digit has a specific meaning.
	 * The first digit of the postcode represents one of ten machine 'lines' (numbered 0 - 9), 
	 * which process mail for a specific geographic region. These run north to south in ascending order.
	 * The second and third digits reflect postal sort areas and our New Zealand Post delivery network - 
	 * urban posties, New Zealand Post PO Boxes, Private Bags and RuralPost.
	 * The fourth digit identifies the specific box lobby, rural delivery round or urban area.
	 **/
	public boolean isValidPostCode()
	{

		if(this.postCode.length()!=4)
		{
			return false;
		}

		for(int i=0;i<this.postCode.length();i++)
		{
			char ch = this.postCode.charAt(i);
			if(!(ch >='0'&&ch<='9'))
			{
				return false;
			}
		}


		return true;

	}

	public static void main(String[] args)
	{
		Address address = new Address();
		address.name = "Robin Banks";
		address.streetNumber = 123;
		address.suburb = "Albany";
		address.city = "Auckland";
		address.postCode="1234";
		System.out.println("Post code "+address.postCode+" is valid? "+address.isValidPostCode());
		address.postCode="a124";
		System.out.println("Post code "+address.postCode+" is valid? "+address.isValidPostCode());
		address.postCode="124";
		System.out.println("Post code "+address.postCode+" is valid? "+address.isValidPostCode());
	}
}