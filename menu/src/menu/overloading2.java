package menu;

public class overloading2 {

	public static void main(String[] args) {
		System.out.println(   add(3,  7) );
		System.out.println(   add(1,  2  ,3));
		System.out.println(   add(1.3  ,3  ,2  ));

	} // main
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
		
	}
	
	public static double add(double n1, int n2, int n3) {
		return n1 + n2 + n3;
		
	}
}
