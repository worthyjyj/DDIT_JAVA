package z_homework.work03;

import java.util.Scanner;

public class W04 {

	public static void main(String[] args) {
		//윤년인지 체크
		// 1. 4의 배수이고
		// 2. 100의 배수아님
		// 3. 400의 배수는 무조건 윤년 
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		int input = sc.nextInt();
		
//		String result = (input%4 == 0 && input%100 !=0) ? "윤년입니다." 
//			: (input%400 ==0) ? "윤년입니다." : "윤년이 아닙니다.";
		
//		boolean a = (input%400 ==0);
//		boolean b = (input%4 == 0 && input%100 !=0);
//		System.out.println(a || b ? input + "윤년" : input + "아님");
//		
//		String result = (input%4 == 0 && input%100 !=0 || input%400 == 0 ) ? "윤년입니다." : "윤년이 아닙니다.";
//		
//		
//		System.out.printf("%d년은 %s", input, result);
		
		//조건문 사용 
//		if(input%4==0 && input%100 != 0 || input%400 == 0) {
//			System.out.println(input+"년은 윤년입니다.");
//		}else {
//			System.out.println(input+"년은 윤년이 아닙니다.");
//		}
		
		//switch문 사용
//		String year = (input%4 == 0 && input%100 !=0 || input%400 ==0) ? "Y" :"N"; 
//		
//		switch(year) {
//		
//		case "Y" : 
//			System.out.println(input+"년은 윤년입니다");
//		
//		case "N" :
//			System.out.println(input +"년은 윤년이 아닙니다.");
//		}
		// 임시   
	}

}
