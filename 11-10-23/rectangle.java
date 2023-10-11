// Write a java program to take the length and breadth and find the perimeter
//import java.lang.System;
//import java.lang.String; // Not needed since its already included
	public class rectangle {
		public static void main(String[] args) {
			int perimeter,area;
			int length = 6;
			int breadth = 5;
			perimeter = 2 * (length + breadth);
			area = (length*breadth);
			System.out.println("Perimeter of rectangle: " + perimeter);
			System.out.println("Area of rectangle: " + area);
    }
}

