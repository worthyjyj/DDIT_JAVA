package z_homework.work03;

import java.util.Scanner;

public class W03 {

	//1. 수도이고, 인구가 100만 이상
//	  2. 연소득 1억이상 인구 50만 이상
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("수도입니까? (수도:1, 수도아님: 0)");
		int a = sc.nextInt();
		System.out.print("총 인구는? (단위: 만) ");
		int b = sc.nextInt();
		System.out.print("연소득이 1억 이상인 인구는? (단위: 만) ");
		int c = sc.nextInt();
		
		//boolean t = a ==1 && b >100;
		//boolean r = c > 50;
//		System.out.println(t || r? "메트로폴리스": "그냥도시");
		//보기 좋게 코딩하자! 
		
		
		String result = (a==1 && b>=100) ? "이 도시는 메트로폴리스입니다." 
				: (c>=50) ? "이 도시는 메트로폴리스입니다." : "메트로폴리스가 아닙니다.";
		System.out.println(result);

	}

}
