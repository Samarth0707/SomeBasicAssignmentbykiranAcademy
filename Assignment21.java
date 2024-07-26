package Asssignment2407;

public class Assignment21 {
public static void main(String[] args) {
	
	//Assignment 21: Calculate Distance Between Two Points
	//Write a Java program to calculate the distance between two points (x1, y1) and (x2, y2).
	//Use the formula: distance = sqrt((x2 - x1)^2 + (y2 - y1)^2).

	
	int x1=10;
	int x2=5;
	int y1=6;
	int y2=8;
	
	 double dis = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
	System.out.printf("distance between two point is:"+dis);
	
}
}
