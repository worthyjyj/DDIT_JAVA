package c_statement;

import java.util.Random;
import java.util.Scanner;

public class Z_Lotto {
//임의의 로또 번호 6자리를 생성하고 <- 1등번호
	//(중복번호 없음, 1~45)
	//
	//1등이 나올때까지 랜덤 6자리 생성 
	// 얼마를 써야 1등이 되는지 알려주세요.
	// 한 번 쓸 때 천원
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int lotto2;
		int lotto3;
		int lotto4;
		int lotto5;
		int lotto6;
		
		int lotto1 = rnd.nextInt(45)+1;
		
		do {
		lotto2 = rnd.nextInt(45)+1;
		}while(lotto1 == lotto2);
		
		do {
			lotto3 = rnd.nextInt(45)+1;
			}while(lotto1 == lotto3 || lotto2 == lotto3);
			
		do {
			lotto4 = rnd.nextInt(45)+1;
			}while(lotto1 == lotto4 || lotto2 == lotto4 || lotto3 == lotto4);
		
		do {
			lotto5 = rnd.nextInt(45)+1;
			}while(lotto1 == lotto5 || lotto2 == lotto5 || lotto3 == lotto5 || lotto4 == lotto5);
		
		do {
			lotto6 = rnd.nextInt(45)+1;
			}while(lotto1 == lotto6 || lotto2 == lotto6 || lotto3 == lotto6 || lotto4 == lotto6 || lotto5 == lotto6);
	
		System.out.printf("1등 번호: %d %d %d %d %d %d \n", lotto1, lotto2, lotto3, lotto4, lotto5, lotto6); //1등 번호
		
		int count;
		int count1 = 0;
		
		do {
			count = 0; 
			count1++;
		System.out.print("로또 번호 숫자 6개를 입력해주세요 >> ");
		int input1 = sc.nextInt();
		System.out.print("로또 번호 숫자 6개를 입력해주세요 >> "); 
		int input2 = sc.nextInt(); 
		System.out.print("로또 번호 숫자 6개를 입력해주세요 >> "); 
		int input3 = sc.nextInt(); 
		System.out.print("로또 번호 숫자 6개를 입력해주세요 >> "); 
		int input4 = sc.nextInt(); 
		System.out.print("로또 번호 숫자 6개를 입력해주세요 >> "); 
		int input5 = sc.nextInt(); 
		System.out.print("로또 번호 숫자 6개를 입력해주세요 >> "); 
		int input6 = sc.nextInt(); 
		
		if(lotto1 == input1 || lotto1 == input2 || lotto1 == input3 || lotto1 == input4  || lotto1 == input5 || lotto1 == input6) {
			count++;
		}
		
		if(lotto2 == input1 || lotto2 == input2 || lotto2 == input3 || lotto2 == input4  || lotto2 == input5 || lotto2 == input6) {
			count++;
		}
		
		if(lotto3 == input1 || lotto3 == input2 || lotto3 == input3 || lotto3 == input4  || lotto3 == input5 || lotto3 == input6) {
			count++;
		}
	
		if(lotto4 == input1 || lotto4 == input2 || lotto4 == input3 || lotto4 == input4  || lotto4 == input5 || lotto4 == input6) {
			count++;
		}
		
		if(lotto5 == input1 || lotto5 == input2 || lotto5 == input3 || lotto5 == input4  || lotto5 == input5 || lotto5 == input6) {
			count++;
		}
		
		if(lotto6 == input1 || lotto6 == input2 || lotto6 == input3 || lotto6 == input4  || lotto6 == input5 || lotto6 == input6) {
			count++;
		}
		
		}while(count != 6);
		System.out.printf("총 돌린 갯수 : %d , 쓴 돈 : %d", count1, count1*1000);
		}
	}

