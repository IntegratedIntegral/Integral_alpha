package calculator;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class KeyAction extends AbstractAction{

	private static final long serialVersionUID = 1L;
	private char key;
	
	public KeyAction(char ch) {
		key = ch;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Frame.calcText += key;
		Frame.calc.setFont(Frame.kenobi);
		Frame.calc.setText(Frame.calcText);
		Frame.input += key; 
	}

}
