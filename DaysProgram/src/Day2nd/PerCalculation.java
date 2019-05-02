package Day2nd;

import java.util.Scanner;

public class PerCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);
	}

	private static final Scanner scanner = new Scanner(System.in);
	
	 static void solve(double meal_cost, int tip_percent, int tax_percent) {
	       
		 	double tip_percent_Total = meal_cost * tip_percent/100;
	        double tax_percent_Total=meal_cost*tax_percent/100;
	        double TotalCost=meal_cost+tip_percent_Total+tax_percent_Total;
	        
	        System.out.println(Math.round(TotalCost));
	    }
}













