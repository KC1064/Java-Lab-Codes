//Write a program to input two floating point numbers through the keyboard and display their sum.
import java.io.*;
import java.lang.System;
class Question_03{
	public static void main(String args[]) throws IOException{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 1st Number: ");
		float a= Float.parseFloat(x.readLine());
		System.out.print("Enter 2nd Number: ");
		float b= Float.parseFloat(x.readLine());
		float c=a+b;
		System.out.println("Sum of the two numbers: "+c);
		//System.out.printf("Sum of %f and %f is: "+c,a,b);
	}
}