package z_homework.work06;

public class Time {

	private int hour,minute,second; 
	
	
	public Time(){}
	
	Time(int hour, int minute, int second){ 
		if(hour<0 || hour>23) {
			hour = 0;
		}if(minute<0 || minute>59) {
			minute = 0;
		}if(second<0 || second>59) {
			second = 0;
		}
		this.hour = hour;
		this.minute = minute; 
		this.second = second; 
	}
	
	//부모클래스의 메서드를 재 정의 할 때 사용함 
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println("기본 생성자 호출 후 시간 : " + time1.toString());
		Time time2 = new Time(22,15,48); 
		System.out.println("두번째 생성자 호출 후 시간 : " + time2);
		Time time3 = new Time(15,66,77);
		System.out.println("올바르지 않은 시간 설정 후 시간: " + time3);
	}
}
