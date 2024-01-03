// Write a program that prompts the user to enter a length in feet and inches and outputs the equivalent length in centimetres. If the user enters 
// a negative number or a non-digit number, throw and handle an appropriate exception and prompt the user to enter another set of numbers.
// 1ft = 30.48cm
// 1 inch = 2.54cm
import java.util.*;

class Q7_feetInchesTocentiMeter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length in feet and inches: ");
		int ft = sc.nextInt();
		int inch = sc.nextInt();
		
		try{
			if(ft < 0 || inch <0){
				throw new ArithmeticException();
			}
			else{
				double cm = ft*30.48f + inch * 2.54f;
				System.out.println("In Centimeters: "+cm);
			}
		}
		
		catch (ArithmeticException e){
			System.out.println("Not valid input "+e);
		}
	}
}