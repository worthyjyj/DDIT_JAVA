package c_statement;

import java.util.Random;
import java.util.Scanner;

public class Z_Baseball {
/*
 * 세 자리 랜덤한 숫자를 맞추는 게임을 만들어보자. 
 * 세 자리 숫자는 다음과 같은 규칙을 갖는다. 
 * 1. 중복되는 숫자가 없음 (예: 133 x, 333 X, ...)
 * 2. 0이 없다. (예: 130 X, 907 X, 012 X, ...)
 * 
 *  랜덤으로 만들어진 숫자를 저장해두고 
 *  사용자에게 세 자리 숫자를 입력받아 다음과 같이 표기한다. 
 *  1. 같은 숫자이면서 위치가 같을 경우 S
 *  2. 같은 숫자는 존재하지만 위치가 다를 경우 B
 *  3. 같은 숫자가 없는 경우 0
 *  
 *  맞는 숫자를 입력할 때가지 계속한다. 
 *  
 *  출력 예시 :
 *  ...
 *  세 자리 숫자 입력 >> 571
 *  6차 시도(571) : 25 0B 10
 *  -------------------------
 *  세 자리 숫자 입력 >> 671
 *  7차 시도(671) : 35 0B 0O
 *  -------------------------
 *  정답입니다!!
 *  
 */
	public static void main(String[] args) {
	Random rnd = new Random();
	Scanner sc = new Scanner (System.in);
	
	
//	int answer = rnd.nextInt(899)+101; //101~999
//	int first  = answer/100; //첫번째 자리 숫자 추출
//	int second = first*10
//	int third = 
//	
//	if( )
//	int T =  answer;  
//	
//	do {
//		int count = 1;
//	System.out.print("세 자리 숫자 입력 >>");
//	int a = sc.nextInt();
//	
//	System.out.printf("%d차 시도(%s)", count, a
//			+ ": ??????");
//	count++;
//	}while()
	
	int num1, num2, num3;
	num1 = rnd.nextInt(9)+1; //1~9
	
	do {
	num2= rnd.nextInt(9)+1;

	}while(num1 == num2);
	do {
		num3= rnd.nextInt(9)+1;
	}while(num1 == num3 || num2 == num3);
	
	int answer =  num1 + num2 + num3;
	
	System.out.println("정답 : " + num1 + num2 + num3);
	
	int count = 0;
	
	while(true) {
		count++;
		System.out.print("규칙에 맞는 숫자 입력 >> ");
		int input = sc.nextInt();
		int s=0, b=0, o=0;
		int i1 = input /100; //첫번째 자리수
		input %= 100; 
		int i2 = input /10;
		input %=10;
		int i3 = input;
		
		if(num1 == i1) s++;
		if(num2 == i2) s++;
		if(num3 == i3) s++;
		
		if(i1 == num2 || i1 ==num3) b++;
		if(i2 == num1 || i2 ==num3) b++;
		if(i3 == num1 || i3 ==num2) b++;
		 
		if(i1 != num1 || i1 != num2 || i1 != num3) o++;
		if(i2 != num1 || i2 != num2 || i2 != num3) o++;
		if(i3 != num1 || i3 != num2 || i3 != num3) o++;
				
		System.out.printf("%d차 시도(%d%d%d) : %dS %dB %dO\n"
				,count, i1, i2, i3, s , b, o);
		System.out.println("------------------------------");
		
		if(s == 3) {
			System.out.println("정답입니다.");
			break;
		}
	
		
		
	}
	
	//방법1
	
	//방법2
//	int i3 = input%10;
//	input /= 10;
//	int i2 = input %10;
//	input /= 10;
//	int i1= input;
	

	}
}
