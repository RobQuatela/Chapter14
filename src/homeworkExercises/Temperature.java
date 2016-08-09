package homeworkExercises;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Temperature extends JFrame {

	private JTextField txtFar; //fahrenheit temp
	private JTextField txtCel;
	private JComboBox cbTempSet;
	private JComboBox cbTempGet;
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
	private String[] temperature = {"Fahrenheit", "Celcius", "Kelvin"};
	
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
		
		//set up comboboxes
		cbTempSet = new JComboBox(temperature);
		cbTempSet.setMaximumRowCount(3);
		cbTempGet = new JComboBox(temperature);
		cbTempGet.setMaximumRowCount(3);
		
		//set up txtbox and label
		txtFar = new JTextField(10);
		txtCel = new JTextField(10);
		txtCel.setEditable(false);
		
		//set up button
		btnConvert = new JButton("Convert");
		
		//set up action listener
		BtnConvertHandler handler = new BtnConvertHandler();
		
		//assign action listener to button
		btnConvert.addActionListener(handler);
		
		//add fahrenheit to panel
		//txtPanel.add(lblFarName);
		txtPanel.add(cbTempSet);
		txtPanel.add(txtFar);
		
		//add celcius to its panel
		lblPanel.add(cbTempGet);
		lblPanel.add(txtCel);
		
		//add button to its panel
		btnPanel.add(btnConvert);
		
		//add panels to the frame
		add(txtPanel);
		add(lblPanel);
		add(btnPanel);
		
	}
	
	//private inner class for event handler
	private class BtnConvertHandler implements ActionListener {
		private double far;
		private double cel;
		private double kel;
		private DecimalFormat f = new DecimalFormat("##.00");
		
		//action to convert temperature
		public void actionPerformed(ActionEvent event) {
			if(cbTempSet.getSelectedItem() == "Fahrenheit" && cbTempGet.getSelectedItem() == "Celcius") {
				far = Double.parseDouble(txtFar.getText());
				cel = 5.0 / 9.0 * (far - 32);
				txtCel.setText(String.valueOf(f.format(cel)));
			}
			else if(cbTempSet.getSelectedItem() == "Fahrenheit" && cbTempGet.getSelectedItem() == "Kelvin") {
				far = Double.parseDouble(txtFar.getText());
				cel = 5.0 / 9.0 * (far - 32);
				kel = cel + 273.15;
				txtCel.setText(String.valueOf(f.format(kel)));
			}
			else if(cbTempSet.getSelectedItem() == "Celcius" && cbTempGet.getSelectedItem() == "Fahrenheit") {
				cel = Double.parseDouble(txtFar.getText());
				far = 9.0 / 5.0 * cel + 32;
				txtCel.setText(String.valueOf(f.format(far)));
			}
			else if(cbTempSet.getSelectedItem() == "Celcius" && cbTempGet.getSelectedItem() == "Kelvin") {
				cel = Double.parseDouble(txtFar.getText());
				kel = cel + 273.15;
				txtCel.setText(String.valueOf(f.format(kel)));
			}
			else if(cbTempSet.getSelectedItem() == "Kelvin" && cbTempGet.getSelectedItem() == "Fahrenheit") {
				kel = Double.parseDouble(txtFar.getText());
				cel = kel - 273.15;
				far = 9.0 / 5.0 * cel + 32;
				txtCel.setText(String.valueOf(f.format(far)));
			}
			else if(cbTempSet.getSelectedItem() == "Kelvin" && cbTempGet.getSelectedItem() == "Celcius") {
				kel = Double.parseDouble(txtFar.getText());
				cel = kel - 273.15;
				txtCel.setText(String.valueOf(f.format(cel)));
			}
		}
	}
}
