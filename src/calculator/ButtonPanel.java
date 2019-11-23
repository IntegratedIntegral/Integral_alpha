package calculator;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class ButtonPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ButtonPanel() {
		super();
		setLocation(5,105);
		setSize(390,290);
		setBackground(Color.gray);
		setLayout(new GridLayout(5,4));
		
		
	}
}
