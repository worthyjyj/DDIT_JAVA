package g.api;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

	/*
	 * Wrapper 클래스 : 기본형타입을 객체로 사용해야 할 때 대신 사용하는 클래스
	 * - boolean : Boolean
	 * - char   : Character
	 * - byte  : Byte
	 * - short : Short
	 * - int  : Int
	 * - long = Long
	 * - float= Float
	 * - double = Double 
	 */
	
	
	public static void main(String[] args) {
//		boolean
//		int
//		double
//		
//		
		int a = 0;
		Integer iw = new Integer(a); //박싱 
		iw.toString();
		int b = iw; //언박싱 
		
		System.out.println(Integer.TYPE + " / " + Integer.SIZE + "bit");
		
		List<Integer> List = new ArrayList<Integer>();
		List<Object> List3 = new ArrayList<Object>();
//		List<int> List4 = new ArrayList<int>();
		//컬렉션 프레임 워크에는 객체만 담을 수 있다. 
		int[] list2 = new int [0]; 
	}
}
