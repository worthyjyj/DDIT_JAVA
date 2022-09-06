package z_homework.work04;

import java.util.Random;
import java.util.Scanner;

public class W07 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int answer = rd.nextInt(100)+1;
		int input;
		
		do {
		System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
		input = sc.nextInt();
		
		if(input < answer) {
			System.out.println("정답은 더 큰 수입니다.");
		}else if(input > answer) {
			System.out.println("정답은 더 작은 수입니다.");
		}else {
			System.out.println("정답입니다!!");
		}	
	}while(input != answer);
System.out.println("게임을 종료합니다.");
} 
}
