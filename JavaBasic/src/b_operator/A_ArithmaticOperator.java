package b_operator;

import java.util.Random;

public class A_ArithmaticOperator {

	public static void main(String[] args) {
		/*
		 *  산술연산자
		 *  - 사칙연산 : +, -, *, / , % (나머지)
		 *  - 복합 연산자: +-, -=, *=, /=, %=
		 *  - 증감 연산자 : ++, --
		 **/
		
		int result = 10+0-(((30*40)/50) %60);
		// 곱하기와 나누기가 더하기 빼기보다 우선순위가 높다. 
		
		//나머지 연산
		result =10/3; //3.333333...
		System.out.println(result);
		result = 10%4;
		System.out.println(result);

		// 5개의 산술 연산자를 사용해서 5개의 연산을 수행해보자
		//result = ..
//		System.out.println(result);
//		
//		result = 1+1;
//		System.out.println(result);
//		result = 1*7;
//		System.out.println(result);
//		result = 2-1;
//		System.out.println(result);
		
		//복합연산자
		//변수에 저장되어있는 값에 연산을 수행할때 
		//수행할 연산자와 대입 연산자를 결합해서 사용할 수 있다. 
		
		result = 10;
		result = result + 10;
		System.out.println(result);
		result +=10;
		System.out.println(result);
		result -= 10;
		System.out.println(result);
		result *= 10;
		System.out.println(result);
		result /= 10;
		System.out.println(result);
		result %=10;
		System.out.println(result);
		result += 5+5; //result = result + 10;
		System.out.println(result);
		//여기서의 result값은 복합연산자(자기자신이 포함된)기 때문에 계속 위의 값에서 연산이 되는것!!  
		
		// 증감연산자 
		// 증가연산(++) : 변수의 값을 1 증가시킨다. 
		// 감소연산자(--) : 변수의 값을 1 감소시킨다.
		int i =0;
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가
		i++; // 후위형:변수의 값을 읽어오고 1 증가
		--i;
		i--;
		i=0;
		System.out.println("++i =" + (++i)); //1
		i=0;
		System.out.println("i++ = " + (i++)); //0
		System.out.println("i= " + i); //1
		
		int _int = 10;
		double _double = 3.14;
		double _result2 = _int + _double;
		// 표현범위가 더 큰 타입으로 형변환 된다. 
		
		byte _byte = 5; 
		short _short = 10;
		int resul3 = _byte +_short;
		//int보다 작은 타입은 int로 형변환된다.
		
		char _char1='a'; 
		char _char2='b';
		int result4 = _char1 + _char2;
		System.out.println(result4);
		
		// 오버플로우, 언더플로우 
		// 표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b =127;
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		//타입을 선택할 때 연산의 범위를 고려해야한다.
		
		// 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요. 
		// 1. 123456 + 654321
		// 2. 1번의 결과값 * 123456
		// 3. 2번의 결과값 / 123456
		// 4. 3번의 결과값 - 654321
		// 5. 4번의 결과값 % 123456
		
		long a = 123456 + 654321;
		a *= 123456;
		a /= 123456;
		a -= 654321;
		a %= 123456;
		System.out.println(a);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구하세요 
		
		int num1 = 13;
		int num2 = 27;
		int num3 = 31;
		int sum = num1 + num2 + num3;
		// 소수점 아래 숫자가 0이 됨
		// double avg = sum / 3;
		//방법 1
		// double avg = (double)sum / 3;
		//방법 2
		double avg = sum / 3.0;
		System.out.println("합계 " + sum);
		System.out.println("평균 : " +avg);

		   // 반올림, 올림, 버림
		// 반올림 : Math.round(실수)
		// 올림 : Math.ceil(실수)
		// 버림 : Math.flood(실수)
		avg = Math.ceil(avg);
		System.out.println(avg);
		// 소수점 2번째까지 나오게 하는 방법 1
		avg = sum / 3.0;
		avg *= 100;
		avg = Math.round(avg); //소수점 두번째까지 킵하고 나머지 다 날림
		avg /= 100; // 2367을 100으로 나눠서 다시 소수점넣기 
		System.out.println(avg);
		//방법2
		avg = sum / 3.0;
		System.out.printf("%.2f", avg);
		System.out.println(); // 강제 줄바꿈

		//랜덤
		//Math.random() : 0.0 ~ 1.0미만 (0.99999999.....)
		//보안문제로 사용하지 않는다.
		//Random rnd = new Random();
		//rnd.nextInt(); => int 범위 내의 int가 랜덤으로 출력
		//rnd.nextInt(46); => 46보다 작은 int가 랜덤으로 출력
		Random rnd = new Random();
		System.out.println(rnd.nextInt(46));
		// 50~99까지 => (0 ~49) + 50 => (0~(50-1))) + 50
		int rNum = rnd.nextInt(50) +50;
		System.out.println(rNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
