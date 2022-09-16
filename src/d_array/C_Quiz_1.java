package d_array;

import java.util.Arrays;
import java.util.Random;

public class C_Quiz_1 {

	public static void main(String[] args) {
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
		
		Random rnd = new Random();
		
		
		int[] pool = new int[100];
		for(int i = 0; i < pool.length ; i++) {
			pool[i] = rnd.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(pool));
	
	    int[] a = new int[100]; //원본배열의 모든 값이 들어갈 수 있는 크기의 배열을 선언함
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
	    
//		int[] aa = new int[] { result[0] }; //첫숫자는 배열에 넣어준다. 
//
//		for (int i = 0; i < result.length; i++) {
//			int pick = result[i];
//			boolean duple = false; 
//
//			for (int j = 0; j < aa.length; j++) {
//				if (pick == aa[j])
//					duple = true; 
//			}
//			if (!duple) {
//				int[] b = new int[aa.length + 1]; 
//
//				for (int j = 0; j < aa.length; j++) {
//					b[j] = aa[j];
//				}
//				// 중복이 아닌 숫자 pick을 배열 b 맨 마지막에 넣어줌
//				b[b.length - 1] = pick;
//				// 배열 a를 배열 b로 주소값을 변경함
//				aa = b;
//			}
//		}
//		System.out.println("결과 : " + Arrays.toString(aa));
//	    
//	   방법1. 배열의 크기를 1부터 점차 증가시키는 방법
	    a = new int[] {result[0]};
	    
	    for(int i =0; i < result.length ; i++) {
	    	int t = 0; //0이면 중복아님, 1이면 중복
	    	int pick = result[i];
	    	
	    	for(int j = 0; j < a.length ; j++) {
	    		if (a[j] == pick) t = 1;	
	    	}
	    	if(t ==0) {
	    		int[] b = new int [a.length +1]; 
	    		for(int j = 0; j < a.length ; j++) {
	    			b[j] = a[j];
	    		}
	    		b[b.length-1] = pick;
	    		a = b;
	    	}
	    }
	    System.out.println("결과 : " + Arrays.toString(a));
	    
	    //방법2. 이해 안감!! 
	    //길이가 큰 배열을 만들어 두고 나중에 뒤를 정리하는 방법 
	    a = new int [result.length]; //{0,0,0,0,0....}
	    c = 0; // count : a에 몇개의 값이 들어갔는지 체크함 
	    for(int i = 0 ; i < result.length ; i++) {
	    	int pick = result[i];
	    	int t = 0; //중복검사 스위치 
	    	
	    	for(int j = 0 ; j < c ; j++) {
	    		if(a[j] == pick) t=1;
	    	}
	    	if(t == 0) { //중복되지 않을 때 
	    		a[c] = pick;
	    		c += 1;
	    	}
	    }
	    
	    int[] b = new int[c];
	    for(int i = 0; i < c ; i++) {
	    	b[i] = a[i];
	    }
	    a=b;
	    System.out.println(Arrays.toString(a));
	    
	    
	    
	    
	    
	    
	    //옵션 2 : 중복제거된 result를 오름차순 정렬하세요. 
	    
		
//		for(int i = 0 ; i < aa.length ; i++) {
//			for(int j = 0 ; j < aa.length ; j++) {
//				if(aa[i] < aa[j]) {
//					int temp = aa[i];
//					aa[i] = aa[j];
//					aa[j] = temp; 
//					System.out.println( Arrays.toString(aa));
//			}
//			}
//		}
//		System.out.println("결과 : " + Arrays.toString(aa));
	}

}
