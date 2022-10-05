package d_array;

public class A_ReferenceType {

	public static void main(String[] args) {
		/*
		 * 참조타입
		 * 자바의 타입은 크게 기본타입과 참조타입으로 분류된다. 
		 * - 기본타입:  int, double,boolean, char, float, long, byte, short,
		 * - 참조타입: 배열타입, 열거타입, 클래스, 인터페이스
		 * 
		 * 기본타입은 변수의 값을 실제 변수안에 저장하지만,
		 * 참조타입은 값이 저장된 주소를 저장함
		 **/
		
		// 기본타입
		int age = 20;
		double pi = 3.14;
		// 참조타입
		String name = "홍길동"; //String name = new String("홍길동")
		String type = "java";
		
		// 기본타입 변수 테스트
		int a1 = 0;
		int a2 = a1;
		System.out.println(a2);
		a1+=1;
		System.out.println(a2);
		
		//참조타입 변수 테스트 
		// Scanner, Random 
		ReferenceTest rt1 = new ReferenceTest();
		// ReferenceTest 클래스로 하나의 객체(참조형변수)를 만든다.
		ReferenceTest rt2 = rt1;
		//위에서만든참조형 변수를 다른 이름의 참조형 변수에 넣어준다.
		System.out.println(rt1); // d_array.ReferenceTest@15db9742
		System.out.println(rt2); // d_array.ReferenceTest@15db9742
		// 두 참조형 변수의 주소값이 같은지 확인한다. 
		
		System.out.println(rt2.i);
		//rt2안에 있는 int형 i의 값을 확인한다.
		rt1.i += 1;
		//rt1안에 있는 int형 id의 값을 1증가시킨다. 
		System.out.println(rt2.i);
		//rt2안에 있는 i의값을 확인한다. 
		//rt1과 rt2는 같은 객체를 바라보기 때문에 rt1의 값이 바뀌면
		//rt2도 값이 바뀐것 처럼 보인다. 
		
		//참조형 변수는 주소를 가지고있지 않다는 의미로 null값을 가질 수 있다. 
		String str1 = null;
		System.out.println(str1);
		//"문자열".length() : 문자열의 길이를 구하는 메서드
		System.out.println(name.length());
		str1 = new String ("이순신"); 
		String str = "이순신";
		System.out.println(str1.length());
	}
}

class ReferenceTest{
	int i= 0;
	
}
