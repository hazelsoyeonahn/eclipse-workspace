import java.util.LinkedList;
import java.util.List;

public class Hishad {
	 public static boolean solution(int x) {
	        boolean answer = false;
	        int n = x;
	        
	        List<Integer> digits = new LinkedList<Integer>();

	        while (x>0) {
	            digits.add(0, x%10);
	            x=x/10;
	        }
	        
	        int total = 0;
	        
	        for(Integer d: digits) {
	        	total += d;
	        }
	 
	        System.out.println(n%total);
	        if(n%total == 0)
	        	answer = true;
	        return answer;
	    }
	 
	 public static int sol(int left, int right) {
	        int answer = 0;
	        int count = 0;
	        
	        for(int j=left; j<=right; j++) {
	        	count = 0;
		         for(int i = 1; i <= j; i++)
		        {
		            if(j % i == 0)
		                count++; 
		        }
		         if(count % 2 == 0) {
		        	 answer += j;
		         }else
		        	 answer -= j;
	        }
	       
	        return answer;
	    }
	 
	 public static void main(String arg[]) {
		 int n = 11;
		 
		 System.out.println(sol(13,17));
		
	 }
}
