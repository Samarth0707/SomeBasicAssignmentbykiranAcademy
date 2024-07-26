package Asssignment2407;

import java.util.Scanner;

public class Assignment4 {
public static void main(String[] args) throws InterruptedException {
	
	System.out.println("welcome to our temp converter application");
	
	System.out.println("loading please wait for few second");
	Thread.sleep(8000);
	
	System.out.println("please enter temp in celsious :");
	Scanner scanner=new Scanner(System.in);
	double celeciustemp=scanner.nextDouble();
	double f = (celeciustemp * 9/5) + 32;
	
	System.out.println("the given temperatore in fahranite: "+f);
}
}
