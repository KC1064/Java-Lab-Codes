//Write a program to illustrate the use of multiple catch blocks associated with a single try block.

import java.util.*;

class Q4_MultipleCatch {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            int[] arr = {1, 2, 3};
            System.out.println("Array element at index 5: " + arr[5]);
        } 
		catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter valid integers.");
        }
		catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index is out of bounds.");
        }
		catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
