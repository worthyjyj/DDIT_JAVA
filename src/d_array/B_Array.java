package d_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B_Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다. 
		 * - 길이를 변경할 수 없다.
		 **/
		
		//기존 int형 변수 6개 선언 방법
		int num1, num2, num3, num4, num5, num6;

		//배열
		int [] intArray; //배열의 주소를 저장할 공간이 만들어진다. 
		intArray = new int[5]; //배열이 선언되고 그 주소가 저장된다. 
		System.out.println(intArray[0]);
		// 배열의 순서는 0부터 시작이다. 
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
//		System.out.println(intArray[5]);
		/*
		 * 타입별 기본값
		 * char : '\u0000'
		 * byte, short, int : 0
		 * long : 0L
		 * float : 0F
		 * double : 0.0
		 * boolean : false (0)
		 * 참조형변수(예 : String) : null (""공백 X)
		 **/
		
		intArray = new int[] {1,2,3,4,5};
		System.out.println(intArray[0]);
		intArray[0] = 10;
		System.out.println(intArray[0]);
		
		int[] array = {1,2,3,4,5};
		//int[] array= new int[] {1,2,3,4,5};
		
		int[] arr1;
		arr1 =  new int[] {1,2,3,4,5};
		//int a;
		//a= 10;
		arr1 = new int[5]; // => {0,0,0,0,0}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		// 이전방법
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i4 = 40;
		int i5 = 50;
		//합계를 구하라
		int sum = i1 + i2+ i3 + i4 +i5;
		double avg = sum / 5.0;
		
		//배열로
		int[] score = new int[] {10,20,30,40,50};
		sum = 0;
		for(int i = 0; i < score.length ; i++) {
		 sum += score[i];	
		}
		avg = (double) sum / score.length;
		
//		boolean[] bAarry = {true, false, 1>2};
		
		int [] arr2 = new int[5];
//		arr2....
		//arr2 => 6
//		arr2.length = 6; //길이를 변경할 수 없다. 
		arr2 = new int[6];
		
		// 문제1. 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화해주세요. 
		int[] arr3 = new int[10];
//		arr3 [0] = 1;
//		arr3 [1] = 2;
//		arr3 [2] = 3;
//		arr3 [3] = 4;
//		arr3 [4] = 5;
//		arr3 [5] = 6;
//		arr3 [6] = 7;
//		arr3 [7] = 8;
//		arr3 [8] = 9;
//		arr3 [9] = 10;
	
		//문제2. 위에서 만든 배열의 모든 인덱스에
