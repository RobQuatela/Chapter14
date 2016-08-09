package homeworkExercises;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Temperature extends JFrame {

	private JTextField txtFar; //fahrenheit temp
	private JLabel lblCel; //celsius temp
	private JLabel lblFarName;
	private JLabel lblCelName;
	private JButton btnConvert;
	private BoxLayout boxLayout;
	private FlowLayout flowLayout;
	private Container container;
	private JPanel txtPanel;
	private JPanel lblPanel;
	private JPanel btnPanel;
	
	//create gui
	public Temperature() {
		super("Temperature Conversion");
		
		//set up the containerx
		container = getContentPane();
		boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(boxLayout);
		
		//set up panel to store txtbox
		txtPanel = new JPanel();
		flowLayout = new FlowLayout();
		txtPanel.setLayout(flowLayout);
		
		//set up pane lt store label
		lblPanel = new JPanel();
		lblPanel.setLayout(flowLayout);
		
		//set up btn panel to store button
		btnPanel = new JPanel();
		btnPanel.setLayout(flowLayout);
		
		//set up label names
		lblFarName = new JLabel("Fahrenheit:");
		lblCelName = new JLabel("Celsius:");
		
		//set up txtbox and label
		txtFar = new JTextField(10);
		lblCel = new JLabel();
		
		//set up button
		btnConvert = new JButton("Convert");
		
		//set up action listener
		BtnConvertHandler handler = new BtnConvertHandler();
		
		//assign action listener to button
		btnConvert.addActionListener(handler);
		
		//add fahrenheit to panel
		txtPanel.add(lblFarName);
		txtPanel.add(txtFar);
		
		//add celcius to its panel
		lblPanel.add(lblCelName);
		lblPanel.add(lblCel);
		
		//add button to its panel
		btnPanel.add(btnConvert);
		
		//add panels to the frame
		add(txtPanel);
		add(lblPanel);
		add(btnPanel);
		
	}
	
	private class BtnConvertHandler implements ActionListener {
		private double far;
		private double cel;
		
		public void actionPerformed(ActionEvent event) {
			far = Double.parseDouble(txtFar.getText());
			cel = (5/9) * (far - 32);
			System.out.println(cel);
			lblCel.setText(String.valueOf(cel));
		}
	}
}
		
		
		