//Write a program to input the time value in seconds and then display it in the hour: minute: second format using the modulus operator (%). 
import java.lang.System;
import java.io.*;

class Question_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the time in seconds: ");
        int sec = Integer.parseInt(x.readLine());

        int hr = sec / 3600;  
        sec %= 3600;         

        int min = sec / 60;  
        sec %= 60;           

        System.out.printf("%d Hr %d Min %d Sec", hr, min, sec);
    }
}
