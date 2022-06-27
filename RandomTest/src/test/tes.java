package test;

import java.util.ArrayList;
import java.util.Collections;

public class tes {
	 public static int[] solution(String[] id_list, String[] report, int k) {
	        int[] answer = {};
	        int[] block = new int[id_list.length];
	        ArrayList<String> blockList = new ArrayList<String>();
	        ArrayList<String> mailList = new ArrayList<String>();
	        int[] nameLength = new int[id_list.length];
	        
	        for(int i=0; i<id_list.length;i++){
	           nameLength[i] = id_list[i].length();
	           for(int j=0; j<report.length; j++) {
	        	  if(id_list[i].equals(report[j].substring(0, nameLength[i]))) {
	        		  blockList.add(report[j].substring(nameLength[i]+1));
	        	  }
	           }           
	        }
	        
	        System.out.println(blockList);
	        
	        for(String l : blockList) {
	        	for(int i=0; i<id_list.length; i++) {
	        		if(l.equals(id_list[i]))
	        			++block[i];
	        	}
	        }
	        
	        for(int i=0; i<block.length; i++) {
	        	if(block[i]>=k) {
	        		for(int j=0; j<report.length;j++) {
	        			if(id_list[i].equals(report[j].substring(report[j].length()-nameLength[i]))){
	        				mailList.add(report[j].substring(0, report[j].length()-nameLength[i]));
	        			}
	        		}
	        	}
	        }
	        
	        for(String l : mailList) {
	        	for(int i=0; i<id_list.length; i++) {
	        		if(id_list[i].equals(l.toString())) {
	        			++answer[i];
	        		}
	        	}
	       
	        }
	        
		       for(int i=0; i<answer.length; i++) {
		    	   System.out.println(answer[i]);
		       }
	        return answer;
	 }
	   public static int[] solution1(int[] fees, String[] records) {
	       int[] answer = {};
	       ArrayList<String> cars = new ArrayList<String>();
	       
	       for(int i=0; i<records.length; i++) {
	    	   if(!cars.contains(records[i].substring(6, 10))) {
	    		   cars.add(records[i].substring(6, 10));
	    	   }
	       }
	       
	       Collections.sort(cars);
	       System.out.println(cars);
	       System.out.println(records[0].substring(3, 4));
	       answer = new int[cars.size()];
	       int[] parkedTime = new int[cars.size()];
	       int count = 0;
	       boolean isOut = false;
	       for(String c : cars) {
	    	   int inTime = 0;
	    	   int outTime = 0;
	  
	    	   for(int i=0; i<records.length; i++) {
	    		   if(records[i].substring(6, 10).equals(c)) {
	    			   if(records[i].substring(11, 13).equals("IN")) {
	    				   //get hour
	    				   int hour = Integer.parseInt(records[i].substring(0, 2));
	    				   inTime += hour*60;
	    				   //get minute
	    				   inTime += Integer.parseInt(records[i].substring(3, 5));
	    				   isOut = false;
	    			   }
	    			   else if(records[i].substring(11, 14).equals("OUT")){
	    				   int hour = Integer.parseInt(records[i].substring(0, 2));
	    				   outTime += hour*60;
	    				   outTime += Integer.parseInt(records[i].substring(3, 5));
	    				   isOut = true;
	    			   }
	    		   }
	    	   }
	    	   
	    	   if(!isOut) {
	    		   outTime += 23*60;
	    		   outTime += 59;
	    	   }
	    	   int middle =(int)Math.ceil(((double)(outTime-inTime)-(double)fees[0])/(double)fees[2]);
	    	   answer[count] = (fees[1]+middle*fees[3]);
	            if(answer[count]<5000){
	                answer[count] = 5000;
	            }
	    	   ++count;
	    	   isOut = false;
	    	   inTime = 0;
	    	   outTime = 0;
	    	   System.out.println(answer[0]);
	    	   System.out.println(answer[1]);
	    	   System.out.println(answer[2]);
	       }
	       
	      
	       return answer;
    }
	   
	   public static int[] solution2(int n, int[] info) {
	       int[] answer = new int[11];
        int aPoint = 0;
        int rPoint = 0;
        boolean[] ry = new boolean[11];
        boolean[] ape = new boolean[11];
        int[] rInfo = new int[11];
        for(int i=0; i<info.length; i++) {
        	if(info[i]!=0) {
        		ape[i] = true;
        	}
        	if(ape[i]) {
        		aPoint +=10-i;
        	}
        }
        
        int arrow = 0;
        for(int i=0; i<n; i++) {
        	while(aPoint >= rPoint) {
        		while(ape[i]&&<n+1) {
        			int howMany = info[i]+1;
        			while(howMany !=0) {
        				rInfo[i]+=1;
        				--howMany;
        				++arrow;
        			}
        			ry[i] = true;
        			aPoint -= 10-i;
        			++i;
        		}
        	}
        }
        
        System.out.println(aPoint);
        
        return answer;
	    }
	public static void main(String args[]) {
		String[] id_list = new String[4];
		String[] report = new String[5];
		id_list[0] = "muzi";
		id_list[1] = "frodo";
		id_list[2] = "apeach";
		id_list[3] = "neo";
		report[0] = "muzi frodo";
		report[1]= "apeach frodo";
		report[2] = "frodo neo";
		report[3] = "muzi neo";
		report[4] = "apeach muzi";
		
		int[] fee = new int[4];
		fee[0] = 180; fee[1] = 5000;
		fee[2] = 10;
		fee[3] = 600;
		
		String[] record = new String[9];
		record[0] = "05:34 5961 IN";
		record[1] = "06:00 0000 IN";
		record[2] = "06:34 0000 OUT";
		record[3] = "07:59 5961 OUT";
		record[4] = "07:59 0148 IN";
		record[5] ="18:59 0000 IN";
		record[6] ="19:09 0148 OUT";
		record[7] ="22:59 5961 IN";
		record[8] ="23:00 5961 OUT";
		int[] info = new int[11];
		info[0] = 2;
		info[1] = 1;
		info[2] = 1;
		info[3] = 1;
		info[4] = 0;
		info[5] = 0;
		info[6] = 0;
		info[7] = 0;
		info[8] = 0;
		info[9] = 0;
		info[10] = 0;					
		solution2(5,info);
		//solution(id_list,report,2);
	}
}
