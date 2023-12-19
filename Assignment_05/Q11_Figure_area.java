// Define an abstract class named Figure, having data members dim1 and dim2. Extend this class to create two concrete classes named 
// Rectangle and Triangle. Override the getArea() method in the sub classes. Invoke the getArea() method in the main method of another 
// Driver class through the abstract class reference variable.  

import java.util.*;

abstract class Figure {
    double dim1, dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double getArea();
}

class Rectangle extends Figure {
    Rectangle(double length, double width) {
        super(length, width);
    }

    double getArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double base, double height) {
        super(base, height);
    }

    
    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}

public class Q11_Figure_area {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(5, 10);
        Figure triangle = new Triangle(8, 6);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
