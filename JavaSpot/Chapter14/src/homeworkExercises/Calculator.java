package homeworkExercises;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private JTextField field;
	private JButton[][] buttons;
	private JButton[] secondRow;
	private JButton[] thirdRow;
	private JButton[] fourthRow;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnDivide;
	private JButton btnAdd;
	private JButton btnSubtract;
	private JButton btnEqual;
	private JButton btnDot;
	private JButton btnMultiply;
	private GridLayout layout;
	private BorderLayout borderLayout;
	private Container container;
	private JPanel textPanel;
	private JPanel buttonPanel;
	
	public Calculator() {
		super("Calculator");
		
		layout = new GridLayout(4,4);
		container = getContentPane();
		container.setLayout(layout);
		
		textPanel = new JPanel();
		//borderLayout = new BorderLayout();
		textPanel.setLayout(layout);
		
		
		field = new JTextField();
		textPanel.add(field);
		add(textPanel, BorderLayout.NORTH);
		
		buttons = new JButton[4][4];
		buttons[0][0] = new JButton("7");
		buttons[0][1] = new JButton("8");
		buttons[0][2] = new JButton("9");
		buttons[0][3] = new JButton("/");
		buttons[1][0] = new JButton("4");
		buttons[1][1] = new JButton("5");
		buttons[1][2] = new JButton("6");
		buttons[1][3] = new JButton("*");
		buttons[2][0] = new JButton("1");
		buttons[2][1] = new JButton("2");
		buttons[2][2] = new JButton("3");
		buttons[2][3] = new JButton("-");
		buttons[3][0] = new JButton("0");
		buttons[3][1] = new JButton(".");
		buttons[3][2] = new JButton("=");
		buttons[3][3] = new JButton("+");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		secondRow = new JButton[4];
		secondRow[0] = new JButton("4");
		secondRow[1] = new JButton("5");
		secondRow[2] = new JButton("6");
		secondRow[3] = new JButton("*");
		
		thirdRow = new JButton[4];
		thirdRow[0] = new JButton("1");
		thirdRow[1] = new JButton("2");
		thirdRow[2] = new JButton("3");
		thirdRow[3] = new JButton("-");
		
		fourthRow = new JButton[4];
		fourthRow[0] = new JButton("0");
		fourthRow[1] = new JButton(".");
		fourthRow[2] = new JButton("=");
		fourthRow[3] = new JButton("+");
		
		*/
		
		
		
		
		
		
		/*btn7 = new JButton("7");
		container.add(btn7);
		
		btn8 = new JButton("8");
		add(btn8);
		
		btn9 = new JButton("9");
		add(btn9);
		
		btnDivide = new JButton("/");
		add(btnDivide);
		
		btn4 = new JButton("9");
		add(btn4);
		
		btn5 = new JButton("5");
		add(btn5);
		
		btn6 = new JButton("6");
		add(btn6);
		
		btnMultiply = new JButton("*");
		add(btnMultiply);
		
		btn1 = new JButton("1");
		add(btn1);
		
		btn2 = new JButton("2");
		add(btn2);
		
		btn3 = new JButton("3");
		add(btn3);
		
		btnSubtract = new JButton("-");
		add(btnSubtract);
		
		btn0 = new JButton("0");
		add(btn0);
		
		btnDot = new JButton(".");
		add(btnDot);
		
		btnEqual = new JButton("=");
		add(btnEqual);
		
		btnAdd = new JButton("+");
		add(btnAdd);*/
		
	}
}
