//Write a program to find out the largest between two numbers using a conditional operator.
import java.lang.System;
import java.io.*;

class O13_LargestNum {
	public static void main (String args[]) throws IOException {
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the First Number: ");
		int a=Integer.parseInt(x.readLine());
		System.out.print("Enter the Second Number: ");
		int b=Integer.parseInt(x.readLine());
		if (a>b) {
			System.out.printf("%d is larger than %d.",a,b);
		}
		else {
			System.out.printf("%d is larger than %d.",b,a);
		}
	}
}