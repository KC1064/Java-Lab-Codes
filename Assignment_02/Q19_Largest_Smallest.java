//WAP to input an integer array and display largest and smallest value

import java.util.*;
class Q19_Largest_Smallest{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value: ");
            arr[i] = sc.nextInt();
        }
		int max=arr[0];
		int min=arr[0];
		for (int i = 0; i < n; i++) {
            if(max<arr[i]){
				max=arr[i];
			}
        }
		for (int i = 0; i < n; i++) {
            if(min>arr[i]){
				min=arr[i];
			}
        }
		System.out.printf("Max: %d Min: %d ", max,min);
	}
}