//WAP to input an array and display the elements that are divisible by 2

import java.util.*;

class Q21_Divisible_by_2 {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value: ");
            arr[i] = sc.nextInt();
        }
		System.out.print("Numbers divisible by 2: ");
		for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
				System.out.printf("%d ",arr[i]);
			}
        }
		
	}
}