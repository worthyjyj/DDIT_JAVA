package z_homework.work06;

public class NewCar {
	private double speed; //static으로 변수를 선언하면 한번 값이 저장되면 객체를 새로 생성해도 초기화없이 그 메모리에 저장됐던 값에서 시작된다.  
	private String color;
	private static final double MAX_SPEED = 200.0; // 상수선언


   	public NewCar(String color) {
		this.color = color;
	}

	public void setspeed(double a) {
		this.speed = a;
	}

	public void setColor(String b) {
		this.color = b;
	}

	public double getSpeed() {
		this.speed = MileToKillo(speed);
		return speed;
	}

	public String getColor() {
		return color;
	}

	static double getMAX_SPEED() {
		return MAX_SPEED;
	}

	public boolean speedUp(double speed) {
		double temp = killoToMile(speed); //기존값 보관 
		if(temp<0 || temp>125) { //200km를 마일로 바꾸면 125마일 
			return false;
		}else {
			this.speed = temp + killoToMile(this.speed); //temp단위와 this.speed의 단위가 달라서 오류발생했음 
			return true;
		}
	}

	// 생성자, 게터, 스피드업 메서드에서 단위 변환메서드를 어떻게 사용해야 할지 모르겠음
	private static double killoToMile(double distance) {
		return distance / 1.6;
	}

	private static double MileToKillo(double distance) {
		return  distance * 1.6;
	}
	
	public static void main(String[] args) {
		NewCar myCar = new NewCar("red");
		System.out.println("myCar의 색: " + myCar.getColor());
		System.out.println("차의 최대 속력: " + Car.getMAX_SPEED() + "km/h");

		System.out.print("첫 번째 speedUp(100.0km/h): ");
		if (myCar.speedUp(100.0)) {
			System.out.print("속도 변경 가능,");
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + myCar.getSpeed() + "km/h");

		System.out.print("두 번째 speedUp(90.0km/h): ");
		if (myCar.speedUp(90.0)) {
			System.out.print("속도 변경 가능,");
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + myCar.getSpeed() + "km/h");

		NewCar yourCar = new NewCar("blue");
		System.out.println();
		System.out.println("yourCar의 색: " + yourCar.getColor());
		System.out.println("차의 최대 속력: " + Car.MAX_SPEED);

		System.out.print("첫 번째 speedUp(-100.0km/h): ");
		if (yourCar.speedUp(-100.0)) {
			System.out.print("속도 변경 가능,");
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + yourCar.getSpeed() + "km/h");

		System.out.print("두 번째 speedUp(210.0km/h): ");
		if (yourCar.speedUp(210.0)) {
			System.out.print("속도 변경 가능,");
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + yourCar.getSpeed() + "km/h");
	}
}
