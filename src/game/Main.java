package game;

import java.util.Scanner;

import e_oop.ScanUtil;

public class Main {
	Scanner sc = new Scanner(System.in);
	int input=0;
	String a; 
	My m = new My(); //My 객체 생성 
	

	public static void main(String[] args) {
		 new Main().start();
	}

	public void start() {
		while(true) {
			if(input!=1 || input !=2 || input!=3) {
		System.out.println("-------------------------------------------------------------");
		System.out.println("--------------------두더지 부대 뿌시는 게임------------------");
		System.out.println("-------------------------------------------------------------");
		System.out.println("          코딩을 배우고 있는 당신, 타자가 빨라야지만         ");
		System.out.println("                   수업을 따라갈 수 있는데                   ");
		System.out.println("                두더지가 자꾸 당신을 방해한다                ");
		System.out.println(                                                               );
		System.out.println("        일병(LV1) | 상병(LV2) | 사단장(LV3) 으로 꾸려진      ");
		System.out.println("         두더지 부대를 뿌시고 타자 실력을 UP시키자!          ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");
		System.out.print  ("                이름을 입력해주세요 >> ");
		a = sc.nextLine();
		m.name = a; //캐릭터 이름 전달
		interFace();
		break;
			}
		}
	}
			
	public void interFace() {
		while(true) {
			m.att=0; 
			m.def=10;
			m.level=1;
		System.out.println("-------------------------------------------------------------");
		System.out.print ("       1.내정보  2.두더지잡으러가기 3.랭킹 >> "); 
		input = sc.nextInt();
		
		switch(input) {
		case 1: 
			m.info();
			break;
		case 2: 
			huntmole();
			result();
			huntmoleLV2();
			result();
			huntmoleLV3();
			finalresult();
			break;
		case 3: 
			//한번 계정을 생성하면 그 최종 공격력(타자점수)가 저장되어서 랭킹에서 볼 수 있게끔 하는거를 어떻게 하지,,,, 두더지를 잡으러 가기 전까지의 공격력 정보가 저장되어야 하는데.. 초기화되지 않고 
			break;
		default :
			break;
		}
		}
		}
			
	


	private void finalresult() {
		if(m.def>0) {
			System.out.println("축하합니다!! 두더지 부대를 모두 혁파했습니다!!!!!!!!!!!!");
			System.out.println("당신은 타자왕,,,,, 축하합니다,,,,,");
			interFace();
		}else {
			m.def=0;
			System.out.println("=============================================");
			System.out.println("두더지의 공격에 죽었습니다.......ㅠㅠ");
			System.out.println("=============================================");
			interFace();
		}
	}

	private void result() {
		if(m.def>0) {
			m.level++;
			m.def+=10;
			System.out.println("====================================================================================================");
			System.out.printf("★★★레벨업을 했습니다★★★ 현재 레벨 : %d , 현재 공격력 : %d, 현재 방어력 : %d\n",m.level,m.att,m.def);
			System.out.println("====================================================================================================");
			System.out.println("다음 레벨 준비됐으면 엔터를 치세요! ");
			String a = ScanUtil.nextLine();
			if(a.equals("")) {}
			}else {
				m.def=0;
			System.out.println("=============================================");
			System.out.println("두더지의 공격에 죽었습니다.......ㅠㅠ");
			System.out.println("=============================================");
			interFace();
		}
	}

