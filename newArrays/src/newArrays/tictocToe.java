package newArrays;

import java.util.Scanner;

public class tictocToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Algorithm or Flowchart
		 
		 // create input facility 
		 Scanner input = new Scanner(System.in);
		
		 // Create the board
		 
		 char[] [] board = {{' ', ' ',  ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
		 //String [][] board = new String [3][3]; 
		 
		// board = {{"  ", "  ", "  "}, {"  ", "  ", "  "}, {"  ", "  ", "  "}};
		 //**? while
		  while(true) {
		 //Display board
			  for(int i=0; i<3; i++) {
				  for(int j=0; j<3; j++) {
					  System.out.print(board[i][j] + "  :  ");
				  }
				  
				  System.out.println();
			  }
		 //Ask P1 to choose a position
		 //Assign the position to P1
		 //Display the board again
		 //Ask P2 to choose a position
		 //Assign the position to P2
		 //Display the board again
		 //Repeat steps
		 //**? do-while
		
	 
			  //termination condition 
			  //??
			  break;
			  
		  }

	}

}
