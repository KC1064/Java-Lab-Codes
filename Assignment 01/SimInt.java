//Write a program to input the principal amount, rate of interest, and the time period through the keyboard and find out the simple interest.
import java.lang.System;
import java.io.*;
class SimInt{
	public static void main(String args[]) throws IOException{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the principal amount: ");
		float principal=Float.parseFloat(x.readLine());
		System.out.print("Enter the Interest rate: ");
		float rate=Float.parseFloat(x.readLine());
		System.out.print("Enter the time period in years: ");
		int time=Integer.parseInt(x.readLine());
		float interest=(principal*rate*time)/100;
		System.out.printf("For a principal amount of %f for a time period of %d at a rate of %f is "+interest,principal,time,rate);
	}
}