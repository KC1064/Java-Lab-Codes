//Write a program to find out the area of any rectangle.
import java.lang.System;
import java.io.*;
class O7_RectArea{
	public static void main(String args[]) throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the length of Rectangle: ");
		int length=Integer.parseInt(x.readLine());
		System.out.print("Enter the width of Rectangle: ");
		int width=Integer.parseInt(x.readLine());
		int area= length*width;
		System.out.print("Area of Rectangle is: "+area);
	}
}