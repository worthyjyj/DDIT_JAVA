package z_homework_7_2;

public class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	} 
	
	public double area() {
		return this.width*this.height;
	}
	
	public double perimeter() {
		return (this.height+this.width)*2;
	}

	@Override
	public String toString() {
		return "사각형, 둘레: " + perimeter() + "cm, 넓이: " + area() +"㎠";
	}
	
}
