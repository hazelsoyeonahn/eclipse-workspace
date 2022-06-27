package Assignment2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/*
 * This class generates the list of CruiseShip for making a specific journey
 * This class has method to ensure the journey connects to correct ships
 * It has a method to count the total cost of the journey.
 */

public class CruiseJourney {
	private List<CruiseShip> shipList;
	
	public CruiseJourney() {
		shipList = new ArrayList<>();
	}
	
	public CruiseJourney(List<CruiseShip> list) {
		this.shipList = list;
	}
	
	public boolean addCruise(CruiseShip ship) {
		//check the new cruise departs from current end port
		//check the end date is earlier than new cruise's depart date
		//assume all departures are in the afternoon, and all arrival in the mornings

		if(shipList.isEmpty()) {
			shipList.add(ship);
			return true;
		}

		if(!shipList.isEmpty()) {
			if(getEndPort().equals(ship.getDepartPort())) {
				if(getEndDate().before(ship.getDepartDate()))
					shipList.add(ship); //really unsure why it keeps giving me index out of boundary exception
				//when all of the conditions are true.....:( doesn't let me add to the arraylist
				return true;
			}
		}
		
		
		return false;
	}
	
	public boolean removeLastTrip() {
		if(!shipList.isEmpty()) {
			shipList.remove(shipList.size()-1);
			return true;
		}
		return false;
	}
	
	//check if this port exist in this journey
	public boolean containsPost(String port) {
		for(int i=0; i<shipList.size(); i++) {
			if(shipList.get(i).getDepartPort().equals(port)) 
				return true;
			else if(shipList.get(i).getArrivalPort().equals(port))
				return true;
		}
		return false;
	}
	
	public String getStartPort() {
		return shipList.get(0).getDepartPort();
	}
	
	public String getEndPort() {
		return shipList.get(shipList.size()-1).getArrivalPort();
	}
	
	public Calendar getStartDate() {
		return shipList.get(0).getDepartDate();
	}

	public Calendar getEndDate() {
		return shipList.get(shipList.size()-1).getArrivalDate();
	}
	
	public CruiseJourney cloneJourney() {
		CruiseJourney c = new CruiseJourney(shipList);
		return c;
	}
	
	public int getNumberOfTrips() {
		return shipList.size();
	}
	
	public double getTotalCost() {
		double totalCost = 0;
		for(int i=0; i<shipList.size(); i++) {
			totalCost += shipList.get(i).getCost();
		}
		return totalCost;
	}
	
	public String toString() {
		String journey = "Journey: Total Cost $"+getTotalCost()+"!!!\n";
		for(int i=0; i<shipList.size(); i++) {
			journey +="-"+shipList.get(i).getBoatName()+": LEAVING"+shipList.get(i).getDepartPort()
					+" ("+shipList.get(i).getDepartDate()+") and ARRIVING "
					+shipList.get(i).getArrivalPort()+" ("
					+shipList.get(i).getArrivalDate()+")\n";}
	
		return journey;
	}
}
