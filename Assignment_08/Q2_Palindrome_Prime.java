// Write a java program, that will create one thread. The main thread will read a number and check the number is prime or composite and the 
// same time the new thread will check the number palindrome or not.

import java.util.*;
class mythread extends Thread {
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check palindrome or not: ");
		int num = sc.nextInt();
		int copy = num;
		int rem, rev=0;
		while (copy != 0) {
			rem = copy % 10;
			rev = rev * 10 + rem;
			copy /= 10;
		}
		if(rev == num){
			System.out.println(num+ " is Palindrome.");
		}
		else {
			System.out.println(num+ " is not Palindrome.");
		}
	}
}

class Q2_Palindrome_Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check prime or composite: ");
		int num2 = sc.nextInt();
		int count = 0;
		
		mythread x = new mythread();
		x.start();
		
		try {
			if(num2 == 2){
				System.out.print("2 is a prime number.");
			}
			else{
				for(int j=2; j <= Math.sqrt(num2); j++){
					if(num2 % j == 0){
						count++;
					}
					else{
						count = 0;
					}
				}
				if(count!=0){
					System.out.println(num2+" is not prime.");
				}
				else{
					System.err.println(num2+" is prime.");
				}
				
			}
			x.join();
		}
		catch (InterruptedException e){
			System.out.println("Error in running thread");
		}
	}
} 