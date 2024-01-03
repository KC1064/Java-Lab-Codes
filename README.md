# Java Lab Assignments

## Questions

<details>
  <summary>Assignment 01</summary>

  1. Write a program to display your name, branch, roll no, and college name on the computer screen.
  2. Write a program to display the addition result of two numbers 10.25 and 20.55 on the screen.
  3. Write a program to input two floating point numbers through the keyboard and display their sum.
  4. Write a program to swap two numbers using a third variable.
  5. Write a program to swap two numbers without using a third variable.
  6. Write a program to input the radius value of a circle through the keyboard and then display the area of the circle.
  7. Write a program to find out the area of any rectangle.
  8. Write a program to input the marks of a student in three different subjects and then display the average mark.
  9. Write a program to input the principal amount, rate of interest, and the time period through the keyboard and find out the simple interest.
  10. Write a program to convert the temperature from Fahrenheit scale to Celsius scale.
  11. Write a program to input the time value in seconds and then display it in the hour: minute: second format using the modulus operator (%).
  12. Write a program to enter the distance value in meters and then display it in Km: Meter format using the modulus operator.
  13. Write a program to find out the largest between two numbers using a conditional operator.
  14. Write a program to find out the largest among three numbers using the conditional operator.
  15. Write a program to find out the sum of the individual digits of any four-digit integer number.

</details>

<details>
  <summary>Assignment 02</summary>

1. Write a program to check whether an inputted number is positive or negative.

2. Write a program to test whether a number is positive, negative, or equal to zero.

3. Write a program to calculate tax, given the following conditions:
     - If income is less than 150,000, then no tax.
     - If taxable income is in the range 150,001 to 300,000, then charge 10% tax.
     - If taxable income is in the range 300,001 to 500,000, then charge 20% tax.
     - If taxable income is above 500,001, then charge 30% tax.

4. Write a program to enter the marks of a student in 4 different subjects. Then display the grade as per the following conditions:
     - If the average mark is greater than or equal to 90, then grade is O.
     - If the average mark is greater than or equal to 80 but less than 90, then grade is E.
     - If the average mark is greater than or equal to 70 but less than 80, then grade is A.
     - If the average mark is greater than or equal to 60 but less than 70, then grade is B.
     - If the average mark is greater than or equal to 50 but less than 60, then grade is C.
     - If the average mark is less than 50, then grade is F.

5. Write a program to calculate the roots of a quadratic equation.

6.  Write a program to enter a number from 1 to 7 and display the corresponding day of the week using a switch statement.

7. Write a program to find out the factorial of any inputted number.

8.  Write a program to check whether an inputted number is prime or not.

9.  Write a program to check whether an inputted number is palindrome or not.

10. Write a program to find out the binary equivalent of any inputted decimal number.

11. Write a program to display all Armstrong numbers between 1 to 10,000.

12. Write a program to find the mean of n numbers using an array.

13. Write a program to find the largest of n numbers using an array.

14. Write a program to interchange the largest and smallest element of any array.

15. Write a program to enter elements into a 2-D array and then display them.

16. Input two numbers and find their GCD.

17. Write a program to input an Integer Array of 10 elements and display the Largest and Smallest Element in that array.

18. Write a program to search an Integer from an Array.

19. Write a program to sort an Array of Integers using BubbleSort.

20. Write a program to input an Array and Display the Elements that are Divisible by 2.

21. Write a program to show the factorials of all numbers from 1 to n.

22. Write a program to input an Array and list out all Primes and Composites.

23. Write a program to input a 2D Array and Display the Sum of the Elements of the Array.

24. Write a program to add 2 Matrices.

25. Write a program to input 2 Matrices and Display their Transpose.

</details>

<details>
<summary>Assignment 03</summary>

1. Write a program to Print the average of three numbers entered by the user by creating a class named 'Average' having a method to calculate and print the average. Define another driver class to demonstrate the basic operation.

2. Write a program to Create a class named 'Student' with String variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '20' and that of name as "John" by creating an object of the class Student.

3. Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area ()' which returns the area.

4. Print the sum of two complex numbers by creating a class named 'Complex' whose real and imaginary parts are entered by the user.

5. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'.

6. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. The first method named 'setDim ()' takes the length and breadth of the rectangle as parameters, and the second method named 'getArea ()' returns the area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.

