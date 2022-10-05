package z_homework_7_2;

public class Triangle extends Shape {
	double side;

	public Triangle(double side) {
		super();
		this.side = side;
	} 
	
	@Override
	public double area() {
		return (Math.sqrt(3)/4)*this.side*this.side;
	}
	
	@Override
	public double perimeter() {
		return this.side*3;
	}

	@Override
	public String toString() {
		return "삼각형, 둘레: " + perimeter() + "cm, 넓이: " + area() +"㎠";
	}
	
	
	
}
