//Write a program to enter the distance value in meters and then display it in Km: Meter format using the modulus operator.
import java.lang.System;
import java.io.*;

class Question_12 {
	public static void main (String args[]) throws IOException {
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Distance in Mtrs: ");
		int mtrs = Integer.parseInt(x.readLine());
		int kms = mtrs/1000;
		mtrs = mtrs%1000;
		System.out.printf("%d Kms %d Mtrs",kms,mtrs);
	}
}