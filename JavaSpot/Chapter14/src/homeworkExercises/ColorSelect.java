package homeworkExercises;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorSelect extends JFrame {

	private JComboBox cbColors;
	private JCheckBox ckBackground;
	private JCheckBox ckForeground;
	private JLabel lblBackground;
	private JLabel lblForeground;
	private JButton btnOK;
	private JButton btnCancel;
	private Container container;
	private FlowLayout flowLayout;
	private BorderLayout borderLayout;
	private JPanel cbPanel;
	private JPanel ckBoxPanel;
	private JPanel btnPanel;
	private static final String[] colorList = {"Blue", "Red", "Green", "Yellow"};
	private static final Color[] colors = {Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW};
	
	//construct to add ColorSelect to GUI
	public ColorSelect() {
		super("ColorSelect");
		
		//create base layer layout
		container = getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		
		
		//create combobox and add it to the container
		cbColors = new JComboBox(colorList);
		cbColors.setMaximumRowCount(4);
		
		//create cbJPanel and layout
		borderLayout = new BorderLayout();
		cbPanel = new JPanel();
		cbPanel.setLayout(borderLayout);
		
		//add combobox to panel and add panel to frame
		cbPanel.add(cbColors);
		add(cbPanel, BorderLayout.NORTH);
		
		//declare flow layout
		flowLayout = new FlowLayout();
		
		//declare components for the ckBoxPanel
		ckBackground = new JCheckBox();
		ckForeground = new JCheckBox();
		lblBackground = new JLabel("Background");
		lblForeground = new JLabel("Foreground");
		
		//create ckboxPanel and add components to it
		ckBoxPanel = new JPanel();
		ckBoxPanel.setLayout(flowLayout);
		ckBoxPanel.add(ckBackground);
		ckBoxPanel.add(lblBackground);
		ckBoxPanel.add(ckForeground);
		ckBoxPanel.add(lblForeground);
		
		//add ckBoxPanel to the container
		add(ckBoxPanel);
		
		//declare components for the btnPanel
		btnOK = new JButton("OK");
		btnCancel = new JButton("Cancel");
		
		//create btnPanel and add components
		btnPanel = new JPanel();
		btnPanel.setLayout(flowLayout);
		btnPanel.add(btnOK);
		btnPanel.add(btnCancel);
		
		//add btnPanel to the container
		add(btnPanel);
		
	}
}
