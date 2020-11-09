package myApp05;

import java.util.Scanner;

public class App05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		
		
		System.out.println("Please enter your account balance:");
		n1 = input.next();
		
		System.out.println("Please enter the interest rate:");
		n2 = input.next();
		
		
		
		//Convert the input into two numbers.
		float number1, number2;
		number1 = Float.parseFloat(n1);
		number2 = Float.parseFloat(n2);
		
		System.out.println("Your new balance would be" + number1 + " + " + number2 + " = " + (number1 + (number2*100)));
		
		

	}

}
