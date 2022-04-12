package Test;

import java.util.Scanner;

public class LoopExcersize {
public static void main(String[] args) {
	
	//View Multiplication Table.
	
	/*System.out.println("Enter Number to view Multiplication Table :");
	Scanner inputNumber = new Scanner(System.in); 
	int storedNumber = inputNumber.nextInt();
	
	for(int i = 1;i < 11;i++) {
		
		int multiply = storedNumber * i;
		
		System.out.println(storedNumber + " x " + i + " = " +  multiply);
	}*/
	
	Scanner number1 = new Scanner(System.in);
	Scanner number2 = new Scanner(System.in);
	
	
	
	int num = 1;
	System.out.println("Enter base number : ");
	int base = number1.nextInt();
	System.out.println("Enter power : ");
	int power= number2.nextInt();
	for(int i = 1; i <= power; i++) {
		
		num *= base;
		
	}
	
	//System.out.println("\n" +base + " raise to the power of "+ power  + " = " + num);
	System.out.println("\n" + " ^ "+ power  + " = " + num);
	System.out.println(base);
	

	
}
	
}


