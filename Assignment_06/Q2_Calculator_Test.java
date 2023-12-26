// Define an interface Calculator which has the basic methods add(), sub( ), mul() and div(). Define a concrete class named as 
// DemoCalculator that implements the interface. Define the driver class, which create object reference of the interface Calculator 
// and perform all basic operation of the calculator.

import java.util.*;

interface Calculator {
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
}

class DemoCalculator implements Calculator {

    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Sub: " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Product: " + (a * b));
    }

    public void div(int a, int b) {
        System.out.println("Division: " + (a / b));
    }
}

class Q2_Calculator_Test {
    public static void main(String args[]) {
        Calculator x = new DemoCalculator();
        int a = 10;
        int b = 5;
        x.add(a,b);
        x.mul(a,b);
        x.sub(a,b);
        x.div(a,b);
    }
}
