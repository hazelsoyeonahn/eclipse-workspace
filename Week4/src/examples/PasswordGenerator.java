package examples;

import java.util.Random;

/**
 * 
 * This class stores memorable words and generates passphrases from the words
 * using the random number generator.
 * */


public class PasswordGenerator {

	String[] words;
	Random rand;
	
	//------------------------------------------------------------------------
	public String password()
	{
		String pw = "";
	
		//iterate over strings in the "words" array
		for(String word : words)
		{
			
			int subLength = rand.nextInt(word.length());//between 0 and length-1
			
			if(subLength==0)//make sure the subword is at least one char long.
			{
				subLength=1;
			}
			
			String subWord = word.substring(0, subLength);
			pw+=subWord;
		}
		return pw;
	}
	//------------------------------------------------------------------------
	public PasswordGenerator(String[] words)
	{
		this.words = words;
		this.rand = new Random();
	}
	//------------------------------------------------------------------------
	public static void main(String[] args) 
	{
		
		PasswordGenerator pwg = new PasswordGenerator(new String[]{"Swansea","Birmingham","London"});
		System.out.println(pwg.password());
	}

}
