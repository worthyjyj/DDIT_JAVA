package z_homework.work06;

public class Circle {

	double radius;
	double x;
	double y;

	Circle() {};

	public double getArea() {
		return radius * radius * Math.PI;
		//return Math.PI * Math.pow(this.radius,2);
	}
	
	public double getradius() {
		if(radius<0) {
			radius = 0.0;
			return radius; 
		}
		return radius;
	}
	public double getx() {
		return x;
	}
	public double gety() {
		return y;
	}
	
	

	public void setradius(double radius) {
		if(radius<0) {
			this.radius = 0;
		}
		this.radius = radius;
	}

	public void setx(double x) {
		this.x = x;
	}

	public void sety(double y) {
		this.y = y;
	}

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setradius(3.6);
		circle1.setx(1.0);
		circle1.sety(2.2);
		
		System.out.println("반지름 : " +circle1.getradius());
		System.out.println("중심좌표 : " + "(" + circle1.getx() +"," + circle1.gety() +")");
		System.out.printf("넓이 : %.2f\n",circle1.getArea());
		
	}
}