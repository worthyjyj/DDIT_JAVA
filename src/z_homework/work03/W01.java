package z_homework.work03;

import java.util.Scanner;

public class W01 {

	public static void main(String[] args) {
		//입력된 정수가 홀수인지 작수인지를 출력하는 프로그램을 
		//삼항 연산자를 사용해서 작성해보자
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >> ");
		int input = Integer.parseInt(sc.nextLine());
		
		String result =  (input %2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
	}
}
