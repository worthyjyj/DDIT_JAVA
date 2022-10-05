package e_oop;

public class SampleClass {
	/*
	 *
	 * field
	 * 
	 */
	public static void main(String[] args) {
		int local = 10;
		// 지역변수 : 메서드 안에서만 사용 가능

		new SampleClass().method1();
		new SampleClass().method2("405");

		String name = new SampleClass().method3();
		System.out.println(name);

		new SampleClass().flowTest1();
	}

//	String name = new SampleClass().method3();   
	/*
	 *
	 * field
	 * 
	 */
	boolean field;
	// 전역변수 : 클래스 전체 영역에서 사용가능
	// 초기화하지 않아도 기본값으로 초기화
	String classNumber = "405";

	/*
	 * 메서드(method) : 변수를 가지고 하는 작업(일) - 선언방법 : 접근제한자 리턴타입 메서드명(파라미터){} - 파라미터 (매개변수)
	 * : 실행에 필요한 정보 - 리턴타입 (반환타입) : 실행 후 돌려줘야 하는 결과물
	 */

	public void method1() {
		// void : 메서드가 종료 후 반환하는 결과물이 없음
		// 파라미터가 없음
		System.out.println("리턴 타입도 파라미터도 없음");
	}

	public void method2(String parameter) {
		// String 타입의 파라미터가 필요하다
		System.out.println(parameter + " : 파라미터를 받아 명령을 수행함");
	}

	public String method3() {
		// 메서드가 종료 후 반환하는 결과물이 String 타입
		String str = "홍길동";
		return str; // return => 메서드를 종료한다.
//		System.out.println(str); //도달할 수 없는 코드 
	}

	// flowTest1() 호출 시 출력되는 문장에 순서를 붙여주세요
	public void flowTest1() {
		System.out.println("flowTest1 시작 : 1");
		flowTest3();
		System.out.println("flowTest1 종료 : ");
	}

	public void flowTest2() {
		System.out.println("flowTest2 시작 :");
		System.out.println("flowTest2 종료 : ");
	}

	public void flowTest3() {
		System.out.println("flowTest3 시작 :");
		flowTest2();
		System.out.println("flowTest3 종료 :");
	}
}
