// Write a java program that will create one child thread. The child thread has to display all odd numbers between m and n, and the main thread 
// will display all the even numbers between m and n.

import java.util.*;

class mythread extends Thread{
	int m,n;
	mythread(int m,int n){
		this.m = m;
		this.n = n;
	}
	public void run(){
		System.out.println();
		System.out.println("Odd Numbers: ");
		for(int i = m;i<=n ;i++){
			if(i%2 != 0){
				System.out.print(i+" ");
			}
		}
	}
}

class Q3_Odd_Even{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting point: ");
		int m = sc.nextInt();
		System.out.println("Enter the end point: ");
		int n = sc.nextInt();
		mythread x = new mythread(m,n);
		
		try{
			System.out.println("Even Numbers: ");
			for(int j=m;j<=n;j++){
				if(j%2==0){
					System.out.print(j+" ");
				}
			}
			x.start();		
		}
		
		catch (ArithmeticException e){
			System.out.println("Thread is not running."+ e.getMessage());
		}
		
	}
}