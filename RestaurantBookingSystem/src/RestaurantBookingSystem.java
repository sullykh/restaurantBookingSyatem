import java.util.ArrayList;
import java.util.Scanner;

/*Algorithm 
 * 
 * 
 * Generic description of the items: name, code, price, quantity and description

Database for the products/items: has to reflects all these components of the items


Table for the cart, where a customer can store selected item before payment
Also the cart has to capture these components of the items.


Start
-0- Welcome to the restaurant message
-1- Customer initial input 
	Ask customer to enter their name 
-2-	Ask customer if they would like to choose a seat from the unassigned seats. 
-3-	Create two dimensional arrays (string) to display the seat layout
	If seats are not assigned, assign the seat to customer else display "XX" to indicate that the assigned seat is no longer available. 
-4-	If seats are available, assign to customers else display "Sorry there is no available seat at this time". 
-5- Display a list of available food 
-6-  interface where a customer can choose one of the following options: 
     select an item
     remove an item from a basket
     check out (for payment)
     exit.
 -7- Create a temp basket
 -8- make a payment for selected basket items
   	 enter amount for payment
   	 clear basket.
 
-9- Confirmation displaying:
   	customer's name.
   	seat number
   	list of ordered items
   	total cost of the order. 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

-1- Login system
	Ask user enter username and password
	Take the username and password
	Check if it is correct login
	else show a message that invalid username or password.
-2- List of products: -method
 		Name  Code  Price 
-3- Select a product
	Ask the user to enter item code
	Entering item code
	Take the item code
	Ask for the quantity
	Check if it is available in the stock
	    if available add it to the cart
	    else show a message out of stock
-4- Show cart with the total
    -- Expand this as a method
 * 
 */





















public class RestaurantBookingSystem {

	public static void main(String[] args) {
		
		// A facility for getting input
		static Scanner input = new Scanner(System.in);

//		Generic description of the items: name, code, price, quantity and description
//		Database for the products/items: has to reflects all these components of the items
		// An array or list to represent the database, from Week 04
		static ArrayList<String>  itemName  = new ArrayList<String>();   // name
		static ArrayList<Integer> itemCode  = new ArrayList<Integer>();  // code
		static ArrayList<Float>   itemPrice = new ArrayList<Float>();   // price
		static ArrayList<Integer> itemQty   = new ArrayList<Integer>();  // Quantity
		static ArrayList<String>  itemDescription = new ArrayList<String>();  // Description
		
		int newUnit = 10; 

	}

}
