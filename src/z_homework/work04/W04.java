package z_homework.work04;

import java.util.Scanner;

public class W04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String a = sc.nextLine();
		System.out.print("영희: ");
		String b = sc.nextLine();
		
		if (a.equals("가위") && b.equals("보")) {
			System.out.println("철수 승리!");
		}else if (a.equals("바위") && b.equals("가위")) {
			System.out.println("철수 승리!");
		}else if(a.equals("보") && b.equals("바위")) {
			System.out.println("철수 승리!");
			
		}else if(b.equals("가위") && a.equals("보")) {
			System.out.println("영희 승리!");

		}else if (b.equals("바위") && a.equals("가위")) {
			System.out.println("영희 승리!");
			
		}else if(b.equals("보") && a.equals("바위")) {
			System.out.println("영희 승리!");
	   
		}else if(a.equals(b)) {
		System.out.println("비겼습니다!!");
	}else {
		System.out.println("졌습니다.");
	}
		
		
		//switch문 써보기!! 
}
}
