package b_operator;

public class B_ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - >, <, >=, <=, ==,!=
		 * - 문자열 비교: .equals()
		 * */
		
		// 비교연산자의 연산 결과는 boolean이다. 
		boolean b = 10 < 20;
		System.out.println("10 < 20 -> " +b);
		b = 10 <= 20 - 15;
		System.out.println("10 <= 20 -15 -> " +b); //산술연산자 먼저
		
		String str1 = "abc";
		String str2 = "abc";
		b = str1 == str2; //문자열의 내용이 아닌주소를 비교한 것이다. 
		System.out.println("str1 == str2 -> " + b);
		
		String str3 = new String ("abc");
		String str4 = new String ("abc");
		b = str3 == str4;
		System.out.println("str3 == str4 -> "+b);
		//String의 내용을 비교하기 위해서는 equals() 메서드를 사용한다.
		b= str3.equals(str4);
		System.out.println("str3.equals(str4) -> " +b);
	}

}
