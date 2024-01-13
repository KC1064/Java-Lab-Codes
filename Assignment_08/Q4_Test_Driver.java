// Write a java program to create two threads. First thread should find the square of the number, second thread should find the sum of the 
// digits of the number.

import java.util.*;

class mythread extends Thread{
	int number;
	mythread(int number){
		this.number = number;
	}
	
	public void run(){
		System.out.print("Square of the number is: "+ Math.pow(number,2));
	}
}

class Q4_Test_Driver{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sum=0;
		mythread x = new mythread(num);
		x.start();
		try{
			while(num!=0){
				int rem = num%10;
				sum = sum+rem;
				num = num/10;
			}
			System.out.println("Sum of Digits: "+sum);
		}
		catch (ArithmeticException e){
			System.out.println("Error in running "+e.getMessage());
		}
		
	}
}