package z_homework.work05;

public class W01 {

	public static void main(String[] args) {
		// 다음 배열에서 최댓값과 최솟값을 구하시오.
//		{38, 94, 16, 3, 76, 94, 82, 47, 59, 8}

		int[] a = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };

		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.printf("최댓값: %d, 최솟값: %d", max, min);
	}
}
