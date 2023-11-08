//WAP to input an integer array and display largest and smallest value
//WAP to search an element from an integer array

import java.util.*;

class Q16_Search {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value: ");
            arr[i] = sc.nextInt();
        }
		System.out.print("Enter the number to search: ");
		int num=sc.nextInt();
		for (int i = 0; i < n; i++) {
            if(num==arr[i]){
				System.out.print("The Element is found");
				break;
			}
        }
	}
}