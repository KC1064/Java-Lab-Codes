//Write a program to input the marks of a student in three different subjects and then display the average mark.
import java.lang.System;
import java.io.*;
class O8_AvgMark {
	public static void main(String args[]) throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your marks in Subject 1: ");
		int m1=Integer.parseInt(x.readLine());
		System.out.print("Enter your marks in Subject 2: ");
		int m2=Integer.parseInt(x.readLine());
		System.out.print("Enter your marks in Subject 3: ");
		int m3=Integer.parseInt(x.readLine());
		System.out.printf("Subject 1: %d\n",m1);
		System.out.printf("Subject 2: %d\n",m2);
		System.out.printf("Subject 3: %d\n",m3);
		int avg=(m1+m2+m3)/3;
		System.out.println("Average Marks: "+avg);
	}
}