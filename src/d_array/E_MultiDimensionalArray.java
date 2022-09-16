package d_array;

import java.util.Arrays;
import java.util.Random;

public class E_MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다중차원배열 (다차원 배열)
		 * - 배열 안에 배열이 저장되어잇는 형태
		 */
		// 1차원 배열
		int[] array1 = new int[10]; 
		//{0,0,0,0,0}
		// 2차원 배열
		int[][] array2= {new int[10], new int[10], new int[10]};
		//{{0,0,0,0},{0,0,0,0},{0,0,0,0}} 
	
		int[][][] array3 = {{new int[10], new int[10], new int[10],new int[10],new int[10],new int[10]}};
		
	
	    int[][] arr = new int[2][3]; 
	    arr = new int[][] {{1,2},{3,4}};
	    int arr2[][] = new int [2][3];
	    
	    int[][] arr3 = new int[3][]; //가변배열 
	    // {null, null, null}
	    arr3[0] = new int[1];
	    // {{0}}, null, null}
	    arr3[1] = new int[2];
	    // {{0}}, {0,0}, null}
	    arr3[2] = new int[3];
	    // {{0}}, {0,0}, {0,0,0}}

	    //2차원 인덱스가지 접근해서 사용할 수 있다 
	    System.out.println(arr3[1][1]);
	    System.out.println(Arrays.toString(arr3[1]));
	    
	    arr3[1][1]=10;
	    System.out.println(Arrays.toString(arr3[1]));
	    
	    System.out.println(arr3.length);
	    //2차원 배열에서 첫 번째 차원의 배열 길이
	    System.out.println(arr3[1].length);
	  //2차원 배열에서 두 번째 차원의 배열 길이
	    
	    System.out.println("-------------");
	    for(int i = 0; i < arr3.length; i++) {
	    	for(int j = 0 ; j < arr3[i].length ; j++) {
	    		System.out.println(arr3[i][j]);
	    	}
	    }
	    System.out.println("-------------");
	    System.out.println("-------------");
	    
	    int[][] score = new int[4][3]; // int[학생수][과목수]
//	    {{0,0,0},{0,0,0},{0,0,0},{0,0,0}}
	    int[] sum = new int[score.length]; //4
	    double[] avg = new double[score.length];
	    
	    for(int i = 0 ; i < score.length ; i++) {
	    	for(int j = 0 ; j < score[i].length; j++) {
	    		score[i][j] = new Random().nextInt(101);
	    	}
	    	System.out.println(Arrays.toString(score[i]));
	    }
	    
	    //문제
	    //각 학생의 점수 합계와 평균을 구하세요 
	    
	    for(int i = 0; i < score.length ; i++) {
	    	for(int j = 0; j < score[i].length ; j++) {
	    	    sum[i] += score[i][j];
	    	    avg[i] = (double)sum[i]/score[i].length;
	    	}
	    }
	    	System.out.println("합계 : " + Arrays.toString(sum));
	    	System.out.println("평균 : " + Arrays.toString(avg));
	    	
	    
	    /*
	     * 이름  |  자바  | 오라클 |  javscript |    jsp  |  python |   spring  | 합계 | 평균 |석차
	     * 이순신   80       80          80          80       80         80        480     80     1
	     * 홍길동   80       80          80          80       80         80        480     80     1
	     * 유관순   80       80          80          80       80         80        480     80     1
	     * 사임당   80       80          80          80       80         80        480     80     1
	     * 아이유   80       80          80          80       80         80        480     80     1
	     * 평균     80       80          80          80       80         80
	     */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
