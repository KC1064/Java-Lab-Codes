// Write a program to display your name, branch, roll no, and college name on the computer screen.
import java.io.*;
import java.lang.System;
class Question_01{
	public static void main(String args[]) throws IOException{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		String name= x.readLine();
		System.out.print("Enter your branch: ");
		String branch= x.readLine();
		System.out.print("Enter your roll no.: ");
		int roll=Integer.parseInt(x.readLine());
		System.out.print("Enter your College name: ");
		String clg= x.readLine();
		System.out.println("Name: "+name);
		System.out.println("Branch: "+branch);
		System.out.println("Roll No. "+roll);
		System.out.println("College Name: "+clg);
	}	
}