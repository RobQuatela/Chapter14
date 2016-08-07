package homeworkExercises;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Align extends JFrame {

	private JCheckBox ckSnap; //snap to grid
	private JCheckBox ckShow; //show to grid
	private JLabel lblSnap;
	private JLabel lblShow;
	private JLabel lblX;
	private JLabel lblY;
	private JTextField txtX;
	private JTextField txtY;
	private JButton btnOK;
	private JButton btnCancel;
	private JButton btnHelp;
	private FlowLayout layout1;
	private FlowLayout layout2;
	private Container container;
	
	//construct to add tO Gui
	public Align() {
		super("Align");
		
		//layout1 = new FlowLayout();
		container = getContentPane();
		//container.setLayout(layout1);
		//layout1.setAlignment(FlowLayout.LEFT);
		
		layout2 = new FlowLayout();
		container.setLayout(layout2);
		
		
		ckSnap = new JCheckBox();
		add(ckSnap);
		
		lblSnap = new JLabel("Snap to Grid");
		container.add(lblSnap);
		
		ckShow = new JCheckBox();
		add(ckShow);
		
		lblShow = new JLabel("Show Grid");
		add(lblShow);
		
		lblX = new JLabel("X");
		add(lblX);
		
		txtX = new JTextField(5);
		add(txtX);
		
		lblY = new JLabel("Y");
		add(lblY);
		
		txtY = new JTextField(5);
		add(txtY);
		
		btnOK = new JButton("OK");
		add(btnOK);
		
		btnCancel = new JButton("Cancel");
		add(btnCancel);
		
		btnHelp = new JButton("Help");
		add(btnHelp);
	}
}
