package e_oop.game;

public class Character {
	String name; //케릭터의 이름
	int maxHp, maxMp, hp, mp, att, def, level, exp, nextExp; 
	//최대체력 , 최대마나, 현재체력, 현재마나, 공격력, 방어력, 레벨, 현재경험치, 레벨업을 위한 경험치량 
	Item[] inventory;
	
	//생성자를 만들어 기본생성자가 자동 추가되는 것을 막음 
	//-> 케릭터를 만들기 위해서는 반드시 케릭터명을 입력해야함 
	public Character(String name) {
		this.name = name;
		this.maxHp = 100; 
		this.hp = this.maxHp;
		this.maxMp = 50;
		this.mp = this.maxMp;
		this.att = 20;
		this.def = 10;
		this.level = 1;
		this.exp = 0;
		this.nextExp = this.level *100;
		inventory = new Item[0];
	}


	public void showInfo() {
		System.out.println("-----상태-----");
		System.out.printf ("이  름: %s\n", this.name);
		System.out.printf ("레  벨: %d\n", this.level);
		System.out.printf ("체  력: %d / %d\n", this.hp, this.maxHp);
		System.out.printf ("마  나: %d / %d\n", this.mp, this.maxMp);
		System.out.printf ("공  격: %d\n", this.att);
		System.out.printf ("방  어: %d\n", this.def);
		System.out.printf ("경험치: %d / %d\n", this.exp, this.nextExp);
		System.out.println ("-------------");
		System.out.println ("----아이템----");
		System.out.println ("-------------");	
		for(int i=0; i < this.inventory.length; i++) {
			System.out.println(this.inventory[i]);
		}
		System.out.println("-------------------");
	}


	public void attack(Monster m) {
		int damage = this.att - m.def;
		damage = damage <= 0 ? 1: damage;
		m.hp -= damage;
		m.hp = m.hp < 0 ? 0 : m.hp;
		System.out.printf("%s(이)가 공격으로 %s에게 %d만큼 데미지를 주었습니다."
				          , this.name, m.name, damage);
		System.out.println();
		System.out.printf("%s의 남은 HP : %d", m.name, m.hp);
		System.out.println();
	}


	public void getExp(int exp) {
		System.out.println(exp +"의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(this.exp >= this.nextExp) {
			this.exp -= this.nextExp;
			levelUp();
		}
	}


	private void levelUp() {
		this.level++;
		this.maxHp += 10;
		this.hp = this.maxHp;
		this.maxMp += 5;
		this.mp = this.maxMp;
		this.att += 5;
		this.def += 5;
		this.nextExp = this.level *100;
		System.out.println("LEVEL UP!!");
	}


	public void getItem(Item i) {
		System.out.println(i.name + "을(를) 획득하였습니다.");
		Item[] tmp = new Item[this.inventory.length+1];
		for(int j = 0 ; j < this.inventory.length ; j++) {
			tmp[j] = this.inventory[j];
		}
		tmp[tmp.length-1] = i; 
		this.inventory = tmp;
		
		this.maxHp += i.maxHp;
		this.maxMp += i.maxMp;
		this.att += i.att;
		this.def += i.def; 
	}
}
