package e_oop.foodcourt;

import java.util.concurrent.TimeUnit;

public class Restaurant {
	String name, type;
	Menu[] menuList = new Menu[0];
	
	public Restaurant(String name, String type) {
		this.name = name;
		this.type= type;
	}

	public String toString() {
		//String 클래스의 format메서드는 static이므로 
		return String.format("[%s] %s", this.type, this.name);
	}

	public void order(Menu m, int orderNumber) {
		System.out.println(m.name+"을(를) 요리합니다...");
		for(int i = 0; i < m.cookingTime ; i++) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+1);
		}
		System.out.printf("[%3d]번 고객님, 주문하신 %s이(가) 완성되었습니다.\n"
				, orderNumber, m.name);
		System.out.printf("%s에서 받아가세요!" , this.name);
		System.out.println();
	}
}


