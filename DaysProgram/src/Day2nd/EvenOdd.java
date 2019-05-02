package Day2nd;

import java.util.Scanner;

public class EvenOdd {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

       
       if(N%2==0)
       {
    	   
    	    if( N>=2 && N<=5)
    	   {
    		   System.out.println("Not Weried"); 
    	   }
    	   
    	    else if(N>=6 && N<=20)
    	   {
    		   System.out.println("Weried");
    	   }
    	   else if(N>20)
    	   {
    		   System.out.println("Not Weried");
    	   }
       }
       else
       {
    	   System.out.println("Weried");
       }
        
	}

}
