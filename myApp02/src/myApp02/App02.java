package myApp02;

import java.util.Scanner;




public class App02 {

	public static void main(String[] args) {
	 
		Scanner input = new Scanner(System.in);
		
		String text;
		System.out.print("Please enter your name: ");
		text = input.nextLine();
		
		System.out.print("Good afternoon, "  +  text);

	}

}
