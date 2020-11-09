package menu;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		
	}
	
		public static int  digitSum(int n){
		
		// A base case for termination
		
		if (n == 0)  return 0;
		
		// General case for recursion
		return  digitSum(n / 10) + (n % 10);
			
	   } 	
	
	public static int sum(int n) {
		
		if ( n <= 0) {
			return 0;
		}
		return n + sum(n - 1); 
	}
	
	

}
