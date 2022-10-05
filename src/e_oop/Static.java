package e_oop;

public class Static {

	/*
	 * - static을 붙이면 프로그램 실행 시 메모리에 올라간다. 
	 * - 객체생성을 하지 않아도 사용할 수 있다. 
	 * - static을 붙인 변수는 객체간에 변수의 값을 공유한다. 
	 * - static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
	 * - static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메소드 
	 */
	
	//값을 공유하기위해 static을 붙인다. 
	static int var; 
	
	
	public static void main(String[] args) {
	 Human 철수 = new Human();
	 Human 영희 = new Human();
	 
	 
	 
	 
	 
	 철수.saveMoney(50000);
	 영희.saveMoney(100000);
	
	
	Human 커플통장 = new Human(); //static 메서드를 쓰면 객체를 만들지 않아도 된다. 
	커플통장.saveMoney(200000);
	
	
	철수.saveGroupMoney(200000);
	System.out.println(영희.groupAccount); 
	
	영희.saveGroupMoney(10000);
	System.out.println(철수.groupAccount);
	}
}


class Human{
	int account; //잔고 
	public void saveMoney(int money) {
		this.account += money; 
		System.out.println("통장 잔고 :" + this.account);
	}
	
	static int groupAccount; 
	public void saveGroupMoney(int money) {
		this.groupAccount += money; 
		System.out.println("모임통장 잔고 : "+ groupAccount);
	}
}

