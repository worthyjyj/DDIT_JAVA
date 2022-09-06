package b_operator;

import java.util.Scanner;

public class D_Etc {

	public static void main(String[] args) {
		/*
		 * http: // tcpshcool.com/java/java_operator_bitwise
		 * 비트연산자
		 * - |, &, ^, ~, <<,>>
		 * - 비트단위로 연산한다.
		 * 
		 * 기타 연산자
		 * - .(참조연산자): 특정 범위 내에 속해있는 멤버를 지칭할 때 사용한다.
		 * -(type)       : 형변환
		 * - ? : (삼항연산자) : 조건식  ? (조건식이 참일 경우 수행할 문장)
		 *                              : (조건식이 거짓일 경우 수행할 문장)
		 **/
		
		int x= 10;
		int y= 20;
		int result = (x>y) ? x : y;
		System.out.println(result);
		
		// 주민등록번호 뒷 자리의 첫 번재 숫자가 1이면 남자 2이면 여자 
		int regNo = 1;
		String gender = (regNo==1) ? "남자" : "여자";
		System.out.println(gender);

		regNo = 8;
		gender = (regNo == 1) ? "남자" 
				: ((regNo == 2) ? "여자" : "확인불가");
		
		//한 자리 숫자 하나를 입력받고, 그 숫자가 1이나 3이면 남자를 
		// 2나 4면 여자를 출력해주세요
		// 그 외의 숫자를 입력하면 확인불가를 출력해주세요. 
		
		Scanner sc = new Scanner(System.in);
		//한번에 임포트 단축키 : ctrl + shift + o (영문자)
		System.out.println("숫자입력 >> ");
		int input = Integer.parseInt(sc.nextLine());
		gender = (input ==1 || input ==3) ? "남자"
				: ((input ==2 || input ==4) ? "여자" : "확인불가");
		System.out.println(gender);
		
	}
}
