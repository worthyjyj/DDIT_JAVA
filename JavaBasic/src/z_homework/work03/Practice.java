package z_homework.work03;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 숫자 3개를 입력받아 내림차순으로 출력해주세요 
		// 출력 예 : 40 > 24 > 7
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 3개 입력해주세여");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<b) {
			int temp = a; //a값을 킵해둠
			a = b; // b값을 a(1순위)에 담음
			b = temp; // b에 a값을 담음. 
		}if(a<c) { 
			int temp = a;
			a = c;  
			c = temp; 
			//a에 b,c값 중 큰 값을 넣음. 그 b,c에 작은 값을 넣어줌.
		}if(b<c) {
			int temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a + ">" + b + ">" + c);
	}
}
