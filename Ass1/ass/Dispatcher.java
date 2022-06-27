package ass;
/*
 * This Dispatcher class runs continuously as a thread until
 * requested to stop. It monitoring an array of ConveyorBelt objects.
 * A dispatcher will try connect to ConveyorBelt if it is not empty
 * It repeats process by moving to the next available ConveyorBelt
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JComponent;

public class Dispatcher implements Runnable{
	//initialise variables
	private Random rand = new Random();
	private JComponent component;
	public static int MIN_PRODUCTION_TIME = 60;
	public static int MAX_PRODUCTION_TIME = 300;
	int x,y;
	private Color color;
	private ConveyorBelt belt;
	private Machine m;
	
	//constructor
	public Dispatcher(JComponent component, int x, int y) {
		this.component = component;
		this.x = x;
		this.y = y;
	}
	
	//this method keeps the dispatcher rotate.
	public void move() {
		//this code is not working as fail to generate parcel..
	/*	for(int i=0; i<5; i++) {
			if(y == 30) {
				if(!m.belt[0].isEmpty()) {
					m.belt[0].disconnectDispatcher(this);
					m.belt[0].getFisrtParcel(this);
					m.belt[0].disconnectDispatcher(this);
				}
			}
			if(y == 130) {
				if(!m.belt[1].isEmpty()) {
					m.belt[1].disconnectDispatcher(this);
					m.belt[1].getFisrtParcel(this);
					m.belt[1].disconnectDispatcher(this);
				}
			}
			if(y == 230) {
				if(!m.belt[2].isEmpty()) {
					m.belt[2].disconnectDispatcher(this);
					m.belt[2].getFisrtParcel(this);
					m.belt[2].disconnectDispatcher(this);
				}
			}
			if(y == 330) {
				if(!m.belt[3].isEmpty()) {
					m.belt[3].disconnectDispatcher(this);
					m.belt[3].getFisrtParcel(this);
					m.belt[3].disconnectDispatcher(this);
				}
			}
			if(y == 430) {
				if(!m.belt[4].isEmpty()) {
					m.belt[4].disconnectDispatcher(this);
					m.belt[4].getFisrtParcel(this);
					m.belt[4].disconnectDispatcher(this);
				}
			}
		}*/
		y += 100;
		if(y >= 440)
			y = 30;
	}
	
	public void drawMachine(Graphics g) {
		g.setColor(color.red);
		g.fillOval(x, y, 25, 25);
	}

	@Override
	public void run() {
		while(true) {
			move();
			component.repaint();
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
