// Write a java program, that will create two threads. The main 
// thread will read a number and one thread will check the number 
// is prime or composite and the same time the other thread will 
// check the number is palindrome or not. 
// Note: Main thread has to wait until other two threads has 
// completed their task. 

import java.util.*;

class PrimeCheck extends Thread{
	int num;
	PrimeCheck(int num){
		this.num = num;
	}
	
	public void run(){
		if(num == 2){
			System.out.println("2 is a prime number.\n");
		}
		
		else {
			int count = 0;
			for(int i=2 ; i <= Math.sqrt(num); i++){
				if(num%i == 0){
					count++;
				}
				else{
					count = 0;
				}
			}
			if(count == 0){
				System.out.printf("%d is prime number.\n",num);
			}
			else{
				System.out.printf("%d is composite number.\n",num);
			}
		}
	}
}

class PalindromeCheck extends Thread{
	int num;
	
	PalindromeCheck(int num){
		this.num = num;
	} 
	
	public void run(){
		if (num < 0) {
            System.out.printf("%d is not palindrome number.\n",num);			
		}
		else{
			int copy = num;
			int rem, rev=0;
			while (copy != 0) {
				rem = copy % 10;
				rev = rev * 10 + rem;
				copy /= 10;
		}
		if(rev == num){
			System.out.println(num+ " is Palindrome.\n");
		}
		else {
			System.out.println(num+ " is not Palindrome.\n");
		}
		}
	}
}

class Q5_MultiThread{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		PrimeCheck x = new PrimeCheck(number);
		PalindromeCheck y = new PalindromeCheck(number);
		x.start();
		y.start();
		
		try{
			x.join();
			y.join();
			System.out.println("\nMain Thread Running.....");
		}
		catch(InterruptedException e){
			System.out.println("Message "+e.getMessage());
		}
	}
}