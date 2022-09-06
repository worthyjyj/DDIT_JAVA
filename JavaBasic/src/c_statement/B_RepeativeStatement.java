package c_statement;

import java.util.Random;
import java.util.Scanner;

public class B_RepeativeStatement {
	public static void main(String[] args) {
		/*
		 * 반복문
		 * - for문
		 * - while문
		 * - do-while문
		 * 
		 * for문
		 * - for(초기화; 조건식; 증감식) {실행문}
		 * - 실행문을 정해진 횟수만큼 반복하게 해주는 문장
		 * 
		 */
		for(int i=1; i <=10 ; i++) {
			//초기화 : 조건식과 증감식에 사용할 변수 초기화
			//조건식 : 연산결과가 true이면 블럭 안의 내용을 수행한다.
			//증감식 : 변수를 증가/감소시켜 반복문을 제어한다. 
			System.out.println(i+ "번째 반복");
			//초기화한 변수는 블럭안에서만 사용할 수 있다. 
		}
		// 규칙이 있는 문장들을 효율적으로 작성하기 위해 반복문을 사용한다. 
		
		//1부터 10까지의 합계를 구하시오
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//1부터 100까지의 합을 구하시오
		sum = 0;
		for (int i = 100 ; i >= 1 ; i--) {
			sum += i;
		}
		System.out.println(sum);
		
		//문제. 1부터 100까지 짝수의 합을 출력해주세요.
		sum = 0;
		for(int i = 1 ; i<=100; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		//반복을 처음부터 50번만 돌리도록 하면 보다 효율적인 코딩 가능. 
		sum = 0;
		for(int i =100; i >=0; i-=2) {
			sum += i;
		}
		System.out.println(sum);
		
		// 문제. 구구단을 출력해주세요. 
		// 예 :
		/*
		 * 2*1 =2
		 * 2*2 =4
		 * 2*3 =6
		 * ...
		 */
	
		
		for(int k=2; k<=9 ; k++) {
			for(int i=1; i<=9; i++) {
				System.out.println(k +"*"+ i + "=" + k*i);
			}
		}
		
		//문제. 구구단 전체를 가로로 출력해주세요
		/*
		 * \t : 탭기호
		 * 2*1=2    3*1=3   4*1 =4 ....
		 * 2*2=4    3*2=6   4*2 =8 ....
		 * 
		 */
		
		
		for(int i=1; i<=9; i++) {
			for(int k=2; k<=9 ; k++) {
				System.out.print(k +"*"+ i + "=" + k*i + "\t");
			}
			System.out.println();
		}
		
		/*
		 * while문
		 * - while(조건식){실행문}
		 * - 실행문을 조건식이 만족하는 동안 '계속' 반복하는 문장
		 * - 반복횟수가 정확하지 않을 때 사용함. 
		 */
		
		//a에 2씩 몇번을 곱해야 1000이상이 되는지 알고 싶다. 
		int a = 1;
		int count = 0;
		while(a <= 1000) {
			a*=2;
			count ++;
			System.out.println(count + " : " + a);
		}
		
		/*
		 * do-while문
		 * - do{실행문}while(조건식)
		 * - 최소 한 번의 실행이 보장된다. 
		 */
		
		
		a = 1000;
		count = 0;
		do {
			a*=2;
			count ++;
			System.out.println(count + " : " + a);
		}while(a <= 1000);
		
		//숫자맞추기 게임
//		Random rnd = new Random();
//		int qNum = rnd.nextInt(100); //0~99
//		int input=0;
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.print("0부터 99까지 정수 입력 >> ");
//			input = sc.nextInt();
//			if(input > qNum) {
//				System.out.println(input + "보다 작습니다.");
//			}else if(input < qNum) {
//				System.out.println(input + "보다 큽니다.");
//			}else {
//				System.out.println("정답입니다.");
//			}
//		}while(input != qNum);
		
		outer:
		for(int i =1 ; i <= 10 ; i++) {
			inner:
			for(int j =1 ; j <= 10; j++) {
				//j가 5일때 반복문을 모두 종료하시오.
				if(j ==5) {
				   break outer;
				}
				System.out.println(i + " : " + j);
				// break; : 가장 가까운 반복문 하나를 빠져나간다.
				// break 반복문 이름; : 이름에 맞는 반복문을 빠져나간다
				// continue; : 가장 가까운 반복문 하나의 반복 회차를 빠져나간다.  
				// continue 반복문 이름; : 이름에 맞는 현재 반복 회차를 빠져나간다.
			}
		}
		}
	}
