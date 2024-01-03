package OOP;

class Circle{
	
	double radius;
	Circle(){
		
	}
	
	Circle(double newRadius){
		radius = newRadius;
	}
	
	public double getArea() {
		return (3.14159*radius*radius);
		
	}
}

public class areaCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		System.out.println(c1.getArea());

	}

}
