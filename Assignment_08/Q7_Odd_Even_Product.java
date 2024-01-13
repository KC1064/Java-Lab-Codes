// Write a java program that will compute product of two 1D arrays 
// using multithreading. The program should read two 1D arrays of 
// same size from the user. First thread should multiply the 
// corresponding elements present in the odd index position and 
// second thread should multiply the corresponding elements present
// in the even index position. Main thread should display the result. 

import java.util.*;

class OddProduct extends Thread {
    int arr1[];
    int arr2[];

    OddProduct(int arr1[], int arr2[]) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public void run() {
        int i = 1;
        while (i < arr1.length) {
            System.out.print(arr1[i] * arr2[i] + " ");
            i += 2;
        }
    }
}

class EvenProduct extends Thread {
    int arr1[];
    int arr2[];

    EvenProduct(int arr1[], int arr2[]) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public void run() {
        int i = 0;
        while (i < arr1.length) {
            System.out.print(arr1[i] * arr2[i] + " ");
            i += 2;
        }
    }
}

public class Q7_Odd_Even_Product {
    public static void main(String args[]) {
        int arr1[] = { 21, 22, 23, 24, 25, 26 };
        int arr2[] = { 11, 12, 13, 14, 15, 16 };
        OddProduct x = new OddProduct(arr1, arr2);
        EvenProduct y = new EvenProduct(arr1, arr2);
        x.start();
        y.start();
        try {
            System.out.println("\nResults:");
			x.join();
            y.join();
        } catch (InterruptedException e) {
            System.out.println("Error in Thread Operations.");
        }
    }
}