7. Write a program by creating an 'Employee' class having the following methods and print the final salary.
   - 'getInfo()' which takes the salary, the number of hours of work per day of the employee as parameters
   - 'addSal()' which adds $10 to the salary of the employee if it is less than $500.
   - 'addWork()' which adds $5 to the salary of the employee if the number of hours of work per day is more than 6 hours.

8. Define a class Stack, which performs the basic operation of the stack. Define another driver class to demonstrate the basic operations.

9. Develop a Java program that will deal with employee information of an organization. Define a class Employee. The minimum number of data member and member function are as follows:<br>
   Data members: empName, empNo, basicSal, da, hra, grossSal<br>
   Methods: calGrossSal(), showEmpDetails()<br>
   You are free to add more relevant data member and member functions. Define a parameterized constructor to initialize empName, empNo, and basicSal. Create any two objects of the Employee class and initialize their data members while object creation. Use the method calGrossSal() to calculate the gross salary.

10. Create a class named Item that holds data about an item in a retail store. The class should have the following three fields:
    - name: the name field is a String object that holds the name of the item.
    - price: the price field is a double variable that holds the item's retail price
    - quantity: the quantity field is an int variable that holds the number of units currently in inventory<br><br>
    Write a constructor method that accepts three arguments, name, price, & quantity and stores the values of the arguments passed into it in the object's instance fields.<br><br>
    Write four public methods to retrieve the values from the three fields and their current inventory value:
    - String getName( ) returns the item name
    - double getPrice( ) returns the price of the item
    - int getQuantity( ) returns the number of quantities
    - double getValue( ) that returns the current inventory value (quantity * price)
    <br>
    <br>
    Write a separate class called Inventory with a main method that creates three Item objects and then produces a neatly formatted table of the store's inventory displaying the three items, their current inventory value, and the total inventory value for the store. Duplicate the format of the output exactly shown below. Test your output with different items in inventory.

11. Declare a variable Student which consists of a student’s name, mark for Programming, mark for Logic, and a grade for Lab. A mark is a number (between 0 and 100) and a grade is a letter (between A and F). Write a predicate (a boolean method) isStronger, which takes two students and returns true if and only if the first student has done better than the second in the ordering below.
    - the Programming mark is most important,
    - numerical order of Logic marks is the determining factor when two students have the same Programming mark,
    - alphabetical order of Lab grades is the determining factor when two students have the same Programming and Maths marks.

</details>

<details>
<summary>Assignment 04</summary>

1. Define a class 'Box' that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.

2. Design a class 'ComplexNum' to manipulate Complex numbers having data members as real and img. The class should have a parameterized constructor to initialize its data members. It should also have methods `displayCompNumber()` to display the complex number (in the format 5+3i for example) and `addCompNumber()` to add two Complex numbers. Test these methods by creating the main method in another class.

3. Design a class 'Point' with data members as xCo and yCo. The class should have a parameterized constructor to initialize its data members. Define a method `distanceBetPoints()` which returns the distance between two points.

4. Design a class 'Time' having data members as hour, minute, and second. The class should have a parameterized constructor to initialize its data members. It should also have methods `displayTime()` to display the time in HH:MM:SS format and `addTime()` to add two times. Test these methods by creating a main method in another class.

5. Define a class `Employee` with the following members:
   Data members:
   - private String empName
   - private String empNo
   - private int dependentCnt

   Methods:
   - `Employee(String name, String eno, int depcnt)`: constructor
   - `void showEmpDetails()`: displays empNo and empName
   - `int depCount()`: returns dependentCnt

   Write a separate class called `EmpTest` with a main method that defines an array of n employees where the value of n will be inputted from the user. Read and store the information of all n employees. Display the details of the employees with more than two dependents.

6. Create a class `Account` having data members accNo, balance, timePeriod, and int InYears (as static and initialize with 7.5%). The class should also contain the following methods:
   - `float calculateInterest()`: calculates and returns the interest amount.
   - `void showAccDetails()`: displays account number, balance, and calculated interest amount.
   - `static void changeIntRate(float newRate)`: changes the interest rate to newRate.

   Create an array of objects of the class Account. Store the details of each object through the parameterized constructor. Display all the account details by calling the method `showAccDetails()`. Change the interest rate to a new one by calling the method `changeIntRate()`. Finally, display the account details after the change in the interest rate.

