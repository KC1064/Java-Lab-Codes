//Write a program to swap two numbers using a third variable.
import java.io.*;
import java.lang.System;
class Question_04{
	public static void main(String args[]) throws IOException{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 1st Number: ");
		int a= Integer.parseInt(x.readLine());
		System.out.print("Enter 2nd Number: ");
		int b= Integer.parseInt(x.readLine());
		int c=a;
		a=b;
		b=c;
		System.out.printf("After swapping 1st number %d and 2nd number %d",a,b);
	}
}