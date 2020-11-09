package menu;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method(4 ));
		
	}
	
	public static int method(int n) {
		
		if (n <= 0) { return 0; 
		
		}
		
		return n + method(n - 1) * 2;}

}
