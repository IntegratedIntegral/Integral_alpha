package calculator;

import java.awt.Color;
import javax.swing.JButton;

public class Button extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Button(String text) {
		super(text);
		setBackground(Color.WHITE);
		setFont(Frame.kenobi);
	}
	
}
