package z_homework.work04;

import java.util.Scanner;

public class W03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int a = sc.nextInt();
		System.out.print("데이터베이스: ");
		int b = sc.nextInt();		
		System.out.print("화면 구현: ");
		int c = sc.nextInt();
		System.out.print("애플리케이션 구현: ");
		int d = sc.nextInt();
		System.out.print("머신러닝: ");
		int f = sc.nextInt();
		System.out.println("총점: " + (a+b+c+d+f));
		double avg = (double)(a+b+c+d+f)/5;
		System.out.printf("평균: %.2f" , avg);
		System.out.println();
		
		if(avg >= 90) {
			System.out.println("학점: \"A\"");
		}else if(avg >= 80 && avg < 90) {
			System.out.println("학점: B");
		}else if(avg >=70 && avg < 80) {
			System.out.println("학점: C");
		}else if(avg >=60 && avg < 70) {
			System.out.println("학점: D");
		}else {
			System.out.println("학점: F");
		}
}
}

