package chapterExcercises;

import javax.swing.JOptionPane;

public class Addition {

	public static void main(String[] args) {
		//obtain user information from JOptionPane
		String firstNumber = JOptionPane.showInputDialog("Enter first number:");
		String secondNumber = JOptionPane.showInputDialog("Enter second number:");
		
		//convert to int
		int num1 = Integer.parseInt(firstNumber);
		int num2 = Integer.parseInt(secondNumber);
		
		//display result
		JOptionPane.showMessageDialog(null, "The sum is " + (num1 + num2), 
			"Sum of two integers", JOptionPane.PLAIN_MESSAGE);
	}
}