	private void huntmole() {
		Weapon w = new Weapon();
		MoleArmy ma = new MoleArmy("LV1.일병두더지", 2,  w.weapons1);  //일병 두더지 출현  
		clearConsole();
		System.out.println("LV1.일병두더지가 나타나 공격합니다!!!");
		System.out.println();
		
		Battle:
		while(true) {  
			String input;
			for(int i=0; i<w.weapons1.length; i++) {
				if(m.def<0) {break Battle;}
				System.out.printf("5초안에 '%s' 입력 ㄱㄱ >> ",w.weapons1[i]);
				long beforeTime = System.currentTimeMillis();
				input = ScanUtil.nextLine();
				long afterTime = System.currentTimeMillis();
				long secDiffTime = (afterTime - beforeTime)/1000;
				
				if(secDiffTime < 6) {
					if(input.equals(w.weapons1[i])) {
						System.out.println("====================================");
						System.out.println("두더지를 잡아 +2 공격력 올랐습니다.");
						System.out.println("====================================");
						System.out.println();
						m.att+=2;
					}else{
						System.err.println("================오타================");
						System.err.println("두더지를 놓쳐 -2 방어력 잃었습니다.");
						System.err.println("====================================");
						System.err.println();
						m.def-=2;
					}
				}else {
					System.err.println("===============시간초과===============");
					System.err.println("두더지를 놓쳐 -2 방어력 잃었습니다.");
					System.err.println("====================================");
					System.err.println();
					m.def-=2;
				}
			}break;
		}
	}
	
	private void huntmoleLV2() {
		Weapon w = new Weapon();
		MoleArmy ma = new MoleArmy("LV2.상병두더지", 5, w.weapons2);  //일병 두더지 출현  
		clearConsole();
		System.out.println("LV2.상병두더지가 나타나 공격합니다!!!");
		System.out.println();
		
		Battle:
		while(true) {
			String input;
			for(int i=0; i<w.weapons2.length; i++) {
				if(m.def<0) {break Battle;}
				System.out.printf("4초안에 '%s' 입력 ㄱㄱ >> ",w.weapons2[i]);
				long beforeTime = System.currentTimeMillis();
				input = ScanUtil.nextLine();
				long afterTime = System.currentTimeMillis();
				long secDiffTime = (afterTime - beforeTime)/1000;
				
				if(secDiffTime < 5) {
					if(input.equals(w.weapons2[i])) {
						System.out.println("====================================");
						System.out.println("두더지를 잡아 +5 공격력 올랐습니다.");
						System.out.println("====================================");
						System.out.println();
						m.att+=5;
					}else{
						System.err.println("================오타================");
						System.err.println("두더지를 놓쳐 -5 방어력 잃었습니다.");
						System.err.println("====================================");
						System.err.println();
						m.def-=5;
					}
				}else {
					System.err.println("===============시간초과===============");
					System.err.println("두더지를 놓쳐 -5 방어력 잃었습니다.");
					System.err.println("====================================");
					System.err.println();
					m.def-=5;
				}
			}break;
		}
	}

	private void huntmoleLV3() {
		Weapon w = new Weapon();
		MoleArmy ma = new MoleArmy("LV3.사단장두더지", 10, w.weapons3); 
		clearConsole();
		System.out.println("LV3.사단장두더지가 나타나 공격합니다!!!");
		System.out.println();
		
		Battle:
		while(true) {
			String input;
			for(int i=0; i<w.weapons3.length; i++) {
				if(m.def<0) {break Battle;}
				System.out.printf("3초안에 '%s' 입력 ㄱㄱ >> ",w.weapons3[i]);
				long beforeTime = System.currentTimeMillis();
				input = ScanUtil.nextLine();
				long afterTime = System.currentTimeMillis();
				long secDiffTime = (afterTime - beforeTime)/1000;
				
				if(secDiffTime < 4) {
					if(input.equals(w.weapons3[i])) {
						System.out.println("====================================");
						System.out.println("두더지를 잡아 +10 공격력 올랐습니다.");
						System.out.println("====================================");
						System.out.println();
						m.att+=10;
					}else{
						System.err.println("================오타================");
						System.err.println("두더지를 놓쳐 -10 방어력 잃었습니다.");
						System.err.println("====================================");
						System.err.println();
						m.def-=10;
					}
				}else {
					System.err.println("===============시간초과===============");
					System.err.println("두더지를 놓쳐 -2 방어력 잃었습니다.");
					System.err.println("====================================");
					System.err.println();
					m.def-=10;
				}
			}break;
		}
	}
	
	
	public void clearConsole() {
		for(int i =0; i <100; i++) System.out.println();
	}
}

