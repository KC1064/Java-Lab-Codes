//WAP to sort an array using Bubble sort
import java.util.*;

class Q18_Bubble_sort {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value: ");
            arr[i] = sc.nextInt();
        }
		int temp;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("After Bubble Sort Array: ");
		for (int i = 0; i < n; i++) {
            System.out.printf("%d ",arr[i]);
        }
	}
}