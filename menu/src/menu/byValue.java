package menu;

public class byValue {

	public static void main(String[] args) {
		int [] a = {2};
		
		System.out.println("Before " + a[0]);
		
		System.out.println("Update " + update(a[0]));
		
		System.out.println("After " + a[0]);
		
		int n = 10;
		
		System.out.println(); 
		
		System.out.println("Before " + n);
		
		System.out.println("Update " + update(n));
		
		System.out.println("After " + n);
		
	}

	
	static int update(int [] a) {
		a[0]= 9 * a[0];
		
		return a[0];
	}
	
	static int update(int n) {
		
		n = 9 *n;
		return n;
		
	}
	
}
 