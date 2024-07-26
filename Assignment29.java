package Asssignment2407;

import java.util.Scanner;

public class Assignment29 {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("enter priciple:");
	
	double principle=scanner.nextDouble();
	System.out.println("enter number of year:");
	
			int year=scanner.nextInt();
			System.out.println("enter rate of interest:");
			int intrest=scanner.nextInt();
			
			
			double si=(principle*year*intrest)/100;
			
			
			System.out.println("simple intreste is :"+si);
			
			System.out.println("amount you have to pay is:"+(si+principle));
}
}
