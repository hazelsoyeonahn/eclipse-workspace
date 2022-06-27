package ass;
/*
 * This class will generate Parcel objects.
 * During creation of Parcel, a timestamp is set.
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Parcel<E> implements Comparable<Parcel<?>>, Runnable {
	
	private E element;
	private Color color;
	private int consumeTimer;
	private int priority, x;
	private long timestamp;
	private ConveyorBelt b;
	private JComponent component;
	
	public Parcel(JComponent component, E element, Color color, int consumeTimer, int priority, int x) {
		this.element = element;
		this.color = color;
		this.consumeTimer = consumeTimer;
		this.priority = priority;
		this.x = x;
		this.component = component;
		timestamp = System.nanoTime();
	}
	
	public void consume() {
		try {
			Thread.sleep(consumeTimer);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return element+"("+priority+")";
	}
	
	public void move() {
		for(int i=0; i<b.maxCapacity; ++i) {
			x += 50;
		}
		
	}
	
	public void drawBox(Graphics g, int y, int width, int height) {
		g.drawRect(x, y, width, height);
		g.setColor(color);
	}

	@Override
	public int compareTo(Parcel<?> o) {
		
		return 0;
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
