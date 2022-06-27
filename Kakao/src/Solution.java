import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;


public class Solution {
	public String better(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Hashtable<String, Integer> ht1 = new Hashtable<>();
        
        for(int i=0; i<participant.length; i++){
            System.out.println(participant[i]);
            if(ht1.containsKey(participant[i])) {
            	int count = ht1.get(participant[i]) + 1;
            	ht1.replace(participant[i], count);
            }else {
            	 ht1.put(participant[i], 0);
            }
        }
        System.out.println(ht1);
   
        
        for(int i=0; i<completion.length; i++) {
        	if(ht1.containsKey(completion[i])) {
        		if(ht1.get(completion[i]) != 0) {
        			int count = ht1.get(completion[i]) - 1;
        			
        			ht1.replace(completion[i], count);
        		}else {
        			ht1.remove(completion[i]);
        		}
        	}
        }
        
        answer = (String)ht1.keySet().toArray()[0];
        
        return answer;
    }
	
   public static void main(String args[]) {
	   String[] arr = new String[4];
	   arr[0] = "leo";
	   arr[1] = "kiki";
	   arr[2] = "eden";
	   arr[3] = "leo";
	 
	   String[] ar2 = new String[3];
	   ar2[0] = "eden";
	   ar2[1] = "kiki";
	   ar2[2] = "leo";
	   
	   String result = solution(arr,ar2);
	   System.out.println("\n"+result);
    }
    
}


