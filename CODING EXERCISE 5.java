package exercise;

import java.util.Scanner;

public class Exercise5Iman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*declare satu passwd
		*guna scanner, mintak client masukkan pswd
		*sistem akan semak pswd
		*Jika betul, keluar dari loop
		*jika pswd salah, masukkan sekali lagi pswd
		*kali ketiga, keluar dari loop dan bagi mesej, kad is invalid
		*/
	
		Scanner sc= new Scanner (System.in);
        
        int pass = 123456, i=1;
        
        System.out.println("Enter your password : ");
        pass = sc.nextInt();
        
        if(pass==123456)
            System.out.println("Welcome Asyraaf!");
        
        else {
            do {
            if (pass!=123456) {
                System.out.println("Invalid password, enter your password again : ");
                pass = sc.nextInt();
            }
            
            i++;
            }
            while(i<3); 
            
            System.out.println("Sorry your account has been blocked.");
        }
		

	}

}
