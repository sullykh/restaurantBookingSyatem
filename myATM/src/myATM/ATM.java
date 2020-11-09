package myATM;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		float balance = 750, amount; 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please, how you would you like to withdraw? ");
		amount = input.nextFloat(); 
		
		if(amount <= balance) {
			System.out.println("Please take your card" + " and wait for the cash.");
		}
		
		else 
			System.out.print("Insufficient funds in your account.");
		}
		
	}


