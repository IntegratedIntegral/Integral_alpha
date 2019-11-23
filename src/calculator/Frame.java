package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.Font;

public class Frame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	public static String calcText = "";
	public static String input = "";
	
	private double buffer1 = 0.0;
	private double buffer2 = 0.0;
	public static boolean isInt = true;
	
	Operation operations;
	
	int calculation;
	
	JPanel gui = new Gui();
	JPanel result = new Result();
	JPanel buttonPanel = new ButtonPanel();
	
	JButton button0 = new Button("0");
	JButton button1 = new Button("1");
	JButton button2 = new Button("2");
	JButton button3 = new Button("3");
	JButton button4 = new Button("4");
	
	JButton button5 = new Button("5");
	JButton button6 = new Button("6");
	JButton button7 = new Button("7");
	JButton button8 = new Button("8");
	JButton button9 = new Button("9");
	
	JButton buttonDiv = new Button("÷");
	JButton buttonMult = new Button("×");
	JButton buttonSub = new Button("-");
	JButton buttonAdd = new Button("+");
	JButton buttonEq = new Button("=");
	
	JButton buttonProc = new Button("%");
	JButton buttonSqrt = new Button("√");
	JButton buttonCom = new Button(".");
	JButton buttonBack = new Button("←");
	JButton buttonClear = new Button("C");
	
	public static JTextField calc = new Calculations(calcText);
	
	public static final Font kenobi =  new Font(Font.SERIF,Font.BOLD,24);
	
	public Frame() {
		
		super("KeyListener Test");
		
		addElements();	
		addButtonListeners();
		addKeyMaps();
		
		setLocation(500,400);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
	}
	
	private void addKeyMaps() {
		InputMap im0 = button0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		im0.put(KeyStroke.getKeyStroke(KeyEvent.VK_0,0,true),"0");
		im0.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0,0,true),"0");
		ActionMap am0 = button0.getActionMap();
		am0.put("0",new KeyAction('0'));
		
		InputMap im1 = button1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		im1.put(KeyStroke.getKeyStroke(KeyEvent.VK_1,0,true),"1");
		im1.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1,0,true),"1");
		ActionMap am1 = button1.getActionMap();
		am1.put("1",new KeyAction('1'));
		
		InputMap im2 = button2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_2,0,true),"2");
		im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2,0,true),"2");
		ActionMap am2 = button2.getActionMap();
		am2.put("2",new KeyAction('2'));
		
		InputMap im3 = button3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_3,0,true),"3");
		im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3,0,true),"3");
		ActionMap am3 = button3.getActionMap();
		am3.put("3",new KeyAction('3'));
		
		InputMap im4 = button4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_4,0,true),"4");
		im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4,0,true),"4");	
		ActionMap am4 = button4.getActionMap();
		am4.put("4",new KeyAction('4'));
		
		InputMap im5 = button5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		im5.put(KeyStroke.getKeyStroke(KeyEvent.VK_5,0,true),"5");
		im5.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5,0,true),"5");
		ActionMap am5 = button5.getActionMap();
		am5.put("5",new KeyAction('5'));
		
		InputMap im6 = button6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		im6.put(KeyStroke.getKeyStroke(KeyEvent.VK_6,0,true),"6");
		im6.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6,0,true),"6");
		ActionMap am6 = button6.getActionMap();
		am6.put("6",new KeyAction('6'));
		
		InputMap im7 = button7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		im7.put(KeyStroke.getKeyStroke(KeyEvent.VK_7,0,true),"7");
		im7.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7,0,true),"7");
		ActionMap am7 = button7.getActionMap();
		am7.put("7",new KeyAction('7'));
		
		InputMap im8 = button8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		im8.put(KeyStroke.getKeyStroke(KeyEvent.VK_8,0,true),"8");
		im8.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8,0,true),"8");
		ActionMap am8 = button8.getActionMap();
		am8.put("8",new KeyAction('8'));
		
		InputMap im9 = button9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		im9.put(KeyStroke.getKeyStroke(KeyEvent.VK_9,0,true),"9");	
		im9.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9,0,true),"9");
		ActionMap am9 = button9.getActionMap();
		am9.put("9",new KeyAction('9'));
	}
	
	private void addButtonListeners() {
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		
		buttonDiv.addActionListener(this);
		buttonMult.addActionListener(this);
		buttonSub.addActionListener(this);
		buttonAdd.addActionListener(this);
		buttonEq.addActionListener(this);
		
		buttonProc.addActionListener(this);
		buttonSqrt.addActionListener(this);
		buttonCom.addActionListener(this);
		buttonBack.addActionListener(this);
		buttonClear.addActionListener(this);
	}

	private void addElements() {
		buttonPanel.add(buttonClear);
		buttonPanel.add(buttonBack);
		buttonPanel.add(buttonSqrt);
		buttonPanel.add(buttonProc);
		
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		buttonPanel.add(buttonDiv);
		
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(buttonMult);
		
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(buttonSub);
		
		buttonPanel.add(buttonCom);
		buttonPanel.add(button0);
		buttonPanel.add(buttonEq);
		buttonPanel.add(buttonAdd);
		
		result.add(calc);
		
		add(gui);
		gui.add(result);
		gui.add(buttonPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) throws ArithmeticException{
		Object src = e.getSource();
		if(src == button0) {
			//System.out.println(0);
			input += 0;
			calcText += 0;
		}
		else if(src == button1 && operations != Operation.EQ) {
			//System.out.println(1);
			input += 1;
			calcText += 1;
		}
		else if(src == button2 && operations != Operation.EQ) {
			//System.out.println(2);
			input += 2;
			calcText += 2;
		}
		else if(src == button3 && operations != Operation.EQ) {
			//System.out.println(3);
			input += 3;
			calcText += 3;
		}
		else if(src == button4 && operations != Operation.EQ) {
			//System.out.println(4);
			input += 4;
			calcText += 4;
		}
		else if(src == button5 && operations != Operation.EQ) {
			//System.out.println(5);
			input += 5;
			calcText += 5;
		}
		else if(src == button6 && operations != Operation.EQ) {
			//System.out.println(6);
			input += 6;
			calcText += 6;
		}
		else if(src == button7 && operations != Operation.EQ) {
			//System.out.println(7);
			input += 7;
			calcText += 7;
		}
		else if(src == button8 && operations != Operation.EQ) {
			//System.out.println(8);
			input += 8;
			calcText += 8;
		}
		else if(src == button9 && operations != Operation.EQ) {
			//System.out.println(9);
			input += 9;
			calcText += 9;
		}
		else if(src == buttonDiv ) {
			//System.out.println(".");
			if(input.length() > 0) {
				buffer1 = Double.parseDouble(input);
				operations = Operation.DIV;
				input = "";
				calcText = "";
			}
			isInt = true;
		}
		else if(src == buttonMult) {
			if(input.length() > 0) {
				buffer1 = Double.parseDouble(input);
				operations = Operation.MULT;
				input = "";
				calcText = "";
			}
			isInt = true;
		}
		else if(src == buttonSub) {
			//System.out.println(".");
			if(input.length() > 0) {
				buffer1 = Double.parseDouble(input);
				operations = Operation.SUB;
				input = "";
				calcText = "";
			}
			else {
				input += "-";
				calcText += "-"; // Exception to handle: writing "-" more than one
			}
			isInt = true;
			
		}
		else if(src == buttonAdd) {
			//System.out.println(".");
			if(input.length() > 0) {
				buffer1 = Double.parseDouble(input);
				operations = Operation.ADD;
				input = "";
				calcText = "";
				isInt = true;
			}
		}
		else if(src == buttonSqrt) {
			operations = Operation.EQ;
			buffer2 = Double.parseDouble(input);
			calcText = Double.toString(Math.sqrt(buffer2));
			buffer1 = 0;
			buffer2 = 0;
			input = calcText;
			isInt = true;
		}
		else if(src == buttonCom) {
			System.out.println(".");
			if(calcText.length() > 0 && isInt) {
				input += ".";
				calcText += ".";
				isInt = false;
			}
		}
		else if(src == buttonBack) {
			//System.out.println(".");
			calcText = calcText.substring(0 , calcText.length() - 1);
		}
		else if(src == buttonClear) {
			//System.out.println(".");
			calcText = "";
			input = "";
			buffer1 = 0;
			buffer2 = 0;
			isInt = true;
		}
		else if(src == buttonEq) {
			//System.out.println("=");
			if(input.length()>0) {
				if(operations == Operation.DIV) {
					buffer2 = Double.parseDouble(input);
					if(buffer2 == 0) {
						buffer1 = 0;
						operations = Operation.EQ;
						throw new ArithmeticException("Dividing by 0");
					}
					else {
						calcText = Double.toString(buffer1/buffer2);
						input = calcText;
						buffer1 = 0;
						buffer2 = 0;
						operations = Operation.EQ;
					}
				}
				else if(operations == Operation.MULT) {
					buffer2 = Double.parseDouble(input);
					calcText = Double.toString(buffer1*buffer2);
					input = calcText;
					buffer1 = 0;
					buffer2 = 0;
					operations = Operation.EQ;
				}
				else if(operations == Operation.SUB) {
					buffer2 = Double.parseDouble(input);
					calcText = Double.toString(buffer1 - buffer2);
					input = calcText;
					buffer1 = 0;
					buffer2 = 0;
					operations = Operation.EQ;
				}
				else if(operations == Operation.ADD) {
					buffer2 = Double.parseDouble(input);
					calcText = Double.toString(buffer1 + buffer2);
					input = calcText;
					buffer1 = 0;
					buffer2 = 0;
					operations = Operation.EQ;
				}
			}
		}
		
		
			calc.setFont(kenobi);
			calc.setText(calcText);
	}

}

