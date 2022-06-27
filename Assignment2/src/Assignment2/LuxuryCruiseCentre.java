package Assignment2;
/*
 * This class is the has a functionality of adding ships and will
 * treat each destinations as number of vertexes then add edges.
 * This class implemented depth first search algorithm 
 * to generate the path between vertexes.
 * 
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LuxuryCruiseCentre {
	private Map<String, Set<CruiseShip>> postMap;
	int vertex = 13;
	Set<CruiseShip> cruiseList;
	private ArrayList<Integer>[] connect;
	
	//constructor
	public LuxuryCruiseCentre() {
		postMap = new HashMap<String, Set<CruiseShip>>();
		cruiseList = new HashSet<CruiseShip>();
		connect = new ArrayList[vertex]; //13 destinations
		for(int i=0; i<vertex; ++i) {
			connect[i] = new ArrayList<>();
		}
	}
	
	//add unique cruise ship
	public boolean add(CruiseShip ship) {
		cruiseList.add(ship); //add it to the set

		//connect vertices
		connect[returnIndex(ship.getDepartPort())].add(returnIndex(ship.getArrivalPort()));
		
		return true;
	}
		
	//recursively call findPaths method
	public List<CruiseJourney> getPossibleJourneys(String startPort, 
			Calendar startDate, String endPort){
		//list to save CruiseJourney 
		List<CruiseJourney> journeyList = new ArrayList<>();
		//current journey object
		CruiseJourney oneJourney = new CruiseJourney();
		ArrayList<Integer> pathList = new ArrayList<>();
		boolean[] isVisited = new boolean[13];
		
		//add first element to the path to start
		pathList.add(returnIndex(startPort));
		
		findPaths(startPort, startDate, endPort, oneJourney, journeyList, pathList, isVisited);

		//after findPaths method is finished, journeyList must be updated 
		return journeyList;	
	}

	
	//depth first search
	@SuppressWarnings("unlikely-arg-type")
	private void findPaths(String departPort, Calendar departDate,
			String endPort, CruiseJourney currentJourney, 
			List<CruiseJourney> journeyList, ArrayList<Integer> pathList, boolean[] isVisited) {
		int index = 0;
		
		if(departPort.equals(endPort)) {
			System.out.println(pathList);
		for(int j=0; j<pathList.size(); ++j) {
				for(Iterator<CruiseShip> it = cruiseList.iterator(); it.hasNext();) {
				CruiseShip c = it.next();
				if(c.getDepartPort().equals(returnPort(pathList.get(j))) && c.getArrivalPort().equals(returnPort(pathList.get(j+1)))) {
					currentJourney.addCruise(c); //stuck here to add cruises
				}
				}
			}	
		journeyList.add(currentJourney); //add the journey to the list
		}
	
		
		isVisited[returnIndex(departPort)] = true;
		
		for(Integer i: connect[returnIndex(departPort)]) {
			if(!isVisited[i] ) {
				pathList.add(i); //sorry, not sure why it keeps add duplicate results
				//path should be less than 5
				if(pathList.size()<5) {
					findPaths(returnPort(i),departDate, endPort,currentJourney, journeyList, pathList,isVisited);
				}
				
				pathList.remove(i);
			}
		}
		isVisited[returnIndex(departPort)] = false;
	}
	
	//declare vertices for each destinations
	public int returnIndex(String whatPort) {
		int index = 0;
		
		if(whatPort.equals("Antarctica"))
			index = 0;
		if(whatPort.equals("Christchurch"))
			index = 1;
		if(whatPort.equals("Wellington"))
			index = 2;
		if(whatPort.equals("Auckland"))
			index = 3;
		if(whatPort.equals("Melbourne"))
			index = 4;
		if(whatPort.equals("Sydney"))
			index = 5;
		if(whatPort.equals("Brisbane"))
			index = 6;
		if(whatPort.equals("Vanuatu"))
			index = 7;
		if(whatPort.equals("Bangkok"))
			index = 8;
		if(whatPort.equals("Tonga"))
			index = 9;
		if(whatPort.equals("Fiji"))
			index = 10;
		if(whatPort.equals("Samoa"))
			index = 11;
		if(whatPort.equals("Niue"))
			index = 12;
		
		return index;
	}
	
	//get port for following vertices
	public String returnPort(int index) {
		String port = "";
		
		if(index == 0)
			port = "Antarctica";
		if(index == 1)
			port = "Christchurch";
		if(index == 2)
			port = "Wellington";
		if(index == 3)
			port = "Auckland";
		if(index == 4)
			port = "Melbourne";
		if(index == 5)
			port = "Sydney";
		if(index == 6)
			port = "Brisbane";
		if(index == 7)
			port = "Vanuatu";
		if(index == 8)
			port = "Bangkok";
		if(index == 9)
			port = "Tonga";
		if(index == 10)
			port = "Fiji";
		if(index == 11)
			port = "Samoa";
		if(index == 12)
			port = "Niue";
		
		return port;
	}

}
