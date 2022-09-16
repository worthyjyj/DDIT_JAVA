package d_array;

import java.util.Arrays;
import java.util.Random;

public class F_ScoreBook {

	public static void main(String[] args) {
		/*
		 * 김범수, 나얼, 박효신, 이수, 신용재, 하현우 총 여섯명의 국어/수학/영어/과학/코딩 점수를 각 0~100까지의 랜덤 값으로 입력하고,
		 * 학생별 평균을 구하세요.
		 * 
		 * ======================== 원점수 ============================ 학생명 국어 수학 영어 과학 코딩
		 * 김범수 87 68 20 87 87 나얼 87 51 56 15 87 박효신 87 68 87 89 77 이수 87 68 56 47 87 신용재
		 * 57 68 86 87 67 하현우 87 18 56 87 87
		 * ===========================================================
		 * ======================== 평균점수 ============================ 학생명 국어 수학 영어 과학 코딩
		 * 평균 김범수 87 68 20 87 87 00 나얼 87 51 56 15 87 00 박효신 87 68 87 89 77 00 이수 87 68
		 * 56 47 87 00 신용재 57 68 86 87 67 00 하현우 87 18 56 87 87 00
		 * ===========================================================
		 */

		String[] names = { "김범수", "나얼", "박효신", "이수", "신용재", "하현우" };
		String[] subjs = { "국어", "수학", "영어", "과학", "코딩" };
		int[][] scores = new int[names.length][subjs.length];
		double[] avg = new double[names.length];

		// for(int i = 0; i < scores.length ; i++) {
		for (int i = 0; i < names.length; i++) {
//			for(int j =0 ; j < scores[i].length ; j++) {????
			for (int j = 0; j < subjs.length; j++) {
				scores[i][j] = new Random().nextInt(101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
//		  ======================== 원점수 ============================
//	                 학생명  국어  수학  영어  과학  코딩  
//	                 김범수  87     68    20    87    87
//	                 나얼    87     51    56    15    87
//	                 박효신  87     68    87    89    77
//	                 이수    87     68    56    47    87
//	                 신용재  57     68    86    87    67
//	                 하현우	 87     18    56    87    87
//	          ===========================================================     

		System.out.println("====================원점수===================");
		System.out.print("학생명\t");
//		for (int i = 0; i < subjs.length; i++) {
//			System.out.print(subjs[i] + "\t");
//		}
		//향상된 for문 : 해당 배열의 인덱스 값을 하나씩 추출 
		int idx = 0;
		for(String subj : subjs) {
			System.out.print(idx +"."+ subj + "\t");
			idx++;
		}
		System.out.println(); // 김범수가 위로 올라가버려서
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < subjs.length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=======================================");
		System.out.println("\n\n\n");
		System.out.println("=================평균점수===========================");

		System.out.print("학생명\t");
		for (int i = 0; i < subjs.length; i++) {
			System.out.print(subjs[i] + "\t");
		}
		System.out.println("평균");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
			double sum = 0;
			for (int j = 0; j < subjs.length; j++) {
				sum += scores[i][j];
				System.out.print(scores[i][j] + "\t");
			}
			System.out.printf("%.2f", sum / subjs.length);
			System.out.println();
		}
		System.out.println("============================================");
	}
}
