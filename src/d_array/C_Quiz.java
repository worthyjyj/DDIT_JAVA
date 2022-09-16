package d_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C_Quiz {

	public static void main(String[] args) {
		/*
		 * 문제 1 거스름돈 (1000~5000원)이 동전의 단위마다 몇 개의 동전이 필요한지 출력해주세요 (동전의 종류를 배열로 관리)
		 * {500,100,50,10}
		 * 
		 * 예시) 거스름돈 : 2860원 500원 : 5개 100원 : 3개 50원 : 1개 10원 : 1개
		 */

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("거스름돈 >> ");
//		int input = sc.nextInt();
//		
//		int[] a = {500,100,50,10};
//	
//		int x = input/a[0]; //500
//		int x1 = input%a[0];
//		int y = x1/a[1];  //100
//		int y1 = x1%a[1];
//		int z = y1/a[2]; //50
//		int z1 = y1%a[2];
//		int q = z1/a[3]; //10
//		
//		System.out.printf("500원 : %d, 100원 : %d, 50원: %d, 10원: %d", x, y, z, q);
//		

		Random rnd = new Random();
//		
//		int change = (rnd.nextInt(401)+100)*10;
//		System.out.println("잔돈 : " + change);
//		int[] coin = {500,100,50,10};
//		
//		//방법1
//		int change_copy = change;
//		int[] count = {0,0,0,0};
//		count[0] = change_copy / coin[0];
//		System.out.println(coin[0] +"원"+ count[0] + "개");
//		change_copy %= coin[0];
//		count[1] = change_copy / coin[1];
//		System.out.println(coin[1] +"원"+ count[1] + "개");
//		change_copy %= coin[1];
//		count[2] = change_copy / coin[2];
//		System.out.println(coin[2] +"원"+ count[2] + "개");
//		change_copy %= coin[2];
//		count[3] = change_copy / coin[3];
//		System.out.println(coin[3] +"원"+ count[3] + "개");
//		
//		//방법2
//		
//		count = new int[] {0,0,0,0};
//		
//		for(int i=0; i < coin.length ; i++) {
//			count[i] = change_copy / coin[i];
//			System.out.println(coin[i] +"원"+ count[i] + "개");
//			change_copy %= coin[i];
//		}

		System.out.println("-------------------------");
		/*
		 * 문제 2 1~5의 숫자가 발생(20번)된 만큼 *을 사용해 그래프를 그려주세요
		 * 
		 * 예시) 1: *** 3 2: **** 4 3: ** 2 4: ***** 5 5: * 1
		 */

		// 내 풀이 //다시 돌려보기!!!

		int[] aaa = { 1, 2, 3, 4, 5 };
		int input = rnd.nextInt(20) + 1;

		for (int i = 0; i < aaa.length; i++) {
			System.out.println();
			System.out.print(aaa[i] + ":");
			for (int j = 0; j < input; j++) {
				System.out.print("*");

			}
			System.out.println(" " + input);
			input = rnd.nextInt(20) + 1;
		}

		// 선생님 풀이
//		int[] arr = new int[5];
//		for (int i = 0; i < 10; i++) {
//			int r = rnd.nextInt(5) + 1;
//			arr[r - 1]++;
//			System.out.println(r + ":" + Arrays.toString(arr));
//		}
//		System.out.println(Arrays.toString(arr));
//
//		for (int j = 0; j < arr.length; j++) {
//			System.out.print((j + 1) + ":");
//			for (int i = 0; i < arr[j]; i++) {
//				System.out.println("*");
//			}
//			System.out.println(" " + arr[j]);
//		}

		/*
		 * 문제3 1~10사이의 랜덤한 겂이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요. {5,8,8,4,7,3,1,1,2,5}
		 * => 중복된 값 제거
		 */
//
//		arr = new int[10];
//		input = rnd.nextInt(10) + 1;
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = input;
//			for (int j = 0; j < arr.length; j++) {
//				if (i != j) {
//					if (arr[i] == arr[j]) {
//						//중복제거 
//					}
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));

		//??? 이해 안감 (중복검사) 
		
		int[] pool = new int[10];
		for (int i = 0; i < pool.length; i++) {
			pool[i] = rnd.nextInt(10) + 1;
		}
		System.out.println(Arrays.toString(pool));

		int[] a = new int[] { pool[0] }; //첫숫자는 배열에 넣어준다. 

		for (int i = 0; i < pool.length; i++) {
			int pick = pool[i]; // pool에서 숫자 하나를 꺼냄
			boolean duple = false; // 중복검사 결과를 위해 만듦.

			// 배열 a의 pick숫자가 이미 있는지 확인
			for (int j = 0; j < a.length; j++) {
				if (pick == a[j])
					duple = true; // 있으면 duple = true
			}
			if (!duple) { // if(duple == false) //중복이 안됏을 때!! 
				int[] b = new int[a.length + 1]; // 임시배열 b 만듦.

				// 배열 a에 있는 값을 배열 b에 복사
				for (int j = 0; j < a.length; j++) {
					b[j] = a[j];
				}
				// 중복이 아닌 숫자 pick을 배열 b 맨 마지막에 넣어줌
				b[b.length - 1] = pick;
				// 배열 a를 배열 b로 주소값을 변경함
				a = b;
			}
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("-------------");
		System.out.println("-------------");
		
		/*
		 * 문제4
		 * 1~100 까지의 랜덤한 숫자 100개를 갖는 배열을 만들고
		 * 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만
		 * 이루어진 배열을 출력해주세요. 
		 * 옵션1: 중복제거 
		 * 옵션2: 오름차순 정렬
		 * 
		 * {1,57,84,38,15,10,57,68,48,13,...}
		 * target = 5
		 * {5,10,20,80}
		 * 
		 */
		
//		a = new int [100];
//		int c = rnd.nextInt(4)+2;
//		int[] b = new int [100]; 
//		int count = 0;
//		
//		for(int i = 0 ; i < a.length; i++) {
//			a[i] = rnd.nextInt(100)+1;
//		}
//		System.out.println(Arrays.toString(a));
//		
//		for(int i = 0 ; i< a.length ; i++) {
//				if(a[i]%c == 0) {
//					b[count] = a[i];
//					count++;
//		
//		}
//		}
//		System.out.println(Arrays.toString(b));
		
		System.out.println("--------------");
		
		
		pool = new int[100];
		for(int i = 0; i < pool.length ; i++) {
			pool[i] = rnd.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(pool));
	
	    a = new int[100]; //원본배열의 모든 값이 들어갈 수 있는 크기의 배열을 선언함
	    int target = rnd.nextInt(4)+2; //타겟 숫자 지정 
	    System.out.println("target : "+ target);
	    //값이 들어가야할 배열의 인덱스 번호 
	    int c = 0; 
	    //pool의 모든 값을 반복문 실행함 
	    for(int i = 0 ; i < pool.length ; i++) {
	    	// pool의 이번 값(pool[i])의 타겟의 배수라면 
	    	if(pool[i]%target == 0) {
	    		// 배열 a의 c위치에 값을 넣고 c를 1증가 시킴
	    		a[c++] = pool[i]; 
	    		System.out.println(Arrays.toString(a));
	    	}
	    }
	    
	    //결과를 보여줄 배열 result를 만듦. 
	    //길이는 c로 지정 => 배열 a에 값이 몇개 들어있는지 나타냄
	    int[] result = new int[c];
	    // 배열 a를 배열 result에 복사함 
	    // => c만큼만 반복해서 실제로 값이 들어있는 곳만 복사함 
	    for(int i = 0;i < result.length ; i++) {
	    	result[i] = a[i];
	    }
	    System.out.println(Arrays.toString(result));
	    
	    //옵션 1 : 배열 result를 중복제거하세요. 
	    
		int[] aa = new int[] { result[0] }; //첫숫자는 배열에 넣어준다. 

		for (int i = 0; i < result.length; i++) {
			int pick = result[i];
			boolean duple = false; 

			for (int j = 0; j < aa.length; j++) {
				if (pick == a[j])
					duple = true; 
			}
			if (!duple) {
				int[] b = new int[aa.length + 1]; 

				for (int j = 0; j < aa.length; j++) {
					b[j] = aa[j];
				}
				// 중복이 아닌 숫자 pick을 배열 b 맨 마지막에 넣어줌
				b[b.length - 1] = pick;
				// 배열 a를 배열 b로 주소값을 변경함
				aa = b;
			}
		}
		System.out.println(Arrays.toString(aa));
	    
	    
	   
	    
	    //옵션 2 : 중복제거된 result를 오름차순 정렬하세요. 
	    
	}
}
