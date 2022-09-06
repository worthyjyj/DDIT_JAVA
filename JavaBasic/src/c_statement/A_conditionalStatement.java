package c_statement;

import java.util.Scanner;

public class A_conditionalStatement {

	public static void main(String[] args) {
		// 한 줄(여러줄) 지우기 : ctrl + d
		// 앞으로 가기 : ctrl+ y 
		/*
		 * 조건문
		 * -if문
		 * -switch문
		 * 
		 * if문
		 * - if(조건식) {} : 조건식의 결과가 true이면 블럭안의 문장을 수행
		 * - else if (조건식) {} : 다수의 조건이 필요할 때 if 뒤에 추가
		 * - else{} : 결과가 true인 조건식이 하나도 없을 때 수행 
		 */
		
		int a = 1; 
		
		if (a == 1) {
			System.out.println("조건식의 결과가 true면 수행된다.");
		}
		
		if(a == 0) {
			System.out.println("조건식의 결과가 false이면 수행되지 않음");
		}
		
		if(a == 0) {
			System.out.println("a가 0인 경우 하고 싶은 것");
			}else if (a == 1) {
				System.out.println("a가 1인 경우 하고 싶은 것");
			}else if (a == 2) {
				System.out.println("a가 2인 경우 하고 싶은 것");
			}else {
				System.out.println("이외의 경우에 하고 싶은 것");
			}
		
		//조건절의 범위가 큰 것이 위에 있으면 작은 조건은 사용되지 않을
		// 가능성이 높으므로 조건식 작성에 주의 해야한다. 
		if (a<20) {
			System.out.println("a가 20보다 작은 경우 하고 싶은 것");
		}else if (a<10) {
		System.out.println("a가 10보다 작은 경우 하고 싶은 것");
		}
		
		// 성적에 등급을 부여하는 프로그램을 작성해주세요
		// 90~ : A , 80~ : B , 70~ : C, 60~ : D, 나머지 : F
		int score = 80;
		String grade = "";
		
		if (score >=90) {
			grade = "A";
		}else if (score >= 80) {
			grade = "B";
		}else if(score >=70) {
			grade = "C";
		}else if (score >=60) {
			grade = "D";
		}else{
			grade = "F";
		}
		System.out.printf("%d점의 등급은 %s입니다.", score,grade );
		
		// 성적에 등급을 부여하는 프로그램을 작성해주세요
				// 90~ : A , 80~ : B , 70~ : C, 60~ : D, 나머지 : F
		// 1. 성적을 입력 받으세요. 
		// 2. x0~x3 : - , x4~x6: 0, x7~x9 : +
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("성적 입력 >> ");
//		int input = sc.nextInt();
//		int h = input/10; //첫번째 자릿수 추출
//		int j = input%10; //두번째 자릿수 추출
//		
//		if(h == 9 && j <=3) {
//		System.out.println("A-");
//		}else if(h == 9 && j >=4 && j <=6) {
//			System.out.println("A0");
//		}else if(h == 9 && j >=7 && j <=9) {
//			System.out.println("A+");
//		}else if(h == 8 && j <=3) {
//			System.out.println("B-");
//		}else if(h == 8 && j >=4 && j <=6) {
//			System.out.println("B0");
//		}else if(h == 8 && j >=7 && j <=9) {
//			System.out.println("B+");
//		} 
//		
		//방법2
		if (score >=90) {
			grade = "A";
		}else if (score >= 80) {
			grade = "B";
		}else if(score >=70) {
			grade = "C";
		}else if (score >=60) {
			grade = "D";
		}else{
			grade = "F";
		}
		
		//조건문 하나에 실행문 하나라면 {}(블럭)을 사용하지 않아도 된다. 
		if(score % 10 <= 3) {
			grade += "-";
		}else if(score % 10 >= 7) {
			grade +="+";
		}else {
			grade += "0";
		}System.out.printf("%d점의 등급은 %s입니다.", score,grade);
		System.out.println();
		
	

		
		
		/*
		 * switch문
		 * -switch(int/String) {case 1: break;}
		 * - 조건식의 결과는 정수와 문자열만 허용된다. 
		 * - 조건식과 일치하는 case문 '이후'의 문장을 수행한다. 
		 */
		
		a = 1;
		switch(a) {
		case 0: 
			System.out.println("a가 0인 경우에 하고 싶은 것");
			break;
			
		case 1: 
		case 3: 
		case 4:
			System.out.println("a가 1,3,4인 경우에 하고 싶은 것");
//			break;
			

		case 2:
			System.out.println("a가 2인 경우에 하고 싶은 것");
			break;
			

		default:
			System.out.println("a가 0,1,2가 아닌 경우에 하고 싶은 것");
			break;
		}
		
	String str = "a";
	switch(str) {
	case "a" :
		System.out.println("a 입니다");
		break;

	case "b" :
		System.out.println("b 입니다");
		break;
		

	default :
		System.out.println("a,b가 아닙니다.");
		break;
	}
	
	//입력하는 월에 해당하는 계절을 출력해봅시다 (switch 사용)
	System.out.print("입력해주세여 >>");
	int month = sc.nextInt();
		
	switch(month) {
	case 3: case 4 : case 5: 
		System.out.println("봄");
	
	case 6: case 7 : case 8: 
		System.out.println("여름");
		
	case 9: case 10 : case 11: 
		System.out.println("가을");

	case 12: case 1 : case 2: 
		System.out.println("겨울");
	
	default:
		System.out.println("잘못입력");
		break;
	}

	// 숫자 3개를 입력받아 내림차순으로 출력해주세요 
	// 출력 예 : 40 > 24 > 7
	
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();

	if(num1 < num2) { //1순위 추출(숫자2개비교)
		int temp = num1;
		num1 = num2;
		num2 = temp;
	} 
	if(num1 < num3) { //1순위 추출(위에 결과에서 나온 1순위와 마지막 숫자 비교)
		int temp = num1;
		num1 = num3;
		num3= temp;
	} 
	if(num2 < num3) { //2순위 추출 /3순위 담기 
		int temp =num2;
		num2 = num3;
		num3 = temp;
	}	
	System.out.println(num1 + ">" + num2 + ">" + num3);
	}
}
