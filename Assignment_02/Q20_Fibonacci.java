//Write a program to find the Fibonacci sequence of n elements.

import java.util.*;

class Q20_Fibonacci {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<n;i++){
			arr[i]= arr[i-1] + arr[i-2];
		}
		System.out.println("Fibonacci terms: ");
		for(int i=0;i<n;i++){
			System.out.printf("%d ",arr[i]);
		}
	}
}