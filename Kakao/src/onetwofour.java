
public class onetwofour {
    public static String solution(int n) {
    	String[] num = {"4","1","2"};
	      String answer = "";

	      while(n > 0){
	          answer = num[n % 3] + answer;
	          n = (n - 1) / 3;
	      }
	      return answer;
    }
    
  
    public static void main(String args[]) {
    	int n = 5;
    	System.out.println(">");
    	System.out.println(solution(100));
    }
}
