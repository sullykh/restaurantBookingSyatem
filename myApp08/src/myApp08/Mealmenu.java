package myApp08;



public class Mealmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("number\t" + "binary\t" + "octal\t" + "hex");
	    Main.printNumbers(0b110);
	    Main.printNumbers(077);
	    Main.printNumbers(0xAF);
	    Main.printNumbers(Integer.parseInt("110", 2));
	  }

	  private static void printNumbers(int n)
	  {
	    String decimal = String.valueOf(n);
	    String binary = Integer.toBinaryString(n);
	    String oct = Integer.toOctalString(n);
	    String hex = Integer.toHexString(n);
	    System.out.println(decimal + "\t" + binary + "\t" + oct + "\t" + hex);
	  }
		

	


