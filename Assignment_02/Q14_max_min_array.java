//Write a program to interchange the largest and smallest element of any array.
import java.util.*;

class Q14_max_min_array {
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void display_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println(); 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value: ");
            arr[i] = sc.nextInt();
        }
        int max_index = 0;
        int min_index = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[min_index]) {
                min_index = i;
            }
            if (arr[i] > arr[max_index]) {
                max_index = i;
            }
        }
        swap(arr, min_index, max_index);
        System.out.print("After Swapping the Array: ");
		//for (int i = 0; i < arr.length; i++) {
          //  System.out.printf("%d ", arr[i]);
        //}
        display_array(arr);
    }
}
