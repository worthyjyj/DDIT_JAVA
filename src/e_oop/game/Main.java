package e_oop.game;

import java.util.Random;

import e_oop.ScanUtil;

public class Main {

	Character c;
	Monster[] monsterPool;
	Item[] itemPool;
	
	Main(){
		itemPool = new Item[12];
		itemPool[0] = new Item("나무검", 0, 0, 10, 0);
		itemPool[1] = new Item("천갑옷", 0, 0, 0, 10);
		itemPool[2] = new Item("체력구슬", 10, 0, 0, 0);
		itemPool[3] = new Item("마나구슬", 0, 10, 0, 0);
		
		itemPool[4] = new Item("강철검", 0, 0, 30, 0);
		itemPool[5] = new Item("가죽갑옷", 0, 0, 0, 30);
		itemPool[6] = new Item("체력주머니", 50, 0, 0, 0);
		itemPool[7] = new Item("마나주머니", 0, 50, 0, 0);
		
		itemPool[8] = new Item("무한의대검", 0, 0, 100, 0);
		itemPool[9] = new Item("가시갑옷", 0, 0, 0, 100);
		itemPool[10] = new Item("체력의샘", 200, 0, 0, 0);
		itemPool[11] = new Item("마나의샘", 0, 200, 0, 0);
		
		Item[] items1 = {itemPool[0],itemPool[1],itemPool[2],itemPool[3]}; 
		Item[] items2 = {itemPool[4],itemPool[5],itemPool[6],itemPool[7]}; 
		Item[] items3 = {itemPool[8],itemPool[9],itemPool[10],itemPool[11]}; 
		
		monsterPool = new Monster[3];
		//             new Monster(name, maxHp, maxMp, att, def, exp)
		monsterPool[0] = new Monster("바위게",20,20,10,10,50, items1);
		monsterPool[1] = new Monster("협곡의전령",100,20,50,50,100, items2);
		monsterPool[2] = new Monster("바톤",5000,2000,200,200,400,items3);
	}
	
	public static void main(String[] args) {
        new Main().start();
	}

	private void start() {
		clearConsole(); 
		System.out.print("캐릭터명을 입력하세요 >> ");
		String name = ScanUtil.nextLine();
		c = new Character(name);
		
		clearConsole(); 
		System.out.println("================게임 시작==================");
		game:
			while(true) {
				if(c.hp <= 0) {
					System.out.println("플레이어의 체력이 없습니다.");
					System.out.println("게임이 종료됩니다.");
					break game;
				}
				System.out.println("--------메인메뉴-------");
				System.out.println("1.내정보 2.사냥 3.종료");
				System.out.println("------------------------");
				System.out.print("메뉴를 입력해 주세요 >> ");
				int input = ScanUtil.nextInt();
				clearConsole(); 
				switch(input) {
				case 1:
					c.showInfo();
					break;
				case 2:
					hunt(); 
					break;
				case 0:
					System.out.println("게임을 종료합니다.");
					break game;
				}
			}
			
	}

	private void hunt() {
		int leng = monsterPool.length;
		int rndIndex = new Random().nextInt(leng);
		Monster tempMonster = monsterPool[rndIndex];
//		Monster m = monsterPool[new Random().nextInt(monsterPool.length)];
		//몬스터풀에서 '주ㅜ소값을 하나 꺼냄 -> 실제 몬스터가 아님
		
		Monster m = new Monster(tempMonster.name, tempMonster.maxHp, tempMonster.maxMp, tempMonster.att, tempMonster.def, tempMonster.exp, tempMonster.items);
		//String name, int maxHp, int maxMp, int att, int def, int exp, Item[] items
		
		System.out.println("---전투 화면---");
		System.out.println(m.name +"을(를) 만났습니다. 전투를 시작합니다!");
		
		
		
		
		int input =0;
		battle:
			while(true) {
				
				System.out.print("1.공격 2.도망");
				input = ScanUtil.nextInt();
				switch(input) {
				case 1:
					c.attack(m);
					m.attack(c);
					if(m.hp <= 0) {
						System.out.println(m.name +"을(를) 처치하였습니다.");
						System.out.println("----전투종료----");
						Item i = m.dropItem();
						c.getItem(i);
						c.getExp(m.exp);
						break battle;
					}
					if(c.hp <= 0) {
						System.out.println(c.name +"이(가) 죽었습니다.");
						System.out.println("----전투종료----");
						break battle;
					}
					break;
				case 2:
					System.out.println(m.name +"(으)로 부터 도망쳤습니다.");
					break battle; 
				}
			}	
	}

	public void clearConsole() {
		for(int i =0; i <100; i++) System.out.println();
	}

}
