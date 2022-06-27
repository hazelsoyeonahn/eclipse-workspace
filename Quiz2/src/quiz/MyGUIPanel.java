package quiz;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class initialize JPanels, JLabels, JSlider and JComboBox
 * for the MyGUI app.
 * This class includes Change and Action listener.
 * And set the layouts
 * 
 * @author hazelsoyeonahn
 *
 */

public class MyGUIPanel extends JPanel{
	
	//components
	private JLabel text;
	private JLabel fontSize;
	private JLabel fontName;
	private JSlider fontSlider;
	private JComboBox fonts;

	//constructor to initializing the panel
	public MyGUIPanel() {
		//creating a program message panel
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.CYAN);
		
		//text label in the panel
		text = new JLabel("P2 is Perfect!");
		
		//add the panel
		panel1.add(text);
		
		//add the border with title
		panel1.setBorder(BorderFactory.createTitledBorder("Program Message"));
		
		//setting the size
		panel1.setPreferredSize(new Dimension(300, 80));
		
		//creating font name, combo box panel
		JPanel panel2 = new JPanel();
		
		//add font name label
		fontName = new JLabel("Font Name: ");
		panel2.add(fontName);
		
		//creating and add combo box
		fonts = new JComboBox(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
		fonts.setSelectedIndex(-1);
		panel2.add(fonts);
		
		//creating and add fontSize label
		fontSize = new JLabel("Font size: "+ text.getFont().getSize(),JLabel.CENTER);
		fontSize.setPreferredSize(new Dimension(400,50));
		
		//creating and add slider
		fontSlider = new JSlider(10, 40, text.getFont().getSize());
		fontSlider.setPaintTicks(true);
		fontSlider.setPaintLabels(true);
		fontSlider.setMajorTickSpacing(10);
		
		//add listener to slider
		fontSlider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				//current font
				Font f = text.getFont();
				
				//new font style
				f = new Font(f.getFamily(), f.getStyle(), fontSlider.getValue());
				text.setFont(f);
				fontSize.setText("Font size: "+f.getSize());
			}
		});
		//add listener to the combo box
		fonts.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//current font
				Font f = text.getFont();
				
				//new font style
				f = new Font((String)fonts.getSelectedItem(), f.getStyle(), fontSlider.getValue());
				text.setFont(f);
			}
		});
		
		//add components 
		add(panel1);
		add(panel2);
		add(fontSize);
		add(fontSlider);
		
		setBorder(new EmptyBorder(20,20,20,20));
	}

}
