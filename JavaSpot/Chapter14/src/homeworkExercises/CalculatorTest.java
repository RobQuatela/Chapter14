package homeworkExercises;

import javax.swing.JFrame;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setSize(500,500);
		calc.setVisible(true);
	}
}
