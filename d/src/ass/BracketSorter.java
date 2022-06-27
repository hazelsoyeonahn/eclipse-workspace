package ass;
/**
 * This BracketSorter class efficiently evaluate whether opening and closing bracket
 * and brace paris match up inside any given string in O(n) time.
 * All other content can be ignored and pairs are: (){}<>[]
 * @author hazelsoyeonahn
 *
 */

import java.util.Scanner;
import java.util.Stack;

public class BracketSorter {
	//this method sorts brackets
	public static void main(String args[]) {
		int count =1;
		Scanner s = new Scanner(System.in);
		//entry of this program
		System.out.println("Warning DO NOT TYPE ANY WHITE SPACE!!!");
		System.out.println("Type string with bracket to evaluate:");
		
		//to evaluate if success or not
		int sort=0;
		//read user input
		String read= s.next();
		//instantiate stack
		Stack<Character> st = new Stack<>();
		
		//This will loop until all char has been checked
		for(int i=0; i<read.length();++i) {
			char c = read.charAt(i);
			//check open bracket
			if(c=='('||c=='{'||c=='['||c=='<') {
				st.push(c);
			}
			//check if there is closing bracket matches open bracket
			//if found pop the stack, otherwise sort=1
			else{
				if(c==')') {
					if(st.peek()=='(')
					st.pop();
					else {
						sort=1;
						break;
					}
				}
				if(c=='}') {
					if(st.peek()=='{')
						st.pop();
					else {
						sort=1;
						break;
					}
				}
				if(c==']') {
					if(st.peek()=='[')
						st.pop();
					else {
						sort=1;
						break;
					}
				}
				if(c=='>') {
					if(st.peek()=='<')
						st.pop();
					else {
						sort=1;
						break;
					}
				}
			}
		}
		
		//when sort is 1, evaluation is failed
		if(sort==1||st.empty()==false)
			System.out.println("Evaluation failed");
		
		//when sort is 0,evaluation is successful
		else if(sort==0)
			System.out.println("Evaluation successful");
	}	
}

	

