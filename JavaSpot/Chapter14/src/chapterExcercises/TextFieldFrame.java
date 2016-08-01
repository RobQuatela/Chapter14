package chapterExcercises;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {

	private JTextField txt1; //text field with set size
	private JTextField txt2; //text constructed with text
	private JTextField txt3; //text with text and size
	private JPasswordField pwd; //password field with text
	
	//textfieldframe constructor
	public TextFieldFrame() {
		super("Testing JTextField and JPasswordField");
		setLayout(new FlowLayout()); //set frame layout
		
		//construct text field with 10 columns
		txt1 = new JTextField(10);
		add(txt1);
	}
}
