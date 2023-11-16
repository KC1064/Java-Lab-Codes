// Write a program that would print the information (name, year of joining, salary, address) of 
//three employees by creating a class named 'Employee'.
import java.util.*;

class Employee{
	String name;
	String address;
	int salary;
	int joining_year;
	
	void assign(String p, int q, int r, String s){
		name=p;
		joining_year=q;
		salary=r;
		address=s;
	}
	
	void Display(){
		System.out.println("Details of Employee: ");
		System.out.println("Name: "+name);
		System.out.println("Year of Joinig "+joining_year);
		System.out.println("Salary: "+salary);
		System.out.println("Address: "+address);
	}
}

class Q5_EmployeeDemo{
	public static void main(String args[]){
		Employee arr[]= new Employee[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++){
			arr[i]= new Employee();
		}
		for(int i=0;i<3;i++){
			String x = sc.next();
			int y = sc.nextInt();
			int z = sc.nextInt();
			String w = sc.next();
			arr[i].assign(x,y,z,w);
			arr[i].Display();
		}
		
	}
}