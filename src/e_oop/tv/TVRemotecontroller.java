package e_oop.tv;

import java.util.Scanner;

public class TVRemotecontroller {

	public static void main(String[] args) {
		/*
		 * 채널 및 볼륨과 관련된 동작들을 메서드로 만들어 주세요
		 * 
		 * 리모콘 모양(메뉴)
		 * ----------------------------------------------------
		 * 1.전원 2.채널변경 3. 채널업 4.채널다운
		 * 5.볼륨업 6. 볼륨다운 7.현재정보 0.종료 <- 프로그램종료 
		 * -----------------------------------------------------
		 */
		int input;
		Scanner sc = new Scanner(System.in);
		do {
		TV mytv = new TV();
			mytv.menu();
		
		if(mytv.poweroff() == false) {
			System.out.println("TV를 끕니다.");
			break;
		}
		}while(true);
	}
}
