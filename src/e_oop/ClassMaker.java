package e_oop;

public class ClassMaker {
	public static void main(String[] args) {
		//테스트코드 작성 
		
		ClassMaker cm = new ClassMaker();
		cm.method1();
		System.out.println(cm.method2());
		cm.method3(5);
		System.out.println(cm.method4(2,5));
		
		//이렇게 쓸 수 도 있다!! 
		//new ClassMaker().method1();
//		System.out.println(new ClassMaker().method2());
	}

	/*
	 * //1. 전역변수 하나를 선언 및 초기화 해주세요. 
	 
	
//2. 리턴타입과 파라미터가 없는 메서드를 하나 만들어주세요. 
//(단, 메서드 안에서 전역변수를 출력해주세요)
	
//3. 전역변수와 동일한 타입의 리턴타입이 있고. 
	//파라미터가 없는 메서드를 하나 만들어주세요 
	//(단,메서드 안에서 전역변수를 리턴해주세요. )
	
//4. 리턴타입은 없고 파라미터가 있는 메서드를 하나 만들어주세요. 
	//(단 메서드 안에서 파라미터를 출력해주세요.

	5. int타입의 리턴타입과 int타입의 파라미터 두 개가 있는 
	메서드를 하나 만들어주세요. 
	(단,메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.)
	*/
	
	int a=1; //1
	
	public void method1() {
		System.out.println(this.a);
	} //2
	
	public int method2() {
		return this.a;
	}//3
	
	public void method3(int aaa) {
		System.out.println(aaa);
	}//4
	
	public int method4(int a, int b) {
		return a*b;
	}//5
}
