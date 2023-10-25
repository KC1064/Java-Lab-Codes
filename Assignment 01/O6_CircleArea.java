//Write a program to input the radius value of a circle through the keyboard and then display the area of the circle.
import java.io.*;
import java.lang.System;

class O6_CircleArea {
    public static void main(String args[]) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter radius: ");
        float a = Float.parseFloat(x.readLine());
        float area = 3.14f * a * a; 
        System.out.print("Area of circle: " + area);
    }
}