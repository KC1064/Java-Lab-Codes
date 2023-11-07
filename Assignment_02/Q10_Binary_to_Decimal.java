//Write a program to find out the binary equivalent of any inputted decimal number.
import java.util.*;

class Q10_Binary_to_Decimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Binary equivalent: 0");
        } 
		else {
			StringBuilder binaryEquivalent = new StringBuilder();
            while (num > 0) {
                int rem = num % 2;
                binaryEquivalent.insert(0, rem);
                num /= 2;
            }

            System.out.println("Binary equivalent: " + binaryEquivalent.toString());
        }
    }
}
