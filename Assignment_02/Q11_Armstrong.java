//Write a program to display all Armstrong numbers between 1 to 10000.
import java.util.*;

class Q11_Armstrong {
	static int num_digits(int num) {
        int digits = 0;
        while (num != 0) {
            num /= 10;
            ++digits;
        }
        return digits;
    }

    public static void main(String args[]) {
        for (int i = 1; i < 10000; i++) {
            int result = 0;
            int originalNumber = i;
            int digits = num_digits(i);

            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == i) {
                System.out.print(i + " ");
            }
        }
    }
}
