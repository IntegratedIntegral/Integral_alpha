package calculator;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculations extends JTextField{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Calculations(String text) {
		super(text);
		setLocation(5,5);
		setSize(380,80);
		setFont(Frame.kenobi);
		setHorizontalAlignment(JLabel.RIGHT);
		setEditable(false);
	}

}
