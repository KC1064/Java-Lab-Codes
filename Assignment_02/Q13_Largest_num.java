//Write a program to find the largest of n numbers using array.
import java.util.*;
class Q13_Largest_num{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter Value: ");
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++){
			if(max<=arr[i]){
				max=arr[i];
			}
		}
		System.out.printf("LARGEST NUMBER: %d",max);
	}
}