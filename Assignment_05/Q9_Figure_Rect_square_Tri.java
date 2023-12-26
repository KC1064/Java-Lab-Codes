// 9.	Create a class Figure with instance members dim1 and dim2. Use constructor and area() that returns the area of figure. Create a derived 
// class Rectangle derived from Figure and area() that returns the area of rectangle. Create another derived class Triangle and Square that has 
// area() which returns area of Triangle and Square respectively. Derived class have appropriate constructor. Using method overriding concept 
// test the functionalities of derived class by creating objects and super class memory references in Driver class.

import java.util.*;

class Figure {
    int dim1, dim2;

    Figure(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    void area() {
        System.out.println("Area: " + dim1 * dim2);
    }
}

class Rectangle extends Figure {
    Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    void area() {
        System.out.println("Area of Rectangle: " + dim1 * dim2);
    }
}

class Square extends Figure {
    Square(int dim1, int dim2) {
        super(dim1, dim2);
    }

    void area() {
        System.out.println("Area of Square: " + dim1 * dim2);
    }
}

class Triangle extends Figure {
    Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    void area() {
        System.out.println("Area of Triangle " + 0.5f * dim1 * dim2);
    }
}


public class Q9_Figure_Rect_square_Tri {
    public static void main(String[] args) {
        Rectangle x = new Rectangle(12, 4);
        x.area();
		Square y = new Square(20,20);
		y.area();
		Triangle z = new Triangle(23,6);
		z.area();
    }
}
