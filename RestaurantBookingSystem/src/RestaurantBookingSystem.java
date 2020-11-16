					import java.util.Scanner;
					import java.util.ArrayList;
					import java.util.ListIterator;
					import java.util.Random; 
					
					
				/*	Algorithm:
				 * 
				 * Start
					-Welcome to the restaurant message.
					-Customer initial name input. 

					-Ask customer to enter their name. 
					-Ask customer if they would like to book a table from the unassigned list or a random selection.
					- take user input.
						Check if user input is number 1 display the 2d array of tables 
					-display all tables using a method.
					- take user input.
					-assign selected table based on the input. (using a method)
					otherwise book a random table. 
					-Ask customer if they want another table booked or continue.
					- if option 9 is selected: 
					Display all tables
					assign selected table (using a method)
					If option 0 is selected: 
					Display a message showing the food menu.
					else any other input will display an “Invalid input” message.
					-display menu.
					-while loop based on Boolean true value.
					-print a message asking customer to enter the product code or 0 for payment.
					-take the user input “item code”.
					-if loop to check the user input
						In case the user press 0
						The final basket will be displayed. 
					-break to terminate the while loop
					-Otherwise continue the if loop.
					-Take user input for quantity.
					if loop to check if the item is in stock.
					if available, it will be added 
					otherwise a print message will show “Out of stock”.
					-Display the shopping basket.
					-print a message showing the payment confirmation.
					-end. */

					
					
					
					//Item class
					class Item{
					
						String name;
						int code;
						double price;
						int qty;
					
					}
					
					
					//Basket class
					class Basket{
					
						String name;
						int code;
						double price;
						int qty;
					
					
					}
					
					//The main class in the program.
					public class RestaurantBookingSystem {
					
					
						// Declared the share variable outside main method, such that we can use them in other methods
					
						static int min = 1, max = 41, newTable = 1, cost = 0,  x, y, random_int, code, qty, tempItemCode, tempItemQty, secondTable;
						static String tableArray, userName, name, tableInput;
						static double price;
					
					
						//Generic description of the items: name, code, price, quantity and description
						//Database for the products/items: has to reflects all these components of the items
						// An array or list to represent the database
						static ArrayList<String>  itemName  = new ArrayList<String>();   // name
						static ArrayList<Integer> itemCode  = new ArrayList<Integer>();  // code
						static ArrayList<Integer> itemPrice = new ArrayList<Integer>();   // price
						static ArrayList<Integer> itemQty   = new ArrayList<Integer>();  // Quantity
					
					
					
						//Table for the cart, where a customer can store selected item before payment
						//Also the cart has to capture these components of the items.
						static ArrayList<String>  basketName  = new ArrayList<String>();   // name
						static ArrayList<Integer> basketCode  = new ArrayList<Integer>();  // code
						static ArrayList<Integer> basketPrice = new ArrayList<Integer>();   // price
						static ArrayList<Integer> basketQty   = new ArrayList<Integer>();  // Quantity
					
					
						// an input facility
						static Scanner input = new Scanner(System.in);
					
					
						// 2d array that contains all tables.
						static String tables [][] = {	
								{" [00] " , " [01] " , " [02] " , " [03]  " , " [04] " , " [05] " , " [06]  "},
								{" [07] " , " [08] " , " [09] " , " [10]  " , " [11] " , " [12] " , " [13]  " + " \n "},
					
								{" [14] " , " [15] " , " [16] " , " [17]  " , " [18] " , " [19] " , " [20]  "},
								{" [21] " , " [22] " , " [23] " , " [24]  " , " [25] " , " [26] " , " [27]  " + " \n "},
					
								{" [28] " , " [29] " , " [30] " , " [31]  " , " [32] " , " [33] " , " [34]  "},
								{" [35] " , " [36] " , " [37] " , " [38]  " , " [39] " , " [40] " , " [41]  "}};
					
						// 2d array that contains reservation info for tables. 
						static boolean reservation [][] = 
									{{false, false, false, false, false, false, false},
									{false, false, false, false, false, false, false},
					
					
									{false, false, false, false, false, false, false},
					
									{false, false, false, false, false, false, false},
									{false, false, false, false, false, false, false}};
					
					
					
					
					
					
					
						//main method
						public static void main(String[] args) {
					
							//A list of menu items in an array style.
							itemName.add("Pizza     ");
							itemCode.add(1);
							itemPrice.add((int) 10);
							itemQty.add(50);
					
					
							itemName.add("Steak     ");
							itemCode.add(2);
							itemPrice.add((int) 7);
							itemQty.add(50);
					
					
					
							itemName.add("Sandwich  ");
							itemCode.add(3);
							itemPrice.add((int) 5);
							itemQty.add(50);
					
					
							itemName.add("Water     ");
							itemCode.add(4);
							itemPrice.add((int) 1);
							itemQty.add(30);
					
					
							itemName.add("Soft drink");
							itemCode.add(5);
							itemPrice.add((int) 2);
							itemQty.add(30);
					
							itemName.add("Tea       ");
							itemCode.add(6);
							itemPrice.add((int) 2);
							itemQty.add(20);
					
							itemName.add("Coffee    ");
							itemCode.add(7);
							itemPrice.add((int) 2);
							itemQty.add(20);
					
							itemName.add("Ice cream ");
							itemCode.add(8);
							itemPrice.add((int) 2);
							itemQty.add(20);
					
							itemName.add("Chocolate ");
							itemCode.add(9);
							itemPrice.add((int) 1);
							itemQty.add(30);
							//-----------------------------------------------------------------------------	
					
							//Welcome message to the customer
							System.out.println("Welcome to the booking system > ");
							System.out.println();
							//taking user input.
							System.out.println("Please enter your full-name> ");
							userName = input.nextLine();
					
					
							
							System.out.println("Thank you, " + userName + ".");	
							System.out.println();
							// a message to select the table booking options
							System.out.println("If you wish to book a table press 1, or press 0 for random table allocation.");
							int firstInput = input.nextInt();
					
							//if loop to check user input.
							if ( firstInput == 1) {
								displayTable1();
								assignTable(" [XX] ");
								System.out.println();
								displayTable1();
					
							} else { 
								randomTable(); //a method for selecting a random table.
					
							}
					
							//additional table booking option.
							System.out.println("If you would like to book another table please press 9 or press 0 to continue. ");
							secondTable = input.nextInt();
					
							//if loop in case the user select another table to book.
							if( secondTable == 9) {
								displayTable1();
					
					
								assignTable(" [XX] ");
					
								
							}else  if (secondTable == 0){ 
								//a message showing the main menu.
								System.out.println("Thank you. Please see the below menu...>>> ");
								System.out.println();
					
							}	else {
								//a message showing displayed when the user input the incorrect number.
								System.out.println("Invalid input. ");
					
							}
					
					
					
					
							itemList();
					
							while(true) {	
								//-3- Select a product
								//Ask the user to enter item code
								System.out.println();
								System.out.println("Please enter an item code to select the item or 0 to make a payment>> ");
					
								// Entering item code
								tempItemCode = input.nextInt() ;
								
								if(tempItemCode == 0) {    
									paymentMethod();
									// termination point
									break; 
								}
								else if (tempItemCode > 9) {
									System.out.println("Invalid entry, Please try again.");
								} else {
									
								
									//	Ask for the quantity
									System.out.println("How many would you like? > ");
									tempItemQty = input.nextInt();
					
					
									//	Check if it is available in the stock
									if(itemQty.get(tempItemCode) >= tempItemQty ) {			
										//    if available add it to the cart
										addToBasket(tempItemCode, tempItemQty);
									}
									
									
									if (tempItemCode == 10 ) {
										removeFromBasket(tempItemCode, tempItemQty);
									displayBox();
									}
									//    else show a message out of stock
									else{
										System.out.println("Out of stock.");
					
									}
									
								
					
									//	Show cart with the total
									
									displayBox();
									
									
								}
								
								
					
							}
							System.out.println();
							// A message displaying the final confirmation, with customer name, table number, total cost.
							System.out.println("A confirmation receipt for: " + userName + " ,Table number: "
									+ "[" + x + y + "]" + " ,Total cost: £" + cost + ".");
							
					
						} // Ending of main method
					
						// --------------------------------------------------------------------------	
					
					
						
					
					
						// A method for displaying the shopping basket
						private static void displayBox() {
					
					
							// 		Name  Code  Price
							System.out.println( "Code \t: Name    \t: Price    \t:Qty\t: " );
							for( int i=0; i< basketName.size(); i++ ) {
					
								System.out.println(basketCode.get(i) + " \t: " + basketName.get(i) + "\t: "  
										+ basketPrice.get(i) + " \t\t:" + basketQty.get(i) );		
							}
						}   // Ending of displaying box
						
						
						// remove the specification of an item into a box
						private static void removeFromBasket(int tempItemCode, int tempItemQty) {
					
							basketCode.remove(tempItemCode);
							basketName.remove(  itemName.get(tempItemCode) );
							basketQty.remove( tempItemQty);
							basketPrice.remove( tempItemQty * itemPrice.get(tempItemCode));
					
						} //------------- end of item removal method.
					
						// Add item properties into the shopping basket
						private static void addToBasket(int tempItemCode, int tempItemQty) {
					
							basketCode.add(tempItemCode);
							basketName.add(  itemName.get(tempItemCode) );
							basketQty.add( tempItemQty);
							basketPrice.add( tempItemQty * itemPrice.get(tempItemCode));
					
						} // End of the adding to basked method.   
					
					
					
					
					
						// A method for the payment
						private static void paymentMethod() {
					
							int amount;
					
							for( int i=0; i< basketName.size(); i++ ) {
								cost += basketPrice.get(i);
							}
					
							// Display the total cost
							System.out.println("The total cost  is £" + cost + ".");
							System.out.println();
					
					
							// payment instructions 
							System.out.println("Please make a payment...>>> ");
							amount  = input.nextInt();
							//check if the amount paid is greater than cost
					
							if(amount > cost ) {
								System.out.println("Your change is £" + (amount - cost ) );
					
					
								System.out.println("Thank you for shopping with us today! please collect your items.");
					
							} else {
								System.out.println("The payment has been rejected, please try again. ");
							}
					
					
						}  // Ending of the payment method
					
					
					
						//A method for displaying all tables
						public static void  displayTable1() {
						// a for loop to iterate through all row and columns in order to display tables. 
							for(int i =0; i<6; i++) {
								for(int j=0; j<7; j++) { 
									System.out.print(tables[i][j]);
					
								}
								System.out.println();
							}		
					
							System.out.println();
						}
					
						//A method for assigning tables 
						private static void assignTable( String tableInput) {
					
					
							while(true){	
					
								System.out.println("Enter a table number from the numbers above with a space in between the digits ");
					
					
					
								// Reads the positions for table number.
								x = input.nextInt(); 
								y = input.nextInt(); 
								tables[x][y] = "[XX]";
					
								// Check if the table is available before booking it.
								if(reservation[x][y] == false) {
									System.out.println("Your table is now booked.");
									// Terminate the loop a for booking the table.
								}
								else {
									System.out.println("The table is already booked.");
								}
								break;
							}
					
							// fill in the vacancy by assigning the selected table to the customer.
							tables[x][y] = tableInput;
							reservation [x][y] = true;
							System.out.println();
					
						}  // Ending of the method assignTable ---------------------------------
					
					
					
						//A method for random table allocation
						private static void randomTable() {
					
							random_int = (int)(Math.random() * (max - min + 1) + min);
							System.out.println("Your table number is 0"+random_int);
					
					
						}  // Ending of the method ---------------------------------
					
						//A method for list of products.
						private static void itemList () {
					
							//  Name 	 Code 	 Price 		Quantity 	Description
							System.out.println( "Code\t: Name        \t: Price  \t:Qty  " );
							for( int i=0; i< itemName.size(); i++ ) {
					
								System.out.println( itemCode.get(i) + " \t: " +  itemName.get(i) +   " \t: " + itemPrice.get(i) + "\t\t:" + itemQty.get(i)  );
					
							}
						} // Ending of the itemList method -----------------------------------
					
					
					} //Ending of the Restaurant booking system class. 