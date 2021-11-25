package exercise;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Generate a random number to be guessed
		
	    int number = (int)(Math.random() * 11);
	    Scanner input = new Scanner(System.in);
	    
	    int j; 
	    int i = -1;
	    
	    System.out.print ("This is Random System Number");

	    System.out.println();
	    
	    while(i != number) {
	    	System.out.print ("Insert number between 0 - 10: ");
		    j = input.nextInt();
		    if (j == number) {
		    	System.out.println("Congrats! Your number is same!");
		    } else if (j <= number) {
		    	System.out.println("Sorry! Your number is too low");
		    }  else {
		    	System.out.println("Sorry! Your number is too high");
		    }
	    	
	    }

	}

}
