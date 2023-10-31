//Write a program to swap two numbers without using a third variable.
import java.io.*;
import java.lang.System;
class Question_05{
	public static void main(String args[]) throws IOException{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 1st Number: ");
		int a= Integer.parseInt(x.readLine());
		System.out.print("Enter 2nd Number: ");
		int b= Integer.parseInt(x.readLine());
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("After swapping 1st number is %d and 2nd number is %d",a,b);
		
	}
}