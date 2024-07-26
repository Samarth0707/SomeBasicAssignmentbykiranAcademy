package Asssignment2407;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class Assignment7 {
public static void main(String[] args) {
	
	
	int a=10;
	int b=20;
    int temp=0;
    
    temp=b;
    
    b=a;
    a=temp;
    
    System.out.println("the value of a is:"+a);
    System.out.println("the value of b is:"+b);
    
}
}
