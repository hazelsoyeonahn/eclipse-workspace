package ass;
/*
 * This GUI class demonstrates an animated visual of the system.
 * It creates Five ConveyorBelts
 * It creates buttons for add, remove machine and dispatch
 */

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FactorySimulatorGUI extends JPanel{
	private ArrayList<Machine> machine;
	private ArrayList<Dispatcher> dispatch;
	private ConveyorBelt c = new ConveyorBelt();
	
	//constructor
	public FactorySimulatorGUI() {
		super();
		machine = new ArrayList<Machine>();
		dispatch = new ArrayList<Dispatcher>();
		setPreferredSize(new Dimension(800,550));
		setBackground(Color.white);
	}
	
	public void addMachine() {
		Machine m = new Machine(this, 80, 30);
		machine.add(m);
		Thread t = new Thread(m);
		t.start();
	}
	
	public void removeMachine() {
		if(!machine.isEmpty()){
			machine.remove(0);
		}
	}
	
	public void addDispatch() {
		Dispatcher d = new Dispatcher(this, 700, 30);
		dispatch.add(d);
		Thread t = new Thread(d);
		t.start();
	}
	
	public void removeDispatch() {
		if(!dispatch.isEmpty()) {
			dispatch.remove(0);
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(2));
		
		g.drawRect(0, 0, getWidth(), getHeight());
		g.drawRect(100, 30, 600, 50);
		g.drawRect(100, 130, 600, 50);
		g.drawRect(100, 230, 600, 50);
		g.drawRect(100, 330, 600, 50);
		g.drawRect(100, 430, 600, 50);
		
		//draw machine
		for(Machine m: machine) {
			m.drawMachine(g2);
		}
		
		//draw dispatcher
		for(Dispatcher d: dispatch) {
			d.drawMachine(g2);
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final FactorySimulatorGUI draw = new FactorySimulatorGUI();
		frame.add(draw);

		
		//add button
		JButton addDis = new JButton("Add Dispatcher");
		addDis.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				draw.addDispatch();
			}
		});
		
		JButton removeDis = new JButton("Remove Dispatcher");
		removeDis.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				draw.removeDispatch();
			}
		});
		
		
		JButton addMac = new JButton("Add Machine");
		addMac.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				draw.addMachine();	
			}
		});
		
		JButton removeMac = new JButton("Remove Machine");
		removeMac.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				draw.removeMachine();
			}
		});
		
		
		JPanel panel = new JPanel();
		panel.add(addDis);
		panel.add(removeDis);
		panel.add(addMac);
		panel.add(removeMac);
		frame.add(panel, BorderLayout.PAGE_END);	
		frame.pack();
		frame.setVisible(true);	
	}

}
