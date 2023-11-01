//Write a program to enter the marks of a student in 4 different subjects. Then display the grade Of the student as per the following conditions:
                // If the average mark is greater than or equal to 90 then grade is O
                // If the average mark is greater than equal to 80 but less than 90 then grade is E
                // If the average mark is greater than equal to 70 but less than 80 then grade is A
                // If the average mark is greater than equal to 60 but less than 70 then grade is B
                // If the average mark is greater than equal to 50 but less than 60 then grade is C
                // If the average mark is less than 50 then grade is F
import java.util.*;

class Q4_Class_Grade {
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in Subjects: ");
		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
		int mark4 = sc.nextInt();
		float avg = (mark1+mark2+mark3+mark4)/4; 
		
		if (avg>=90){
			System.out.print("Grade: O");
		}
		else if (avg >= 80 && avg<90){
			System.out.print("Grade: E");
		}
		else if (avg >= 70 && avg<80) {
			System.out.print("Grade: A");
		}
		else if (avg >= 60 && avg<70) {
			System.out.print("Grade: B");
		}
		else if (avg >= 50 && avg<60){
			System.out.print("Grade: C");
		}
		else {
			System.out.print("Grade: F");
		}
	}
}
