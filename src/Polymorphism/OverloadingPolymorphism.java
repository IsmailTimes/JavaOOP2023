package Polymorphism;


class Shape{
	double area() {
		return 0;
		
	}
}

class Rectangle extends Shape{
	double length, width;
	
	Rectangle(double length, double w){
		this.length = length;
		width =w;
	}
	 
	double area() {
		return length * width;
	}
}

class Triangle extends Shape{

	double base, height;
	Triangle(double b, double h){
		base = b;
		height = h;
	}
	double area() {
		return 0.5*base*height;
	}
}


public class OverloadingPolymorphism {

	public static void main(String[] args) {

		Shape s = new Shape();
		Rectangle r = new Rectangle(10.0, 20.0);
		Triangle t= new Triangle(10, 20);
		
		System.out.println(s.area());
		System.out.println("Area of the Rectangle: "+  r.area());
		System.out.println("Area of the Triangle: "+t.area());
		
	}

}
