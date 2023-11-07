//Write a program to calculate the roots of a quadratic equation.
import java.util.*;
import java.lang.Math;

class Q5_Quad_roots {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients: ");
        double a = sc.nextDouble(); // Use double for coefficients
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = (b * b) - 4 * a * c;

        if (d > 0) {
            System.out.println("The roots are real and distinct.");
            double root1 = (-b + Math.sqrt(d)) / (2 * a); // Correct the formula
            double root2 = (-b - Math.sqrt(d)) / (2 * a); // Correct the formula
            System.out.println("The roots are: " + root1 + " and " + root2);
        } else if (d == 0) {
            System.out.println("The roots are real and Equal.");
            double root = -b / (2 * a); // Correct the formula
            System.out.println("The root is: " + root);
        } else {
            System.out.println("The roots are imaginary.");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("The roots are: " + realPart + " + i" + imaginaryPart + " and " + realPart + " - i" + imaginaryPart);
        }
    }
}
