package calculator;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Gui extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Gui() {
		super();
		setPreferredSize(new Dimension(400,400));
		setLocation(0,0);
		setLayout(null);
		setBackground(Color.GRAY);
	}
	
}
