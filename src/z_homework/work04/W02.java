package z_homework.work04;

import java.util.Scanner;

public class W02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		
		do {
			System.out.print("월을 입력하세요(1~12): ");
			input = sc.nextInt();
			
			switch(input) {
			case 3: case 4: case 5:
				System.out.println(input+ "월은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println(input+ "월은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println(input+ "월은 가을입니다.");
				break;
			case 12: case 1: case 2 : 
				System.out.println(input+ "월은 겨울입니다.");
			break;
			default :
				System.out.println(input+ "월은 잘못된 입력입니다.");
			}
		}while(input >=1 && input <= 12);
				}
}
