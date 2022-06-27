package quiz;
import javax.swing.JFrame;
/**
 * This class is the main class that declares JFrame of the GUI app
 * 
 * @author hazelsoyeonahn
 *
 */

public class MyGUI extends JFrame{
	//constructor for GUI
	public MyGUI() {
		//title of the JFrame
		super("My GUI Program");
		
		//add MyGUIPanel
		add(new MyGUIPanel());
		
		setSize(350,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//main
	public static void main(String[] args) {
		//call MyGui
		new MyGUI();
	}

}
