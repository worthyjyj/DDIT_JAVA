package middleTest;

import java.util.Arrays;

public class 재시험_이영진 {

	public static void main(String[] args) {
		// 문제 1
		// 학생들의 이름을 Student 변수에 넣고,
		// 학생들의 이름이 잘 들어갔는지 확인하기 위해
		// 출력해주세요.
		// 학생들_
		// 김소민 선새롬 오윤균 이보름
		// 이태영 이효미 정수영 박지은
		// 정준석 이영진

		String[] student = { "김소민", "선새롬", "오윤균", "이보름", "이태영", "이효미", "정수영", "박지은", "정준석", "이영진" };

		System.out.println(Arrays.toString(student));
		System.out.println();

		// 문제 2
		// 학생들의 입실 시간에 따라 완료, 지각을 표시해주세요.
		// 9시까지 입실하여야 하며, 9시 01분부터 지각입니다.
		// 시간이 9시 01분이면 9.01로 표시합니다.
		// 시간이 8시 57분이면 8.57로 표시합니다.
		// [입실 시간 현황]
		// 김소민 8:50 선새롬 8:55 오윤균 9:01 이보름 9:05
		// 이태영 9:06 이효미 9:14 정수영 8:45 박지은 8:47
		// 정준석 8:56 이영진 8:37
		//
		// 출력 예)
		// 김소민 선새롬 오윤균 이보름
		// 완료 완료 지각 지각
		// 이태영 이효미 정수영 박지은
		// 지각 지각 완료 완료
		// 정준석 이영진
		// 완료 완료

		double[] time = { 8.50, 8.55, 9.01, 9.05, 9.06, 9.14, 8.45, 8.47, 8.56, 8.37 };

//				for(int i=0; i < student.length ; i++) {
//					if(time[i] > 9.00) {
//						student[i] += " 지각";
//					}else { student[i] += " 완료";}
//					System.out.println((student[i]));
//				}

		String[] arr = new String[student.length];

		System.out.println();
		System.out.println("==========================================");
		for (int i = 0; i < student.length; i++) {
			if (time[i] > 9.00) {
				arr[i] = "지각";
			} else
				arr[i] = "완료";
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.print(student[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < 4; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println();
		for (int i = 4; i < 8; i++) {
			System.out.print(student[i] + "\t");
		}

		System.out.println();
		for (int i = 4; i < 8; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println();
		for (int i = 8; i < 10; i++) {
			System.out.print(student[i] + "\t");
		}

		System.out.println();
		for (int i = 8; i < 10; i++) {
			System.out.print(arr[i] + "\t");

		}

		System.out.println();
		for(int i = 0; i<4; i++) {
			// 첫줄을 그리는 조건을 선언하고
			// 그에 따른 행위를 취한다
			// i == 0 소민 새롬 윤균 보름
			// i == 0 1 2 3
			if(i == 0)
				System.out.println(student[0] + " " + student[1] + " " + student[2] + " " + student[3]);
			for(int j = 0; j < 4; j++) {
				System.out.print(time[j] + " ");
				if(j == 3) {
					System.out.println();
				}
			}
		}
		
		System.out.println("==================뀨==================");
		
		int cnt = 0;
		for (int i = 0; i < 3; i++) { // 3줄
			for (int j = cnt; j < 4+cnt; j++) {
				if(j == student.length)
					break;
				System.out.print(student[j] + " ");
			}
			System.out.println();
			for (int k = cnt; k < 4+cnt; k++) {
				if(k == student.length)
					break;
				System.out.print(arr[k] + " ");
			}
			cnt+=4;
			System.out.println();
		}

		// 제출 방법
		// 재시험_오늘날짜_이름.txt
		// wh-guswns123@hanmail.net 로 발송 고고
	}

}
