// Write a program to create a class named Shape.  It should contain two methods, draw() and erase() that prints Drawing Shape and 
// Erasing Shape respectively. For this class, create three sub classes, Circle, Triangle and Square and each class should override 
// the parent class functions - draw () and erase ().  The draw() method should print Drawing Circle, Drawing Triangle and 
// Drawing Square respectively.  The erase() method should print Erasing Circle, Erasing Triangle and Erasing Square 
// respectively. Create objects of Circle, Triangle and Square, assign each to Shape variable(reference) and call draw() and erase() 
// method using each object.

class Shape{
	void draw(){
		System.out.print("Drawing Shape");
	}
	
	void erase(){
		System.out.print("Erasing Shape");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("Drawing Circle");
	}
	
	void erase(){
		System.out.println("Erasing Circle");
	}
}

class Triangle extends Shape{
	void draw(){
		System.out.println("Drawing Triangle");
	}
	
	void erase(){
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	void draw(){
		System.out.println("Drawing Square");
	}
	
	void erase(){
		System.out.println("Erasing Square");
	}
}

class Q10_Shape_Draw_Erase{
	public static void main(String args[]){
		Square x = new Square();
		x.draw();
		x.erase();
		Circle y = new Circle();
		y.draw();
		y.erase();
		Triangle z = new Triangle();
		z.draw();
		z.erase();
	}
}