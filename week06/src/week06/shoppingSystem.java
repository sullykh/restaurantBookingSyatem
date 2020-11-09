/* This is a demo developing a shopping system (prototype)
 * 
 * Requirement of a shopping system:
 * 0- Generic description of the items:
 * 		-name
 * 		-code
 * 		-price
 * 		-quantity
 * 		-description
 * 		-discount/promotion -- management
 * 		-vouchers -- management
 * 
 * 1- List of products and cost
 * 2- Cart
 * 3- Search/Browsing
 * 4- Payment system
 * 5- Delivery options
 * 6- Order confirmation 
 * --------------------------------------------------------------------------------------
 * 
 * Algorithm
 * 
 * 
 * Generic description of the items: name, code, price, quantity
 * 
 * Database for the products/items: has to reflect all these components for the items
 * 
 * Table for the cart, where a customer can store selected item before payment 
 * Also the cart has to capture these components of the items. 
 * 
 * 
 * 
 * 
 * 
 * Start
 *-1- Login System
 *	  Ask user enter username and password	
 *	  take username and password	
 *	  check if its correct login
 *	  else show a message that invalid username or password
 *-2- List of products: -method
 *	  Ask the user to enter item code
 *	  Entering item code
 *	  Take item code
 *	  Ask for the quantity 
 *	  Check if it is available in the stock
 *	 	if available add it to the cart
 *		else show a message out of stock
 *-4- Show cart with the total
 *	  --Expand this as a method
 *	
 */


package week06;
import java.util.ArrayList;
import java.util.Scanner; 


// create a class item

class item {
	
	//a constructor 
	
	
	String name;
	int code;
	float price; 
	int qty;
	String description;
	
	//Method 1
	String getName() {
		return name;
		
	}
		//method 2: display details of an object
		String details () {
			System.out.println(   code  + " \t: " + name + " \t: "  + price + " \t: " + qty +  " \t: " + description   );
		}
	}








public class shoppingSystem {
	
	//facility for getting input
	
	
	
	// An object of item 
	
	// Definition of stocks
	
	// Basket 
	
	
	static Scanner input = new Scanner(System.in);
	
	//Generic description of the items: name, code, price, quantity
	  
	 // Database for the products/items: has to reflect all these components for the items
	// An array list to represent the database. (week 04)
	
	 static ArrayList<String>  itemName  = new ArrayList<String>(); //name
	 static ArrayList<Integer> itemCode  = new ArrayList<Integer>(); //code
	 static ArrayList<Float>  itemPrice = new ArrayList<Float>();  //price
	 static ArrayList<Integer>  itemQty   = new ArrayList<Integer>(); //quantity
	 static ArrayList<String>  itemDescription = new ArrayList<String>(); //Description
	 
	 
	 // Table for the cart, where a customer can store selected item before payment 
	 // Also the cart has to capture these components of the items. 

	 
	 
