//Define a class Employee with the following members: 
//Data members: 
//private String empName 
//private String empNo 
//private int dependentCnt 
//Methods:
//Employee(String name, String eno, int depcnt): constructor 
//void showEmpDetails():displays empNo and empName 
//intdepCount(): returns dependentCnt 
//Write a separate class called EmpTest with a main method that define an array of n employees where 
//the value of n will be inputted from the user. Read and store the information of all n employees. 
//Display the details of the employees with more than two dependents. 

import java.util.*;

class Employee {
    String empName;
    String empNo;
    int dependentCnt;

    Employee(String name, String eno, int depcnt) {
        empName = name;
        empNo = eno;
        dependentCnt = depcnt;
    }

    void showEmpDetails() {
        System.out.println("Name: " + empName);
        System.out.println("Employee No.: " + empNo);
    }

    int depCount() {
        return dependentCnt;
    }
}

public class Q5_EmpTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Employees: ");
        int n = sc.nextInt();
        Employee arr[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for employee " + (i + 1) + ": ");
            String x = sc.next();
            System.out.print("Enter employee number for employee " + (i + 1) + ": ");
            String y = sc.next();
            System.out.print("Enter dependent count for employee " + (i + 1) + ": ");
            int z = sc.nextInt();
            arr[i] = new Employee(x, y, z);
        }

        System.out.println("\nEmployees with more than 2 dependents:");
        for (int i = 0; i < n; i++) {
            int temp = arr[i].depCount();
            if (temp > 2) {
                arr[i].showEmpDetails();
            }
        }
    }
}
