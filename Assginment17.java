package Asssignment2407;

public class Assginment17 {

	public static void main(String[] args) {
		
		
		double principal = 1000;
        double rate = 5; 
        int time = 10; 
        int numberOfTimesCompounded = 4;
        double amount = principal * Math.pow((1 + rate / 100 / numberOfTimesCompounded), numberOfTimesCompounded * time);
        
        System.out.printf("The amount after %d years is: %.2f\n", time, amount);
		
		
		
		
		
		
		
		
		
	}
}
