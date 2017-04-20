package C14_class;

import java.util.Arrays;
import java.util.List;

public class P318_ex3_Shapes {
	public static void main(String[] args) {
		List<Shape> shapes=Arrays.asList(new Circle(),new Square(),new Triangle(),new Rhomboid());
		for (Shape shape : shapes) {
			shape.draw();
		}
		//up cast
		Shape shape=new Rhomboid();
		//down cast
		Rhomboid r=(Rhomboid) shape;
		// Downcast to Circle. Succeeds at compile time,
		// but fails at runtime with a ClassCastException:
//		Circle c = (Circle)shape;
		
		//ex4
		if (shape instanceof Circle) {
			Circle c = (Circle)shape;
			c.draw();
		}else {
			System.out.println("Shape is not a Circle");
		}
	}
}

abstract class Shape{
	void draw(){
		System.out.println(this+".draw()");
	}
	abstract public String toString();
}

class Circle extends Shape{
	@Override
	public String toString() {
		return "Circle";
	}
}

class Square extends Shape{
	@Override
	public String toString() {
		return "Square";
	}
}

class Triangle extends Shape{
	@Override
	public String toString() {
		return "Triangle";
	}
}

class Rhomboid extends Shape{
	@Override
	public String toString() {
		return "Rhomboid";
	}
}