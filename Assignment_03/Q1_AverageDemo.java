//Write a program to Print the average of three numbers entered by user by creating a class named 'Average'
//having a method to calculate and print the average. 
//Define another driver class to demonstrate the basic operation.

import java.util.*;

class Average {
	 int a,b,c;
	 void initialise (int num1,int num2,int num3){
		a=num1;
		b=num2;
		c=num3;
	 }
	 void calc(){
		 int avg= (a+b+c)/3;
		 System.out.print("Average: "+avg);
	 }
}

class Q1_AverageDemo{
	public static void main(String args[]){
		int x,y,z;
		Average a = new Average();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers: ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		a.initialise(x,y,z);
		a.calc();
	}
}