7. Write a program that will take two integer numbers from the command prompt and find their GCD and LCM. If the user does not provide exactly two numbers of arguments, then the program should display an error message.

8. Write a program that will take employee id, employee name, manager id, department number, salary, job from the command prompt. If the user does not provide exactly two numbers of arguments, then the program should display an error message. Use methods `display()` to display the record of the employee.

</details>

<details>
<summary>Assignment 05</summary>

1. Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
   a) method of parent class by object of parent class
   b) method of child class by object of child class
   c) method of parent class by object of child class

2. Create a class `Point2D` with the data member x and y coordinate and methods `getCoord()` that sets the coordinate value and `display()` to show the coordinates. Create a subclass called `Point3D` which is derived from the superclass `Point2D` with data members z coordinate and has methods `getInput()` to initialize the input and `show()` method to display the coordinates. Test the methods of both the classes by creating objects in the main method of the driver class.

3. Update the Q2 with default and parameterized constructor. Make changes as necessary. Test the functionalities of above methods in the driver class.

4. Create a derived class `Circle` inherited from the class `Point2D` (created in Q2) with the data member radius and method `area()` that returns the area of circle. Create a subclass called `Cylinder` which is derived from the superclass `Circle` having data member height and `volume()` that computes the volume of cylinder. Use constructor to initialize the instance variables. Test the methods of `Circle` and `Cylinder` classes by creating objects in the main method of another class.

5. Write a program that creates a class `Account` that has members customer name, account number. Account has constructor to initialize its members and method `display()` to show the result. Create a child class `Savings_Account` that is derived from `Account` class. `Savings_Account` has members `min_bal` and `saving_bal`. Use `show()` to display its details. Then create another child class `Account_details` from `Savings_Account` class have members `deposit`, `withdrawl` and a method `show1()` to show its details. Child classes have constructors of their own. Create a driver class that creates a record of customer and display all its details.

6. Create a class `Person` that has data member name. Use constructor to initialize name and `display()` to display name. Create a derived class `Employee` from `Person` class having private members `empid`. Using constructor initialize `empid` and have method `display()` to display `empid`. Create another derived class `HourlyEmployee` from `Employee` with private members `hourlyRate` and `hoursWorked`. Use constructor to initialize input and methods `getGrossPay()` that computes and returns the gross pay of the employee and `display()` to display the `hourlyRate`, `hoursWorked` and gross pay. Create a driver class to test the functionalities of the above classes and display output in the following format:<br>
Name : John Smith<br>
EmpID : 7569<br>
Hourly Rate : 100<br>
Hours worked : 2000<br>
Gross pay : 200000 <br>
7.	Create a class Student having data members name, roll and address. Note that address is an object of inner class Address having data members city and pin. Create some student class objects. Read, store (using constructor) and display their information. While creating the objects your program should display a message “Creating student number n” from the constructor. You can get the value of n by using a static member of Student class which is initialized to 0.
8.	Create the classes as given in the below figure. Display the interest rate in the following format:
SBI Rate of Interest : 8
ICICI Rate of Interest : 7
AXIS Rate of Interest : 9
 
9.	Create a class Figure with instance members dim1 and dim2. Use constructor and area() that returns the area of figure. Create a derived class Rectangle derived from Figure and area() that returns the area of rectangle. Create another derived class Triangle and Square that has area() which returns area of Triangle and Square respectively. Derived class have appropriate constructor. Using method overriding concept test the functionalities of derived class by creating objects and super class memory references in Driver class.
10.	Write a program to create a class named Shape.  It should contain two methods, draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively. For this class, create three sub classes, Circle, Triangle and Square and each class should override the parent class functions - draw () and erase ().  The draw() method should print “Drawing Circle”, “Drawing Triangle” and “Drawing Square” respectively.  The erase() method should print “Erasing Circle”, “Erasing Triangle” and “Erasing Square” respectively. Create objects of Circle, Triangle and Square, assign each to Shape variable(reference) and call draw() and erase() method using each object.
11.	Define an abstract class named “Figure”, having data members dim1 and dim2. Extend this class to create two concrete classes named Rectangle and Triangle. Override the getArea() method in the sub classes. Invoke the getArea() method in the main method of another Driver class through the abstract class reference variable.  

