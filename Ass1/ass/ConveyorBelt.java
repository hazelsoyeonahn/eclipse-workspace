package ass;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Queue;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class ConveyorBelt{
	int maxCapacity;
	private Machine connectedMachine;
	private Dispatcher connectedDispatcher;
	private Queue<Parcel<?>> priorityQueue;
	private int count = 0;

	//constructor with specific capacity
	public ConveyorBelt(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
	//default constructor
	public ConveyorBelt() {
		this.maxCapacity = 10;
	}
	
	public boolean connectMachine(Machine machine) {
		connectedMachine = machine;
		return true;
	}
	
	public boolean Dispatcher(Dispatcher machine) {
		connectedDispatcher = machine;
		return true;
	}
	
	public boolean disconnectMachine(Machine machine) {
		if(connectedMachine.equals(machine)) {
			connectedMachine = null;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean disconnectDispatcher(Dispatcher machine) {
		if(connectedDispatcher.equals(machine)) {
			connectedDispatcher = null;
			return true;
		}else {
			return false;
		}
	}
	
	public int size() {
		return maxCapacity;
	}

	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(count == maxCapacity) {
			return true;
		}
		return false;
	}
	
	public boolean postParcel(Parcel<?> p, Machine machine) {
		while(!isFull()) {
			priorityQueue.add(p);
			Thread t = new Thread(p);
			t.start();
			++count;
			return true;
		}
		return false;
	}
	
	public Queue<Parcel<?>> drawComp(){
		return priorityQueue;
	}
	
	public Parcel<?> getFisrtParcel(Dispatcher dispatcher){
		return priorityQueue.poll();
	}
	
	public Parcel<?> retrieveParcel(Dispatcher dispatcher){
		return priorityQueue.poll();
	}
	
	
	public void drawBelt(Graphics g,int x, int y, int width, int height) {
		g.setColor(Color.white);
		g.drawRect(x, y, width, height);	
	}
	

}
