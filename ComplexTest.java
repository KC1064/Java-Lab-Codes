//Define a class complex, that initiates 2 instance variable real and imaginary.
//Declare a method get data that accepts the input and initialises the object.
//Declare another method that performs addition of 2 complex numbers. 
//Third method to display the result.
//Create a driver class, to create the object of 2 complex numbers and test other functionality.

import java.util.*;

class Complex {
    int real, img;

    Complex(int r, int i) {
        real = r;
        img = i;
    }

    Complex add(Complex p, Complex q) {
        Complex result = new Complex(0, 0);
        result.real = p.real + q.real;
        result.img = p.img + q.img;
        return result;
    }

    void display() {
        System.out.print("Sum: "+real + " + " + img + "i");
    }
}

public class ComplexTest {
    public static void main(String args[]) {
        int p, q, r, s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real and imaginary part of the first number: ");
        p = sc.nextInt();
        q = sc.nextInt();
        Complex a = new Complex(p, q);
        System.out.print("Enter the real and imaginary part of the second number: ");
        r = sc.nextInt();
        s = sc.nextInt();
        Complex b = new Complex(r, s);

        Complex c = a.add(a, b);
        c.display();
    }
}
