package newArrays;

public class newArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int board [] [] = new int [9][9]; 
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				
				board[i][j] = i * j;
			
			}
			
		}
		
		for (int i=0; i<board.length; i++) {
			for (int j=0; j< board.length; j++) {
				System.out.print(board[i][j] + ", ");
				
				}
			System.out.println();  
		}
		
		
		/*int counter = 0;
		
		int values[] = {1, 3, -2, -4, 9, 11, 5, 0, -1, -2, -21, 7, 13};
		
		for (int element : values) {
			if (element > 0 ) {
				counter++; }
			
			
			}
		System.out.println(counter);
		 
		}
		
		/*
		int[] scores = new int[100];
		
		int total = 0; 
		
		for(int i=7; i<scores.length; i+=7) {
			scores[i] = i;
		}
		
		for(int e : scores) {
			total +=e;
			System.out.println(e);
		}
		
		System.out.println("total = " + total);
		/*
		
		for(int j=7; j<scores.length; j+=7) {
			System.out.println(scores[j]);
			
			total = total + j;
		}
		
		System.out.println("Total = " + total);
		
		/*
		scores[0] = 90;
		scores[1] = 99;
		scores[2] = 100;
		
		System.out.println() 
		
		*/ 
		
		

	}

}
