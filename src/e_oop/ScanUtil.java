package e_oop;

import java.util.Scanner;

//nextLine과 Integer.parseInt(nextLine)을 쉽게 사용하는 메서드 제작 
public class ScanUtil {
	private static Scanner sc = new Scanner(System.in); //스캔유틸에서만 쓸 수 있게끔???
	
	public static String nextLine() {
		return sc.nextLine(); 
	}
	
	public static int nextInt() {
		return Integer.parseInt(sc.nextLine());
	}
	
	public static double nextDouble() {
		return Double.parseDouble(sc.nextLine());
	}
}
