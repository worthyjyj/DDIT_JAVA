package e_oop.tv;

import java.util.Scanner;

public class TV {
	Scanner sc = new Scanner(System.in);
	int input2; 
	int input3;

	private boolean power; //전원상태
	private int channel; //채널
	private int volume; //음량
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}

	private final int MIN_CHANNEL = 1;
	private final int MAX_CHANNEL = 100;
	private final int MIN_VOLUME = 0;
	private final int MAX_VOLUME = 10;
	//ctrl+shift+x : 대문자
	//ctrl+shift+y : 소문자 
	
	public TV() {
		this.power = false;
		this.channel = this.MIN_CHANNEL;
		this.volume = this.MIN_VOLUME;
	}
	
	
	public void menu() {
		System.out.println("----------------------------------------------------");
		System.out.println("1.전원 2.채널변경 3. 채널업 4.채널다운");
		System.out.println("5.볼륨업 6. 볼륨다운 7.현재정보 0.종료");
		System.out.println("----------------------------------------------------");
		System.out.print("메뉴를 선택해 주세요 >> ");
		input2 = sc.nextInt();
		
		switch(input2) {
		
		case 1: 
			if(power==false) {
				power=true;
				System.out.println("전원이 켜졌습니당");
				menu();
			}else {
				power=false;
				System.out.println("전원이 꺼졌습니당");
				menu();
			}
			break;
		case 2: 
			channelchange();
			break;
		case 3: 
			channelup();
			break;
		case 4: 
			channeldown();
			break;
		case 5: 
			volumeup();
		    break;
		case 6: 
			volumedown();
			break;
		case 7: 
			currentinfo();
			break;
		case 0: 
			break;
		default:
			System.out.println("잘못 누르셨습니다.");
			 menu();
			}
	}
	
	public void channelchange() {
		if(power==true) {
		System.out.print("채널 변경하세용 >> ");
		input3 = sc.nextInt();
		if(input3 > MAX_CHANNEL || input3 < MIN_CHANNEL) {
			System.out.println(input3 + "채널은 없습니다.");
			menu();
		}else {
			this.channel = input3;
		}
		System.out.println("현재 채널: " + getChannel());
		 menu();
		}else {
			System.out.println("전원을 킨 후 이용하세용");
			menu();
		}
	}
	
	public void channelup() {
		if(power==true) {
		int a = this.channel+1;
		if(a > MAX_CHANNEL || a < MIN_CHANNEL) {
			
		}else {
			this.channel = a;
		}
		System.out.println("현재 채널: " + getChannel());
		menu();
		}else {
			System.out.println("전원을 킨 후 이용하세용");
			menu();
		}
	}
	
	public void channeldown() {
		if(power==true) {
		int a = this.channel-1;
		if(a > MAX_CHANNEL || a < MIN_CHANNEL) {
			
		}else {
			this.channel = a;
		}
		System.out.println("현재 채널: " + getChannel());
		menu();
	}else {
		System.out.println("전원을 킨 후 이용하세용");
		menu();
	}
	}	
	
	public void volumeup() {
		if(power==true) {
		int a = this.volume+1;
		if(a > MAX_VOLUME || a < MIN_VOLUME) {
			
		}else {
			this.volume = a; 
		}
		showvolume1(); //볼륨 상자 출력 
		System.out.println();
		System.out.println("현재 볼륨: " + getVolume());
		menu();
	}else {
		System.out.println("전원을 킨 후 이용하세용");
		menu();
	}
	}
	
	public void volumedown() {
		if(power==true) {
		int a = this.volume-1;
		if(a > MAX_VOLUME || a < MIN_VOLUME) {
			
		}else {
			this.volume = a; 
		}
		showvolume2();
		System.out.println();
		System.out.println("현재 볼륨: " + getVolume());
		menu();
		}else {
			System.out.println("전원을 킨 후 이용하세용");
			menu();
		}
	}
	
	public void currentinfo() {
		if(power==true) {
		System.out.println("현재 채널: " + this.channel);
		System.out.println("현재 볼륨: " + this.volume);
		menu();
		}else {
			System.out.println("전원을 킨 후 이용하세용");
			menu();
		}
	}
	
	public void showvolume1() {
		System.out.print("볼륨 ");
		for(int i=0 ; i < this.volume; i++) {
			System.out.print("■");
		}
		for(int j=0; j<MAX_VOLUME-this.volume; j++) {
				System.out.print("□");
			}
		}
	
	public void showvolume2() {
		System.out.print("볼륨 ");
		for(int i=0 ; i < this.volume; i++) {
			System.out.print("■");
		}
		for(int j=0; j<MAX_VOLUME-this.volume; j++) {
				System.out.print("□");
			}
		}
	

	public boolean poweroff() {
		if(input2==0) {
			return false;
		}else
			return true;
	}
	}




















