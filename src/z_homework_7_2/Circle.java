package z_homework_7_2;

public class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return this.radius*this.radius*Math.PI;
	}
	
	@Override
	public double perimeter() {
		return this.radius*Math.PI;
	}

	@Override
	public String toString() {
		return "원, 둘레: " + perimeter() + "cm, 넓이: " + area() +" ㎠";
	}
}
