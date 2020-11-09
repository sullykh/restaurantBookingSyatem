package menu;

import java.util.Scanner;

public class menu {
	
	//Shared sources
	static double balance = 990;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int options;
		
		while(true) {
		
		// Display options 
		System.out.println(" ----------------------------------------------------");
		System.out.println("Main menu \n 1 Check balance"
				+ "\n 2 Deposit \n 3 Withdraw  \n 4 Quit  ");
		
		
		// Ask for options 
		System.out.println();
		System.out.println("Press which option you would like  > ");
		
		
		// Get the options 
		options = input.nextInt();
		
		switch(options) {
		
		// 1 check balance
		case 1 : checkBalance();
		break;
		
		// 2 deposit
		case 2 : deposit();
		break;
		
		// 3 Withdraw
		case 3 : withdraw();
		break;
		
		// 4 Quit
		case 4 : break;
		
		default:
			System.out.println("Invalid option, valid options are 1-4");
		    } 
		
	      } 
	} // ending of main method 
	
	
	private static void withdraw() {
		// Ask the user how much they need
		System.out.print("Please, how much do you need?");
		double amount = input.nextDouble();
		
		if(balance >= amount ) {
		// update the balance
			
			//notification 
	
		balance = balance - amount;
		
		
		
		System.out.println("Completed succuessfully, the new balance is " + balance); 
		}else 
			System.out.println("Insufficient funds."); 
		
		
	}

	
	
	// Display balance method
	public static void checkBalance() {
		System.out.println("The account balance is " + balance);
	}
	
	//Deposit method
	public static void deposit() {
	//Ask the user, how much they want deposit
		System.out.println("How much would you like to deposit? ");
		double amount = input.nextDouble();
	
	
	//Update the balance
	 balance = balance + amount; 
	 
	
}


}
