import java.util.LinkedList;
import java.util.Queue;

public class Progress {
	
	public static int[] moveArray(int[] arr, int n) {
		int[] move = new int [arr.length - n];
		
		for(int i=0; i<move.length; i++) {
			move[i] = arr[i+n];
		}
		
		return move;
	}

	   public static int[] solution(int[] progresses, int[] speeds) {
	        int[] answer = {};
	        int[] spp = speeds;
	        Queue<Integer> q = new LinkedList<>();
	        Queue<Integer> ansQ = new LinkedList<>();
	        boolean loop = true;
	        boolean move = false;
	        
	        for(int p : progresses) {
	        	q.add(p);
	        }
	        
	       int count = 0;
	        while(loop) {
	        	int n = 0;
	        	int pop = 0;
	        	
	        	for(int i=0; i<q.size(); i++) {
	        		q.add(q.peek()+speeds[n]);
	        		q.poll();
	        		n++;
	        	}
	        	
        	
	        	while(!q.isEmpty()&&q.peek() >= 100) {
	        		q.poll();
	        		pop++;
	        		move = true;
	        	
	        	}
	        	
	        	if(move) {
	        		speeds = moveArray(speeds, pop);
	        		move = false;
	        	}
     
	        	count++;
	        	if(q.isEmpty()) {
	        		loop = false;
	        	}
	        	

	        	if(pop != 0) {
	        		ansQ.add(pop);
	        	}
	        }
	        
	        
	        answer = new int[ansQ.size()];
	        int ansQsize = ansQ.size();
	        for(int i=0; i<ansQsize; i++) {
	        	answer[i] = ansQ.poll();
	        }
	        return answer;
	    }
	
	
	public static void main(String args[]) {
		
		int[] ar11 = new int[3];
		ar11[0] = 93;
		ar11[1] = 30;
		ar11[2] = 55;
		
		int[] ar12 = new int[3];
		ar12[0] = 1;
		ar12[1] = 30;
		ar12[2] = 5;
		
		
		 	int[] ar21 = new int[6];
		   ar21[0] = 95;
		   ar21[1] = 90;
		   ar21[2] = 99;
		   ar21[3] = 99;
		   ar21[4] = 80;
		   ar21[5] = 99;
		 
		   int[] ar22 = new int[6];
		   ar22[0] = 1;
		   ar22[1] = 1;
		   ar22[2] = 1;
		   ar22[3] = 1;
		   ar22[4] = 1;
		   ar22[5] = 1;
		   
		  int[] result = solution(ar21,ar22);
		   for(int i=0; i<result.length; i++) {
			   System.out.println(result[i]);
		   }
	    }
}
