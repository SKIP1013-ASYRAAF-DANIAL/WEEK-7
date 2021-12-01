package exercise;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		boolean length = false;
	    boolean digit = false;
	    boolean lowercase = false;
	    boolean uppercase = false;
	    boolean access = true;
	    int counter = 3;
	    char ch = 0;
	    String password;
	    

	    	do {
	    		System.out.println("Please enter your password by minimum 8 characters with the combination of letter, number and symbol : ");
		    	password = input.next();
			
		    	if (password.length() >= 8)
		   	{
		    		System.out.println("Checking...Please wait");
		    		ch = password.charAt(0);

		    		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch == '_')) {
	           		 	System.out.println("Register successfully");
		    		} else if ((ch == '*') || (ch == '@') || (ch == '#') || (ch == '$')) {
		    			System.out.println("Register unsuccessful");
		    		} else {
		    			System.out.println("Invalid");
		    		}
		    		System.exit(0);
		   	}
			else 
			{
				System.out.println("Access Failed");	
			}
	       		counter = counter - 1;
			System.out.println("You have " + counter + " try (s) more");
			System.out.println();
			
	        	if (counter == 0) 
	        	{
				access = false;
				System.out.println("3 tries exceeded! You are not allowed to register a new account.");
				System.exit(0);
			} 
		} while (access == true);

	}

}