</details>

<details>
<summary>Assignment 06</summary>

1. Create an abstract class `Bank` that has an abstract method `getROI()`. Create two classes `SBI`, `PNB`, `BOI` inherited from `Bank`. Create a driver class that prints the rate of interest of each bank using super class memory reference.

2. Define an interface `Calculator` which has the basic methods `add()`, `sub()`, `mul()` and `div()`. Define a concrete class named `DemoCalculator` that implements the interface. Define the driver class, which creates object reference of the interface `Calculator` and performs all basic operations of the calculator.

3. Create an abstract class `Shape` with three abstract methods namely `RectangleArea` taking two parameters, `SquareArea` and `CircleArea` taking one parameter each. The parameters of `RectangleArea` are its length and breadth, that of `SquareArea` is its side and that of `CircleArea` is its radius. Now create another class `Area` containing all the three methods `RectangleArea`, `SquareArea` and `CircleArea` for printing the area of rectangle, square and circle respectively. Create an object of class `Area` and call all the three methods.

4. Write a program to implement multiple inheritance using interface.

5. Create an interface `Servicing` that has abstract methods `getServiceTime()`. Create two classes `Car`, `Bike` that implement interface. Create a driver class that creates the objects of two classes and displays the service time.

6. Create a Package `btech` which has one class `Student`. Accept student detail through parameterized constructor of `Student` class. Write a method `display()` to display the student details. Create another class `Test` containing the main method which will use the package `btech` and calculate total marks and percentage of marks. One sample output is shown below.

7. Create a sub-package called `arithmetic` under the package `btech`. The `arithmetic` package should contain a class `MyMath` having methods to deal with different arithmetic operations (addition, subtraction, multiplication, division and mod). Create a class `Test` containing the main method which will use the methods of sub-package `arithmetic`.

8. Create a sub-package named `shapes` under a package `org`. Create some classes in the package representing some common geometric shapes like `Square`, `Triangle`, `Circle` and so on. The classes should contain the `area()` and `perimeter()` methods in them. Compile the package. Use this package to find area and perimeter of different shapes as chosen by the user.

</details>

</details>

<details>
<summary>Assignment 07</summary>

1. Write an exception handling Java program to read two numbers `n1`, `n2` and calculate and print the result of `n1/n2`. If `n2` is zero (0), then it will be handled by the exception handler and again ask the value of `n2`. In the exception handler, the program should display an appropriate message to the user.

2. Write a Java program to read two numbers `x` and `y` and calculate `x/(x-y)`. The program should check the value of `x-y`. Before dividing with `x`, it should throw an exception if `x-y` is zero. In the exception handler, the program should display an appropriate message to the user.

3. Write an exception handling Java program to print the index position of an existing integer array. The index value will be entered by the user. It will be handled by the exception handler if the index position is greater than the size of the array. In the exception handler, the program should display an appropriate message to the user.

4. Write a program to illustrate the use of multiple catch blocks associated with a single try block.

5. Write a class called `Account` with the following properties and methods:
   Properties: `String name`, `int acc_no`, `double balance`
   Methods:  
   - `void deposit(double amt)`
   - `void withdraw(double amt)`

   Assume that an account needs to have a minimum balance of 500. If an attempt is made to withdraw, which results in the balance going below 500, throw a user-defined exception called `MinimumBalanceException`. Use `throw` and `throws` wherever necessary.

6. Write a class called `Account` with the following properties and methods:
   Properties: `String name`, `int acc_no`, `double balance`
   Methods:  
   - `void deposit(double amt)`
   - `void withdraw(double amt)`
   - `void transfer(Account acc1, Account acc2, double amt)`

   Assume that an account needs to have a minimum balance of 500. If an attempt is made to withdraw or transfer, which results in the balance going below 500, throw a user-defined exception called `MinimumBalanceException`. Use `throw` and `throws` wherever necessary.

7. Write a program that prompts the user to enter a length in feet and inches and outputs the equivalent length in centimeters. If the user enters a negative number or a non-digit number, throw and handle an appropriate exception and prompt the user to enter another set of numbers.

</details>
