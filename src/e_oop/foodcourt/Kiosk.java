package e_oop.foodcourt;

import e_oop.ScanUtil;

public class Kiosk {
	// 키오스크
	// 주문의 모든 행위가 일어남
	Restaurant[] restList = new Restaurant[0]; // 식당 목록 -> 최초 0길이의 배열
	int input; // 각 메서드에서 선언학 번거로워 전역변수(필드)로 선언

	public void insertRestaurant() {
		System.out.println("---- 식당 추가 ----");
		System.out.print("식당 종류 >>");
		String type = ScanUtil.nextLine();
		System.out.print("식당 이름 >>");
		String name = ScanUtil.nextLine();
		Restaurant[] temp = new Restaurant[restList.length + 1];
		for (int i = 0; i < restList.length; i++) {
			temp[i] = restList[i];
		}
		temp[temp.length - 1] = new Restaurant(name, type);
		restList = temp;

		System.out.printf("[%s] %s 식당이 추가되었습니다.", type, name);
		System.out.println();
	}

	public void deleteRestaurant() {
		Restaurant r= showRestaurantList();
		if(r==null) {
			return; //메소드 종료 
		}
		//기존 키오스크가 가지고있던 식당 갯수보다 하나작은 배열 선언 
		Restaurant[] temp = new Restaurant[this.restList.length-1];
		int tune = 0; 
		for(int i =0; i < temp.length; i++) {
			if(this.restList[i] == r) { //주소값을 비교해도 되기때문에 .equals를 쓰지 않아도댐
				tune ++; 
			}
			temp[i] = this.restList[i+tune];
		}
		this.restList = temp; 
		System.out.println(r.name +"이(가) 삭제되었습니다.");
	}

	public Restaurant showRestaurantList() {
		if (this.restList == null || this.restList.length == 0) {
			System.out.println("등록된 식당이 없습니다.");
			return null; // void라도 return을 만나면 실행 종료
		}
		list: while (true) {

			System.out.println("------ 식당 목록 ------");
			for (int i = 0; i < this.restList.length; i++) {
				System.out.printf("%2d. %s", i + 1, this.restList[i]);
				System.out.println();
			}
			System.out.println("-----------------------");
			System.out.print("선택 >> ");
			input = ScanUtil.nextInt();
			if (input > this.restList.length || input < 1) {
				System.out.println("잘못 입력하였습니다");
			} else {
				System.out.println(this.restList[input - 1] + "을 선택하였습니다.");
				break list;
			}
		}
		return this.restList[input-1];
	}

	public void insertMenu() {
		Restaurant r= showRestaurantList();
		if(r==null) {
			return; //메소드 종료 
		}
		System.out.println("--- 메뉴 추가 ---");
		System.out.print("메뉴 이름 >> ");
		String name = ScanUtil.nextLine();
		System.out.print("메뉴 가격 >> ");
		int price = ScanUtil.nextInt();
		Menu[] temp = new Menu[r.menuList.length+1];
		for(int i = 0; i < r.menuList.length; i++) {
			temp[i] = r.menuList[i];
		}
		Menu m = new Menu(name, price);
		temp[temp.length -1] = m;
		r.menuList = temp;
		System.out.println("{" + m + "} 메뉴가 추가되었습니다.");
	}

	public Menu showMenuList(Restaurant r) {
		if(r.menuList.length == 0) {
			System.out.println(r.name +"에 등록된 메뉴가 없습니다.");
			return null;
		}
		list:
			while(true) {
				System.out.println("------" + r.name + " 차림표 ------");
				for(int i = 0; i < r.menuList.length; i++) {
					System.out.println((i+1) + "." + r.menuList[i]);
				}
				System.out.println("-----------------------------------");
				System.out.print("선택 >> ");
				input = ScanUtil.nextInt();
				if(input > r.menuList.length || input <1) {
					System.out.println("잘못 입력하였습니다.");
				}else {
					System.out.println(r.menuList[input -1].name + "을(를) 선택하였습니다.");
					System.out.printf("가격은 %d원 입니다.", r.menuList[input-1].price);
					System.out.println();
					break list;
				}
			}
		return r.menuList[input-1];
	}
}

