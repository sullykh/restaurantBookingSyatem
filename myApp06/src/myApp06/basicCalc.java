package myApp06;



import javax.swing.JOptionPane;

public class basicCalc {

	public static void main(String[] args) {
		String n1, n2;
		
		n1 = JOptionPane.showInputDialog("Please enter the first number:");
		n2 = JOptionPane.showInputDialog("Please enter the second number");
		
		//Covert the input text into values
		
		float number1, number2;
		number1 = Float.parseFloat(n1);
		number2 = Float.parseFloat(n2);
		
		JOptionPane.showMessageDialog(null, number1 + " + " + number2 + " = " + (number1+number2)); 
		
	}

}
