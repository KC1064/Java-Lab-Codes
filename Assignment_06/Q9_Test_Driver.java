import btech;
import btech.Student;
import java.util.*;

class Q9_Test_Driver{
	public static void main(String args[]){
		Student x = new Student(75,"Kiron");
		x.display();
		Scanner sc = new Scanner(System.in);
		double m = sc.nextInt();
		double n = sc.nextInt();
		MyMath obj = new MyMath(m,n);
		System.out.println("Add: "+obj.add(m,n));
		System.out.println("Sub: "+obj.sub(m,n));
		System.out.println("Div: "+obj.div(m,n));
		System.out.println("Mul: "+obj.mul(m,n));
		System.out.println("Mod: "+obj.mod(m,n));
	}
}