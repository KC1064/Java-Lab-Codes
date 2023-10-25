//Write a program to convert the temperature from Fahrenheit scale to Celsius scale.
import java.lang.System;
import java.io.*;

class O10_Temp{
    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the temperature in Fahrenheit scale: ");
        float temp = Float.parseFloat(x.readLine());
        float ctemp = (temp - 32) * 5/9f;
        System.out.printf("%.2f Fahrenheit in Celsius scale is %.2f\n", temp, ctemp);
    }
}
