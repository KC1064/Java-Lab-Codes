import java.util.Scanner;

public class InputRectangle {
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the length of rectangle: ");
		int length=scanner.nextInt();
		System.out.print("Enter the breadth of the rectangle: ");
		int width=scanner.nextInt();
		int perimeter=2*(length+width);
		System.out.println("Perimeter of the rectangle: "+perimeter);
		scanner.close();
	}
	//System.out.print -> Always starts from same line
	//System.out.println -> Always starts from new line
}