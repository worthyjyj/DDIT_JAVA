package z_homework.work04;

import java.util.Random;

public class W05 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int money = (rnd.nextInt(500)+1)*10; //1부터 500까지 랜덤으로 뽑고 10을 곱해서 마지막 숫자가 0으로 떨어지도록..
		System.out.println("거스름돈 : " + money);
		//500 100 50 10
		int coin500 = money / 500;
		money %= 500; //money값에서 500원 갯수를 곱한 만큼 뺀 값이 됨.
		int coin100 = money / 100;
		money %= 100;
		int coin50 = money/ 50;
		money %= 50;
		int coin10 = money /10;
		
		System.out.printf("500원 : %d개\n"
		+ "100원 : %d개\n"
		+ "50원 : %d개\n"
		+ "10원 : %d개\n", coin500, coin100, coin50, coin10);
		
		
		
		
		
		
		
//		System.out.println("거스름돈 : " + change);
//		System.out.printf("500원: %d개", change/500); // 거스름돈을 500원으로 나눔.그 값으로 동전 갯수 추출
//		int a = (change/500)*500; // 필요한 500원의 동전 갯수 * 500 (거스름돈에서 500원 갯수 곱한 만큼 빼줘야 하므로) 
//		System.out.println(); 
//		System.out.printf("100원: %d개", (change - a)/100); //거스름돈에서 a를 빼준 후 100원으로 나눠 100원의 동전 갯수를 구함
//		int b = change - a; // 거스름돈에서 500원 갯수를 뺀 값에 계산 해야 하므로 b 변수에 값을 담음. 
//		a = (b/100)*100; 
//		System.out.println();
//		System.out.printf("50원:  %d개", (b-a)/50);
//		System.out.println();
//		int t = (b-a); 
//		a = ((b-a)/50)*50; 
//		b = (b-a); 
//		System.out.printf("10원:  %d개", (t - a)/10);
	}
}
