package pluralArrays;
import java.util.ArrayList;
import java.util.Scanner;





public class ShoppingSystem {

	// A facility for getting input
	static Scanner input = new Scanner(System.in);

//	Generic description of the items: name, code, price, quantity and description
//	Database for the products/items: has to reflects all these components of the items
	// An array or list to represent the database, from Week 04
	static ArrayList<String>  itemName  = new ArrayList<String>();   // name
	static ArrayList<Integer> itemCode  = new ArrayList<Integer>();  // code
	static ArrayList<Float>   itemPrice = new ArrayList<Float>();   // price
	static ArrayList<Integer> itemQty   = new ArrayList<Integer>();  // Quantity
	static ArrayList<String>  itemDescription = new ArrayList<String>();  // Description


//	Table for the cart, where a customer can store selected item before payment
//	Also the cart has to capture these components of the items.
	static ArrayList<String>  basketName  = new ArrayList<String>();   // name
	static ArrayList<Integer> basketCode  = new ArrayList<Integer>();  // code
	static ArrayList<Float>   basketPrice = new ArrayList<Float>();   // price
	static ArrayList<Integer> basketQty   = new ArrayList<Integer>();  // Quantity
	static ArrayList<String>  basketDescription = new ArrayList<String>();  // Description (optional)

	
	// Create a variable option that you can use in multiple methods. 
	
	
	
	public static void main(String[] args) {
		
		// Variable
		String username = "aaa", password = "123", tempUsername, tempPwd; 
		int tempItemCode, tempItemQty;
		
		
		// Exercise 06: create a method for adding items, to eliminate redundant code.
		// There is something interesting, depending on how you approach it.
		// Give it a go, we will discuss this next week in discussing object and class.		
		// Add some items into the store, like: shirt, pen, book, hat
		itemName.add("Shirt");
		itemCode.add(01);
		itemPrice.add((float) 9.99);
		itemQty.add(15);
		itemDescription.add("A nice shirt");
		
		itemName.add("Pen");
		itemCode.add(02);
		itemPrice.add((float) 0.99);
		itemQty.add(30);
		itemDescription.add("A good for writing");
		
		
		itemName.add("Book");
		itemCode.add(03);
		itemPrice.add((float) 1.99);
		itemQty.add(20);
		itemDescription.add("Excellent book");
		
		itemName.add("Hat");
		itemCode.add(04);
		itemPrice.add((float) 3.99);
		itemQty.add(20);
		itemDescription.add("Good hat");
		//-----------------------------------------------------------------------------		


		// Exercise 01: create sing-up system. It could be another method.
		//Start
		// -0- Sign-up system (Optional)
		// -1- Login system
			// Ask user enter username and password
		
		
		// Exercise 02: convert the login system into a method.
		while(true) {
		System.out.print("Please enter your username and password" );
		
		//	Take the username and password
		tempUsername =  input.nextLine();
		tempPwd      =  input.nextLine();
		
		
		
		// Management login details
		if( tempUsername.equals( "mgnt")  &&   tempPwd.equals("0000")    ) {
			managementSection();			
		}
		//	Check if it is correct login
		//	else show a message that invalid username or password.
		else if( (username.equals(tempUsername)) && (password.equals(tempPwd) ) ) {
			break;	
		}
		else {
			System.out.println("Invalid name or password");
			}
		}
		//-----------------------------------------------------------------------------
		
		
		// Exercise 03: convert this into another method.
		// -2- List of products: -method
		//  Name 	 Code 	 Price 		Quantity 	Description
		System.out.println( "Code \t: Name \t: Price \t: Qty\t: Description" );
			for( int i=0; i< itemName.size(); i++ ) {
			
			System.out.println(itemCode.get(i) + " \t: " + itemName.get(i) + "\t: "  
						+ itemPrice.get(i) + " \t\t:" + itemQty.get(i) + "\t: " + itemDescription.get(i));		
		}
		
		while(true) {	
//		-3- Select a product
//			Ask the user to enter item code
		System.out.println("Please enter an item code to select the item, or 0 for payment ");

		// Entering item code
		tempItemCode = input.nextInt() ;   // To fix???
 		if(tempItemCode-- == 0) {    // Not a good software engineering? Think of a better way of addressing this?
			 paymentMethod();
			 // termination point
			 break;
		}
		else {
			
			// ???
			
			//	Ask for the quantity
			System.out.println("How many do you need? > ");
			tempItemQty = input.nextInt();
			

		 //	Check if it is available in the stock
			if(itemQty.get(tempItemCode) >= tempItemQty ) {			
//			    if available add it to the cart
				 addToBasket(tempItemCode, tempItemQty);
			}	
//			    else show a message out of stock
			else{
				System.out.println("Out of stock");
				// Exercise 05: display the available quantity/
			}
			
			//		-4- Show cart with the total
				displayBox();
			
//		    -- Expand this as a method
		}
	}  
	// --------------------------------------------------------------------------	
		
	
	}  // Ending of main method



