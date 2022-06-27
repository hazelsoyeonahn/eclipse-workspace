package ass;
/*
 * Couldn't complete connecting this to FileSorter
 * This GUI will take input of how many limit they want to
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class FileSorterGUI extends JPanel implements ActionListener, Runnable{

	private JLabel label;
	private int counter;
	private JTextField tf;
	private final JButton startF;
	
	public FileSorterGUI() {
		super();
		label = new JLabel("Type number of Limit");
		tf = new JTextField(20);
		JPanel buttonPanel = new JPanel();
		counter = 0;
		setPreferredSize(new Dimension(500,200));
		Thread thread = new Thread(this);
		

		startF = new JButton("Start file sorting");
		startF.addActionListener((ActionListener)this);
		
		buttonPanel.add(tf);
		buttonPanel.add(startF);
		
		super.add(buttonPanel, BorderLayout.SOUTH);
		super.add(label,BorderLayout.NORTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(tf.getText() != null) {
			int limit = Integer.parseInt(tf.getText());
			
			if(source == startF) {
			FileSorter fs = new FileSorter(limit,"append.txt");
			try {
				fs.readFile(limit, "append.txt");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		}
	}
	@Override
	public void run() {
		while(true);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Main and Event Queue Thread");
		//kill all threads when frame close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new FileSorterGUI());
		frame.pack();
		//position the frame in the middle of the screen
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenDimension = tk.getScreenSize();
		Dimension frameDimension = frame.getSize();
		frame.setLocation((screenDimension.width-frameDimension.width)/2,(screenDimension.height-frameDimension.height)/2);
		frame.setVisible(true);
	}
}
