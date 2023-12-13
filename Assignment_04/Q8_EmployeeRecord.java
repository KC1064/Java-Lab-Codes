//Write a program that will take employee id, employee name, manager id, department number, salary, job from the command prompt. 
//If the user does not provide exactly two numbers of argument then the program should display error message. 
//Use methods display() to display the record of employee. 

import java.util.Scanner;

public class Q8_EmployeeRecord {
    private int employeeId;
    private String employeeName;
    private int managerId;
    private int departmentNumber;
    private double salary;
    private String job;

    Q8_EmployeeRecord(int employeeId, String employeeName, int managerId, int departmentNumber, double salary, String job) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.managerId = managerId;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.job = job;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Manager ID: " + managerId);
        System.out.println("Department Number: " + departmentNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Job: " + job);
    }

    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Error: Please provide exactly six arguments - employeeId, employeeName, managerId, departmentNumber, salary, job");
        }
		else {
                int employeeId = Integer.parseInt(args[0]);
                String employeeName = args[1];
                int managerId = Integer.parseInt(args[2]);
                int departmentNumber = Integer.parseInt(args[3]);
                double salary = Double.parseDouble(args[4]);
                String job = args[5];

                Q8_EmployeeRecord employee = new Q8_EmployeeRecord(employeeId, employeeName, managerId, departmentNumber, salary, job);
                employee.display();
            } 
        }
}