	 static ArrayList<String>  basketName  = new ArrayList<String>(); //name
	 static ArrayList<Integer> basketCode  = new ArrayList<Integer>(); //code
	 static ArrayList<Float>  basketPrice = new ArrayList<Float>();  //price
	 static ArrayList<Integer>  basketQty   = new ArrayList<Integer>(); //quantity
	 static ArrayList<String>  BasketDescription = new ArrayList<String>(); //Description
	 
	 
	public static void main(String[] args) {

		//Variable
		String username = "aaa", password = "123", tempUsername, tempPwd;
			int tempItemCode, tempItemQty;
		
			
		//Exercise: create a method for adding items, to eliminate redundant code. 	
		//Add some items into the store like: Tshirt, pen, book, hat
		itemName.add("Tshirt");
		itemCode.add(01);
		itemPrice.add((float) 9.99);
		itemQty.add(15);
		itemDescription.add("A nice shirt"); 
		
		
		
		itemName.add("Pen");
		itemCode.add(02);
		itemPrice.add((float) 0.99);
		itemQty.add(30);
		itemDescription.add("Perfect for writing");
		
		
		itemName.add("Book");
		itemCode.add(03);
		itemPrice.add((float) 1.99);
		itemQty.add(20);
		itemDescription.add("Excellent Read");
		
		
		itemName.add("Hat");
		itemCode.add(04);
		itemPrice.add((float) 3.99);
		itemQty.add(20);
		itemDescription.add("Very stylish");
		
		
		
		// Exercise: create sign-up system, it could be another method
		//Start
		// 0- Sign-up system (Optional)
		// 1- Login system
			//Ask user to enter username and password
		 
		  
		  
		  
		  //check if login is correct
		  //else show a message displaying invalid username or password
		Scanner input = new Scanner(System.in); 
		
		while(true) {
			  
			  
			  System.out.print("Please enter your username and password");
			  
			  //take the username and password
			  tempUsername = input.nextLine();
			  tempPwd = input.nextLine();
			  
		//Management login details 
			  
			 if (tempUsername.equals ("mgnt")  &&  tempPwd.equals("0000")) {
				 
				 managementSection();
			 }
			  
		  
		  if( (username == tempUsername)  && (password == tempPwd) ) {
			  break;
		  }
		  else {
			  	System.out.println("Invalid username or password");
		  }
		 
		  }  
		 
		 
		 // -2- List of products: -method
		  // Name code price
		  
		  System.out.println( "Code \t: Name \t: Price \t: Qty   \t:    Description ");
		  for( int i = 0; i <itemName.size(); i++) {
			  
			  
			  System.out.print(itemCode.get(i) + "  : " + itemName.get(i) + " : "
					  
					  + itemPrice.get(i) + " : " + itemQty.get(i) + " : " +itemDescription.get(i));
		  }
			  
		 	// 3 select a product 
		  	//Ask user to enter an item code
		  System.out.println("Please enter an item code to select the item, or 0 for payment");
			  
			  //entering the code
		  tempItemCode = input.nextInt();
		  if(tempItemCode == 0 ) {
			 paymentMethod();
			 //termination point
			 break;
			  
		  } 
		  else {
			 //aSK FOR QUANTITY 
			  System.out.println("How many items do you need? >");
			  tempItemQty = input.nextInt();
			  
		  }
		  
		  //Check if it is available in the stock
		  if(itemQty.get(tempItemCode) == tempItemQty ) {
			  
			 //If available in the stock
			  addToBasket(tempItemCode, tempItemQty);
			  
			  //else show a message out of stock
		  } else {
			  System.out.println("Out of stock");
			  //exercise: display the available quantity 
			  
			  
		  }
	
		  
		  
		  // 4 show cart with the total 
		  paymentMethod();
		  		
		  
	}   
		  
		  
		  private static void displayBox() {
			  
			  System.out.println( "Code \t: Name \t: Price \t: Qty   \t:    Description ");
			  for( int i = 0; i <basketName.size(); i++) {
				  
				  
				  System.out.print(basketCode.get(i) + "  : " + basketName.get(i) + " : "
						  
						  + basketPrice.get(i) + " : " + basketQty.get(i) + " : " );
			  }
		  }
		  
		  
		  
		  		//Add the specification of an item into a box 
		  
		  private static void addToBasket(int tempItemCode, int tempItemQty) {
				basketCode.add(tempItemCode);
				  
				  basketName.add( itemName.get(tempItemCode) );
				  basketQty.add(tempItemQty); 
				  basketPrice.add( tempItemQty  *  itemPrice.get(tempItemCode));
				  
				
			}
		  
		 
		
	


	


				private static void paymentMethod() {
					float cost = 0, amount;
					
					for (int i=0; i< basketName.size(); i++) {
						cost += basketPrice.get(i);
					}
					
					//display the total cost
					System.out.println("The total cost is " + cost);
					
					System.out.println(" Please, enter an amount for the payment >");
					
					
					
					if( amount > cost) {
						
						System.out.print("Your change is " + (amount - cost) );
					}
					
				}	
					
					
				private static void managementSection() {
					
					
				}
					
				
					
					
				
			
			}
