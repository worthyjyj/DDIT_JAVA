package g.api;

import java.util.Arrays;

public class StringClass {
	
	/*
	 * String 
	 * - 여러개의 '문자'를 사용하기 쉽게 만들어 놓은 클래스 
	 * 
	 * String의 주요 메서드
	 * - boolean equals() : 문자열의 내용이 같은지 반환한다. (Override)
	 * - int length() : 문자열의 길이를 반환한다.
	 * - char charAt(int index) : 특정 인덱스에 위치한 문자를 반환한다. 
	 * - String subString(int beginIndex[, int endIndex = 끝 인덱스]) 
	 * : 문자열의 특정 부분을 잘라서 반환한다. 
	 * - int indexOf() : 문자열 내의 특정 문자의 인덱스를 반환한다.
	 * - contains() : 문자열이 특정 문자열을 포함하고 있는지 반환한다. 
	 * - split() : 문자열을 특정 문자를 기준으로 나누어배열형태로 반환한다. 
	 * - trim() : 문자열 앞 뒤 공백을 제거해 반환한다/
	 * - valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다. 
	 */

	public static void main(String[] args) {
		String s1 = new String ("문자열");
		String s2 = new String ("문자열");
		
		String s3 = "문자열";
		String s4 = "문자열";

		//equals()
		System.out.println(s1.equals(s2)); //String은 equals를 문자열의 내용만 비교하도록 재정의   
		System.out.println(s1==s2); //주소값 비교 
		
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		//length()
		System.out.println(s1.length());
		
		
		//charAt()
		for (int i = 0; i < s1.length(); i++) {
			char charAt = s1.charAt(i);
			System.out.println(charAt);
		}
		
		//s1을 뒤집어 출력해주세요(열자문)
		String rev = "";
		
		
		for (int i = s1.length() -1; i >= 0; i--) {
			rev +=s1.charAt(i);
		}
		System.out.println(rev);
		
		// substring()
		//    0123456789
		s1 = "abcedefghij";
		String sub1 = s1.substring(3); //3번 인덱스 부터끝까지
		System.out.println(sub1);
		String sub2 = s1.substring(5,8); //5번 인덱스 부터 8번 인덱스 '전'까지
		System.out.println(sub2);
		
		//indexOf()
		int indexOf = s1.indexOf("e");
		System.out.println(indexOf);
		indexOf = s1.indexOf("z");
		System.out.println(indexOf); //찾으려는 문자열이 없으면 -1 반환 
		s1 = "심동근, 김소민, 고영경 , 송지훈";
		System.out.println(s1.substring(s1.indexOf("고영경")));
		
		//예제) substring과 indexOf를 조합해서 가격만 int[]에 저장해주세요. 
		String[] menu = {
				"수박 20000원",
				"오렌지 10000원",
				"귤 500원",
				"블루베리 3000원"
		};
		
		// 수박 가격 
		String wm = menu[0]; // "수박 20000원"
		int spaceIndex = wm.indexOf(" "); // 2
		int wonIndex = wm.indexOf("원"); //8 
		String priceStr = wm.substring(spaceIndex+1,wonIndex); //"20000"
		int price = Integer.parseInt(priceStr);
		System.out.println(price);
		
		int[] prices = new int[menu.length];
		for (int i = 0; i < prices.length; i++) {
			prices[i] = Integer.parseInt(
					   menu[i].substring(
							   menu[i].indexOf(" ")+1,
							   menu[i].indexOf("원")
							   )
					);
		}
		System.out.println(Arrays.toString(prices));
		
		
		
		
		s1 = "abcdefghij";
		
		//contains()
		//방법 1
		boolean contains = s1.contains("c");
		System.out.println(contains);
		//방법 2
		contains = s1.indexOf("c") > -1;
		System.out.println(contains);
		
		
		//split()
		String[] split = s1.split("e");
		System.out.println(Arrays.toString(split));

		split = s1.split("@");
		System.out.println(Arrays.toString(split));
		
		split = s1.split("a");
		System.out.println(Arrays.toString(split)); //split ={"", "bcdefghij"}
		
		for(int i = 0; i < menu.length ; i++) {
			split = menu[i].split(" ");
			System.out.printf("메뉴명 : %s / 가격 : %s\n", split[0] ,split[1]);
		}
		
		//trim()
		s1 = " 문 자 열 ";
		String trim = s1.trim();
		System.out.println("[" + s1 + "]=> [" + trim + "]");
		//사용자의 실수로 아이디나 비밀번호 뒤에 공백이 들어가는 것을 방지할 수 있음. 
		//(javascript에서 .trim()은 모든 공백을 제거함) 
		
		//valueOf()
		int number = 10; 
		s1 = number + "";
		s1 = String.valueOf(number);
		//Integer.parseInt(s1);
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
//		String[] fruitPrice = new String [4];
//		
//		
//		for (int i = 0; i < fruitPrice.length; i++) {
//			fruitPrice[i] = menu[i].substring(menu[i].indexOf(" "));
//			System.out.println(fruitPrice[i]);
//		}
		}
		
	}