	private static void displayBox() {
		
		
		// 		Name  Code  Price
		System.out.println( "Code \t: Name \t: Price \t: Qty\t: Description" );
			for( int i=0; i< basketName.size(); i++ ) {
			
			System.out.println(basketCode.get(i) + " \t: " + basketName.get(i) + "\t: "  
						+ basketPrice.get(i) + " \t\t:" + basketQty.get(i) );		
		}
	}   // Ending of displaying box




	// Add the specification of an item into a box
	private static void addToBasket(int tempItemCode, int tempItemQty) {
	
		basketCode.add(tempItemCode);
		basketName.add(  itemName.get(tempItemCode) );
		basketQty.add( tempItemQty);
		basketPrice.add( tempItemQty * itemPrice.get(tempItemCode));
		
	}  // Ending of thwe payment method


	
	

	// A method for the payment
	private static void paymentMethod() {
		
		float cost = 0, amount;
		
		for( int i=0; i< basketName.size(); i++ ) {
			cost += basketPrice.get(i);
		}
		
		// Display the total cost
		System.out.println("The total cost  is " + cost );
		
		
		
		// Exercise 04: check if the cost > 00
		System.out.println("Please, enter an amount for the payment > ");
		amount  = input.nextFloat();
		
		
		if(amount > cost ) {
			System.out.println("Your change is " + (amount - cost )  );
		}
		
		System.out.println("Thank you for shopping, please take your stuff.");
		
		
		
		// Exercise 07:  reduce the quantity of the sold items?
		
		
		
	}  // Ending of the payment method

	
	
	



	private static void managementSection() {
		
		int option;
		
		do{
			// Create an interface for the following operations
			System.out.println(" Menu \n 1 for adding an item \n 2 for removing an item"
							 + "  \n 3 for adding promotion \n 4 for adding vouchers "
							 + "  \n 0 for Exit ");
		
			System.out.print("Please enter an option : > ");
			option = input.nextInt();
		
		switch(option) {
		
			// Add new item
			case 1:
			  addingItem();
			  break;
			  
			  
			// Remove an item
			case 2:
			  romovingItem();
			  break;
			  
			
			// - discount/promotion/  - managements
			case 3: 
			  addindDiscount();
			  break;
			  
			  
			// - vouchers -- management
			case 4:
			 addingVouchers();
			 break;
			 
	
			case 0:
			 // Exit
			 break;
			 
			default:
				System.out.println("Invalid option, please enter a valid option");
		}
		
	}while( option != 0 ); 

	} // Ending of the management section



	private static void addingVouchers() {
		// TODO Auto-generated method stub
		
		// Exercise 
	}



	private static void addindDiscount() {
		// TODO Auto-generated method stub
		
		
		// Exercise
	}



	private static void romovingItem() {
		// TODO Auto-generated method stub
		
		// Exercise
	}



	private static void addingItem() {
		
		String tempName, tempDescription;
		int tempItemCode, tempItemQty;
		float tempPrice;
		
		
		// Ask item name
		System.out.println("Please, enter item name > ");
		tempName = input.next();
		
		
		// Ask item code
		System.out.println("Please, enter item code > ");
		tempItemCode = input.nextInt();
	
		
		
		// Ask item price
		System.out.println("Please, enter item price > ");
		tempPrice = input.nextFloat();
	
		
		
		// Ask item Qty
		System.out.println("Please, enter item Qty ");
		tempItemQty = input.nextInt();
	
		
		
		// Ask item  description
		System.out.println("Please, enter item description ");
		tempDescription = input.nextLine();
	
		
		
		// Add the item specifications
		itemName.add( tempName );
		itemCode.add( tempItemCode );
		itemPrice.add( tempPrice );
		itemQty.add( tempItemQty );
		itemDescription.add( tempDescription );
		
		
		// ---------------
		//  Display the stocks, there should be a method but I will use the code for now.
		//  	Name 	 Code 	 Price 		Quantity 	Description
			System.out.println( "Code \t: Name \t: Price \t: Qty\t: Description" );
				for( int i=0; i< itemName.size(); i++ ) {
				
				System.out.println(itemCode.get(i) + " \t: " + itemName.get(i) + "\t: "  
							+ itemPrice.get(i) + " \t\t:" + itemQty.get(i) + "\t: " + itemDescription.get(i));		
			}
		// ---------------
		
		
		
		
	}  // Ending of adding item

	
	
	
}
