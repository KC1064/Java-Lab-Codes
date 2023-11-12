//Write a program to find the factorial of numbers from 1 to n.

import java.util.*;

class Q22_Factorial_nums {
    static int factorial(int a){
        int fact = 1;
        for(int i = 1; i <= a; i++){
            fact = fact * i;
        }
        return fact;  // Return the calculated factorial
    }
    
    public static void main(String[] args) {  // Correcting the method signature
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.printf("%d ", factorial(i));  // Print the result directly in the loop
        }
    }
}
