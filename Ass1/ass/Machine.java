package ass;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

/*
 * A class that runs continuously as a thread until it asked to stop
 * If the ConveyorBelt is not full, it will generate parcel
 * It simply moves on to the next ConveyorBelt in the array and repeats
 */

public class Machine implements Runnable{
	public static int MIN_CONSUPTION_TIME;
	public static int MAX_CONSUPTION_TIME;
	public static int MIN_PRODUCTION_TIME = 60;
	public static int MAX_PRODUCTION_TIME = 300;
	private JComponent component;
	private Color color;
	private Parcel p;
	private Machine m;
	private Random rand = new Random();
	private int x,y;
	private float r,g,b;
	public	 ConveyorBelt[] belt = new ConveyorBelt[5];
	
	public Machine(JComponent component, int x, int y) {
		this.component = component;
		this.x = x;
		this.y = y;
	}
	
	public void move() {
		int randomNum = rand.nextInt(3);
		char c = (char)(rand.nextInt(26)+'a');
		r = rand.nextFloat();
		g = rand.nextFloat();
		b = rand.nextFloat();
		color = new Color(r,g,b);
		
		//this code is not working..
	/*	for(int i=0; i<5; i++) {
			if(y == 30) {
				if(!belt[0].isFull()) {
					belt[0].connectMachine(this);
					belt[0].postParcel(p = new Parcel(component, c, color, 5, randomNum, 100), this);
					belt[0].disconnectMachine(this);
				}
			}
			if(y == 130) {
				if(!belt[1].isFull()) {
					belt[1].connectMachine(this);
					belt[1].postParcel(p = new Parcel(component, c, color, 5, randomNum, 100), this);
					belt[1].disconnectMachine(this);
				}
			}
			if(y == 230) {
				if(!belt[2].isFull()) {
					belt[2].connectMachine(this);
					belt[2].postParcel(p = new Parcel(component, c, color, 5, randomNum, 100), this);
					belt[2].disconnectMachine(this);
				}
			}
			if(y == 330) {
				if(!belt[3].isFull()) {
					belt[3].connectMachine(this);
					belt[3].postParcel(p = new Parcel(component, c, color, 5, randomNum, 100), this);
					belt[3].disconnectMachine(this);
				}
			}
			if(y == 430) {
				if(!belt[4].isFull()) {
					belt[4].connectMachine(this);
					belt[4].postParcel(p = new Parcel(component, c, color, 5, randomNum, 100), this);
					belt[4].disconnectMachine(this);
				}
			}
		}*/
		y += 100;
		if(y >= 440)
			y = 30;
	}
	
	public void drawMachine(Graphics g) {
		g.setColor(color.blue);
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
