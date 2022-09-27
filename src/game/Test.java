package game;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		//LEVEL1
		System.out.print("2초안에 '가나다라' 입력 ㄱㄱ >> ");
		long beforeTime = System.currentTimeMillis(); //코드 실행전 시간 받기
		String input = sc.nextLine();
		long afterTime = System.currentTimeMillis(); //코드 실행 후 시간 받아오기 
		long secDiffTime = (afterTime - beforeTime)/1000; //입력시간 
		
		
		if(secDiffTime < 3) {
			if(input.equals("가나다라")) {
				System.out.println("통과");
			}else{
				System.out.println("오타");
			}
		}else {
			System.out.println("시간초과");
		}
		
	}

}
