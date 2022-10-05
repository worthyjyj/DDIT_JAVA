package z_homework_7_2;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3]; //shape 타입의 배열 
		shapes[0] = new Circle(1.0);  //다형성이용되어 각 도형클라스에 오버라이딩된 메소드 호출 
		shapes[1] = new Triangle(2.0);
		shapes[2] = new Rectangle(2.0,3.0);
		
		for(Shape shape : shapes) {
			System.out.println(shape);
		}
		
	}
}
