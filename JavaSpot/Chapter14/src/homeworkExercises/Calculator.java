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
	private GridLayout gridLayout;
	private BorderLayout borderLayout;
	private Container container;
	private JPanel textPanel;
	private JPanel buttonPanel;
	
	public Calculator() {
		super("Calculator");
		
		//set layout for container
		borderLayout = new BorderLayout();
		
		//create container and set the border layout to the container
		container = getContentPane();
		container.setLayout(borderLayout);
		
		//create the textfield and add textfield to the panel
		field = new JTextField();
		add(field, BorderLayout.NORTH);
		
		//create dual array for buttons
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
		
		//declare the grid layout
		//declare buttonPanel set layout for button panel
		//add grid layout to the panel
		gridLayout = new GridLayout(4,4);
		buttonPanel = new JPanel();
		buttonPanel.setLayout(gridLayout);
		
		//add button array to buttonPanel
		for(int i = 0; i < buttons.length; i++) {
			for(int t = 0; t < buttons[i].length; t++) {
				buttonPanel.add(buttons[i][t]);
			}
		}
		
		//add butonPanel to frame
		add(buttonPanel);		
	}
}