//		1~100 사이의 랜덤한 값을 저장해주세요
		// 1~100 => 0~99+1

		Random rnd = new Random();
		
		for(int i = 0; i < arr3.length ; i++) {
			arr3 [i] = rnd.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(arr3));
		
	   //문제 3. 배열에 저장된 모든 값의 합계와 평균을 구해주세요. 
		int sum1=0;
		for(int i = 0 ; i < arr3.length ; i++) {
				sum1 += arr3[i];
		}
		
		double avg1 = (double) sum1 / arr3.length; 
		
		System.out.println("합계 : " + sum1);
		System.out.printf("평균 : %.2f" , avg1);
		
		//문제4. 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요. 
		int max = arr3[0];
		int min = arr3[0];
		
		for(int i= 0 ; i < arr3.length ; i++) {
			if(arr3[i] > max) {
				max = arr3[i];
			}
			if(arr3[i] < min) {
				min = arr3[i];
			}
			System.out.printf(i + "번째 : max : %d, min : %d\n", max, min);
		}
		System.out.printf("++최종 : max : %d, min : %d\n" , max, min);
		
		// 배열의 값을 섞는 방법
		String [] names = {"홍길동", "이순신", "유관순", "김유신","아이유"};
		System.out.println(Arrays.toString(names));
		for(int i = 0; i < 5; i++) {
			int rndIndex = rnd.nextInt(names.length); //0~4
			String temp = names[rndIndex];
			names[rndIndex] = names[0];
			names[0] = temp;
			System.out.println(Arrays.toString(names));
		}
		
		//1~6 사이의 랜덤값을 500번 생성하고, 
		//각 숫자가 생성된 횟수를 출력해주세요. 
		
		int[] dice = new int[6];
		// dice = {0,0,0,0,0,0}
		for(int i = 0; i < 500 ; i++) {
//			int r = rnd.nextInt(6)+1; 
//			if(r == 1) {
//				dice[0] ++;
//			}
//			if(r == 2) {
//				dice[1] ++;
//			}
//			if(r == 3) {
//				dice[2] ++;
//			}
//			if(r == 4) {
//				dice[3] ++;
//			}
//			if(r == 5) {
//				dice[4] ++;
//			}
//			if(r == 6) {
//				dice[5] ++;
//			}
			int r = rnd.nextInt(dice.length)+1;
			dice[r-1] ++;
			// r =1;
			//dice[1-1] ++; => dice[0] +=;
			// r=3;
			//dice[3-1] ++; => dice[2] ++;
		}
		System.out.println(Arrays.toString(dice));
		System.out.printf("1이 나온 횟수 : %d\n"
							+ "2이 나온 횟수 : %d\n"
							+ "3이 나온 횟수 : %d\n"
							+ "4이 나온 횟수 : %d\n"
							+ "5이 나온 횟수 : %d\n"
							+ "6이 나온 횟수 : %d\n"
							, dice[0], dice[1], dice[2], dice[3], dice[4], dice[5]);
		
		for(int i = 0; i < dice.length ; i++) {
			System.out.printf((i+1) + "이(가) 나온 횟수 : %d\n" , dice[i]);
		}
		System.out.println("--------------------");
		
		//문제5. 21~50 사이의 랜덤 값을 650번 생성하고, 
		// 각 숫자가 생성된 횟수를 출력해주세요. 
		
		int[] A = new int[30];
		
		for(int i = 0; i < 650 ; i++) {
			int r = rnd.nextInt(A.length)+21; //21~50
			A[r-21] ++;
		}
		System.out.println(Arrays.toString(A));
		
		
		for(int i = 0; i < A.length ; i++) {
			System.out.printf((i+21) + "이(가) 나온 횟수 : %d\n" , A[i]);
		}
		
		//문제 6. 위 형태의 문제에서
		//최솟값, 최댓값, 반복 횟수를 입력받아 (21, 50, 650)
		// 각 숫자가 생성된 횟수를 출력해주세요. 
		// (옵션1: 최솟값보다 작은 최댓값을 입력하면 다시 입력받아보기)
		// (옵션2: 반복횟수가 음수면 다시 입력받아보기)
		
		Scanner sc = new Scanner(System.in);
		int minimum=0;
		int maximum=0;
		int repeat=0;
		String $ = "";
		
		do {
			
		System.out.print("최솟값 입력 해주세유 >> ");
		minimum = sc.nextInt();
		System.out.print("최댓값 입력 해주세유 >> ");
		maximum = sc.nextInt();
		System.out.print("반복횟수 입력 해주세유 >> ");
		repeat = sc.nextInt();
		
		if(minimum > maximum) {
			System.out.println("다시 입력해주세요!");
			$ = "오타";
		}else if(repeat < 0) {
			System.out.println("다시 입력해주세요!");
			$ = "오타";
		}else
			$ = "";
		}while($.equals("오타"));
			
		System.out.printf("최솟값: %d, 최댓값: %d, 반복횟수: %d\n", minimum, maximum, repeat);
		
		int[] n_array = new int[maximum-minimum+1];
		
		for(int i = 0 ; i < repeat ; i++) {
			int rrr = rnd.nextInt(maximum-minimum+1)+minimum; //랜덤으로 숫자 출력(최솟값~최대값) 5~10
			n_array[rrr-minimum]++; //4~9
		}
		
		for(int i = 0 ; i < n_array.length ; i++) {
		System.out.printf((minimum+i) + "이(가) 나온 횟수 : %d\n" , n_array[i]);
	}
	}
}