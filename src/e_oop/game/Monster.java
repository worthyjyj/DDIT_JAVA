package e_oop.game;

import java.util.Random;

public class Monster extends Status {
	
	
	public Monster(String name, int maxHp, int maxMp, int att, int def, int exp, Item[] items) {
		this.name = name;
		this.maxHp = maxHp; 
		this.hp = this.maxHp;
		this.maxMp = maxMp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.items = items; 
	}

	public void attack(Character c) {
		int damage = this.att - c.def;
		damage = damage <= 0 ? 1: damage;
		c.hp -= damage;
		c.hp = c.hp < 0 ? 0 : c.hp;
		System.out.printf("%s(이)가 공격으로 %s에게 %d만큼 데미지를 주었습니다."
				          , this.name, c.name, damage);
	    System.out.println();
		System.out.printf("%s의 남은 HP : %d", c.name, c.hp);
		System.out.println();
	}
	
	
	public Item dropItem() {
		return items[new Random().nextInt(items.length)];	// 0-3 , idx = 1이 걸렸다 가정
	}
}
