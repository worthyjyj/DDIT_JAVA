package z_homework.work03;

import java.util.Scanner;

public class W02 {

	public static void main(String[] args) {
		//두 정수를 입력받아 큰 수를 작은수로 나눈 몫과 나머지를 출력하는 
		//프로그램을 만들어보자
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		System.out.print("두 번째 숫자를 입력하세요: ");
		int input1 = sc.nextInt();
		// 줄 복사: ctrl+ alt + ↑(or ↓)
		// 줄 이동: alt + ↑(or ↓)
		int input2 = sc.nextInt();
		int result1 = (input1 > input2) ? input1/input2 : input2/input1;
		int result2 = (input1 > input2) ? input1%input2 : input2%input1;
		
		// int big= x>y ? x : y;
		// int small = big == x? y:x; 
		// 이렇게 큰수 , 작은 수 추출해서 한번에 계산할 수도 있음. 
		
		System.out.printf("큰 수를 작은 수로 나눈 몫은 %d이고, 나머지는 %d이다.", result1, result2);

	}

}
