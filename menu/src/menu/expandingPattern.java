package menu;

public class expandingPattern {

	
		public static void main(String[] args){
			pattern(13);
			
		
		}
		
		public static void pattern(int n){
			//base case
			if(n<0){ 
				return;  
				}
				pattern(n - 1);
				
				//recursive behaviour
				for (int i = 0; i < n; i++){
					
					System.out.print("*.^^.");
					
				}
				
				System.out.println();
					
		}
		
} 

	


