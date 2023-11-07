//Write a program to find the mean of n numbers using an array.
import java.util.*;

class Q12_Mean_array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter Value: ");
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		float mean = (float)sum/n;
		System.out.printf("Mean: %.2f",mean);
	}
}