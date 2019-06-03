package Day5;

import java.util.Scanner;

public class MultipleOf2 {

	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int result;
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for(int i=1;i<=10;i++)
        {
        	result=n*i;
        	System.out.println(n+" " + "x" +" " +i +" "+ "="+" " + result);
        }
	}
	
}
