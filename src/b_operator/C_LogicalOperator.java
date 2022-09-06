package b_operator;

public class C_LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자 
		 * -&&(AND), || (shift +\)(OR), !(NOT), ^(XOR)
		 */
		
		boolean b = 5 < 10 && (15%2 ==0 || 9 >=5);
		System.out.println("5 < 10 && (15%2 ==0 || 9 >=5) ->" +b);
		// ||가 먼저 계산되는 의도를 반영하기 위해서는
		// 반드시 괄호를 넣어주어야 한다. 
		
		// 효율적인 연산
		b = true && true; // true
		b = true && false; // false
		b= false && true; // false
		b= false && false; // false
		
		b= true || true; //true
		b= true || false; // true
		b= false || true; //true
		b = false || false; // false
		
		// 왼쪽의 피연산자에서 결과가 정해지면 오른족은 수행하지 않는다.
		
		int d = 0;
		System.out.println(0==d || 0 == ++d);
		System.out.println(d);
		
		//int 타입의 변수 x와 y를 만들고 다음의 문장들을 코드로 작성해주세요. 
		int x=10, y=20; 
		
		// 1. x가 y보다크고, x가 10보다 작다.
		System.out.println("x > y && x < 10");
		
		// 2. x가 짝수고, x가 y의 배수다.
		System.out.println("x%2==0 && x%y==0");
		
		//3. x가 3의 배수거나, x가 5의 배수이다.
		System.out.println("x%3==0 || x%5==0");
		
		
		
		
		
	}
}
