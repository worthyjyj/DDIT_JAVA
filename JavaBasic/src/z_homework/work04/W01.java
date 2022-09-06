package z_homework.work04;

import java.util.Scanner;

public class W01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int b = sc.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int c = sc.nextInt(); 
		
		if(a>(b+c)) {
			System.out.println("삼각형을 만들 수 없습니다.");
		}else if(b>(a+c)) {
			System.out.println("삼각형을 만들 수 없습니다.");
		}else if(c>(a+b)) {
			System.out.println("삼각형을 만들 수 없습니다.");
		}else
		System.out.println("삼각형을 만들 수 있습니다!!");
	}

}
