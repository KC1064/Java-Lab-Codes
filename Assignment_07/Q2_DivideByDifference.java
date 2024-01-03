// Write a java program to read two numbers x and y and calculate x/(x-y). The program should check the value of x-y. Before dividing with x, 
// it should throw an exception if x-y is zero. In the exception handler the program should display appropriate message to the user.

import java.util.*;
class Q2_DivideByDifference{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		try{
			double result = x/(x-y);
			System.out.print("Result: "+result);
			
		}
		catch(ArithmeticException e){
			System.out.println("Division not possible since x-y=0");
		}
	}
}