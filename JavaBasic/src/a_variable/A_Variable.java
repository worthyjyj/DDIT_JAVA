package a_variable;

import java.util.Scanner;

public class A_Variable {

	public static void main(String[] args) {
		// 클래스에 대해 배우기 전까지 모든 코드는 이곳에 작성된다.
		
				// 주석: 프로그램 코드로인식하지 않는 문장
				//(주로 코드를 설명하는데 사용한다.)

				//한줄 주석: ctrl+shift+c
//				한줄주석
//				한줄주석
//				한줄주석
				
				
				/*범위주석 : ctrl + shift + /(해제 :\) */
				/*
				*범위주석
				*범위주석
				*범위주석
				*/
				
				/*
				 * 데이터의 종류
				 * -정수: 10, -10,868,-76874
				 * -실수: 3.14, -1.8
				 * -문자: 'a', '1', '가'
				 * -논리: true, false
				 * 
				 * 프로그래밍 언어의 기준으로데이터의 종류를 나눠놓은 것
				 * : 자료형(data type)
				 * 
				 * 기본형타입(괄호 안에는 자료형의 크기 byte)
				 * -정수: byte(1), short(2), int(4), long(8)
				 * -실수: float(4), double(8)
				 * -문자: char(2)
				 * -논리: boolean(1)
				 * 
				 * 변수를 만들 때 타입을 사용한다.
				 * 데이터를 다룰때 일반적으로 변수라는 그릇에 담아서 사용한다.
				 */
				
				//변수 : 하나의 데이터를 담을 수 있는 그릇
				int age; //변수 선언: 변수를 만드는 곳
				double pi;
//				double pi; //한 블럭 안에서 변수의 이름은 중복될 수 없다. 
//				int pi; 
				
//				int 국어, 영어, 수학; //한글로 변수선언 할 수 있지만 하지않음
				int kor, eng, math;
				int scoreAgv; //낙타표기법
				int score_total; //뱀표기법
				
				// = (대입연산자) : 오른쪽의 값을 왼쪽 변수에 저장
				age = 20 +10; //초기화: 변수에 처음으로 값을 입력함
//				age ="20"; // 변수의 타입에 맞는 갑을 저장해야한다.
				
				int abc = 10; //보통 선언과 초기화를 동시에 한다. 
				long l =40L; //접미사 L(l)을 붙여야 long타입이 된다.
				float f = 50F; //접미사 F(f)를 붙여야 float 타입이 된다.
				char c = '한'; // 단따옴표 안에 한 글자만 넣어야한다.
				boolean b =true; // true, false
				
				// 8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화해주세요. 
				byte _byte = 127;
				short _short = 200;
				int _int = 2000000000;
				long _long = 1000000000000000L;
				float _float = 5.7F;
				double _double = 6;
				char _char = '하';
				boolean _boolean = false; 
				
				int vA= 1, vB =2, vC=3; // 여러변수를 한번에 선언하고 초기화함
				
				System.out.println(_double);
				
				//형변환
				int small= 10;
				long big = 10L;
				small= (int)big;
				big = small;
				//표현범위가 작은 쪽에서 큰 쪽으로의 형변환은 생략이 가능하다.
				
				
				/*
				 * 상수
				 * - 처음 담긴 값을 변경할 수 없는 그릇
				 * - 리터럴에 의미를 부여하기 위해 사용한다. 
				 */
				final int MAX_NUMBER;
				MAX_NUMBER = 10;
//				MAX_NUMBER = 200; //컴파일 에러발생
				
				//출력 
				System.out.println("'줄바꿈'을 한다.");
				// print 뒤에 ln이 붙으면 출력 후 줄바꿈이 된다.
				System.out.print("'줄바꿈'을 하지 않는다.");
				System.out.println("줄바꿈!");
				System.out.println("나이 : " + age);
				System.out.println(age + age +"입니다.");
				// System.out.println("나이는 "+ age + "입니다.");
//				System.out.printf("나이는 %d 입니다.", age);
				//print 뒤에 f가 붙으면 format을 입력해줘야한다. 
				
//				// 입력
				Scanner sc = new Scanner(System.in);
//				System.out.print("아무거나 입력해주세요 >> ");
//				String str = sc.nextLine();
//				System.out.println(str);
//				// 입력을 받게되면사용자가 입력할때 프로그램이 멈추게 된다
//				// 내용을 입력 후 엔터를 치면 입력이 종료되고 프로그램이 다시 진행된다.
//				
//				//int nextInt = sc.nextInt();
//				//double nextDouble = sc.nextDouble();
//				//이런것들이 있지만 버그로 인해 사용하지 않는다.
//				
//				//숫자를 입력받고 싶을 때
//				System.out.print("정수를 입력해주세요 >> ");
//				String input = sc.nextLine();
//				int iInput = Integer.parseInt(input);
				
				//자신의 이름과 나이를 입력받아 변수를 선언 및 
				//초기화하고 출력하세요
				//출력 예 : 
				//이름: 홍길동, 현재나이: 20세, 내년 나이 : 21세
				
//				System.out.print("이름 입력하시오: ");
//				String name = sc.nextLine();
//				System.out.print("나이 입력하시오: ");
//				int agee = sc.nextInt();
//				System.out.print("이름: "+name+ "," + " 현재나이 : " + agee + "," + " 내년나이 : " + (agee+1));
				
				System.out.print("이름 입력하시오: ");
				String name = sc.nextLine();
				// syso + ctrl + space bar : System.out.println 자동완성
				System.out.print("나이 입력하시오: ");
				int agee = Integer.parseInt(sc.nextLine());
				System.out.printf("이름 : %s, 현재 나이 : %d세, 내년 나이: %세", name, age, age+1);
				
				String str = sc.nextLine();
				Integer.parseInt(str); //입력받은 값을 정수 (int)로 변환할 때
				Float.parseFloat(str); //입력받은 값을 float로 변환할 때
				Double.parseDouble(str); // 입력받은 값을 double로 변환할때 
				
				
				
				
				
			
				
				
				
				
				
				
	}
	
}
