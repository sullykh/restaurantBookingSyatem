package exercisesMenu;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			int input; 
			
			
			System.out.println("Please select which exercise you want to run - \n 1. Fizzbang - \n 2. Populate - \n 3. Print Backwards - \n 4. Factorial");
			input = scan.nextInt();
			
			switch(input) {
			
			case 1: fizzBang();
			break;
			
			
			case 2: populate();
				
			int[] bobby = populate();
			
			for(int i = 0; i < bobby.length; i++) {
				System.out.println(bobby[i]);
			}
			
			break;
			
			case 3 : 
				String word = "Glasses";
				printBackwards(word);
				break;
			
			
		    
			case 4: 
				int num = 3;
				System.out.println(factorial(num));
				
		}	
			
	}
	
	
	private static void fizzBang() {

		
		for (int i = 0; i < 100; i++) {
			
			//Check if I is both
			if (i %3 == 0 && i % 5 == 0 ) { 
				System.out.println("Fizzbang");
				continue;
			}
			//Check if i is a multiple of 3
			if (i % 3 == 0) {
				
				System.out.println("Fizz");
				continue;
			}
			
			//Check if i is a multiple of 5
			if (i % 5 == 0) {
				System.out.println("Bang");
				continue;
			
			
			} else {
				System.out.println(i);
				
				//otherwise print
		 
				
			}
			
			
			
		
			 
			
		}	
			
		
	}


	private static int[] populate() {
		// create an array. loop through it, and populate it with random number.
		int[] array = new int[10];
		Random randy = new Random();
		
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = randy.nextInt(100)+1;
			
		}
		
		return array;
		
	}

	private static void printBackwards(String unoReverseCard) {
		//print this reverse
		System.out.println(unoReverseCard);
		
		for (int i = unoReverseCard.length()-1; i >= 0; i--) {
			
			System.out.print(unoReverseCard.charAt(i));
		}
	}

	private static int factorial(int num) { 
		
		if(num == 1) {
			
			return num;
			
		}else {
			return factorial(num-1) * num;
		}
		
		
	}
	
}




 