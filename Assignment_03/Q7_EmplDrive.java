//Write a program by creating an 'Employee' class having the following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'addSal()' which adds $10 to salary of the employee if it is less than $500.
//3 - 'addWork()' which adds $5 to salary of employee if the number of hours of work per day is more 
//than 6 hours.
import java.util.*;

class Employee {
    int salary, work_hours;

    void getInfo(int sal, int hour_pday) {
        salary = sal;
        work_hours = hour_pday;
    }

    void addSal() {
        if (salary < 500) {
            salary = salary + 10;
        }
    }

    void addWork() {
        if (work_hours > 6) {
            salary = salary + 5;
        }
    }
}

class Q7_EmplDrive {
    public static void main(String args[]) {
        Employee x = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base salary: ");
        int p = sc.nextInt();
        System.out.print("Enter the work hours per day: ");
        int q = sc.nextInt();
        x.getInfo(p, q);
        x.addSal();
        x.addWork();
        System.out.print("Final Salary: " + x.salary); 
    }
}
