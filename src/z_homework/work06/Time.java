package z_homework.work06;

public class Time {

	int hour; 
	int minute;
	int second;
	
	Time(){
		this.hour = 0;
		this.minute = 0; 
		this.second = 0; 
	}
	
	//뭔가 잘못됐어 !!!!!!!!!! 오류~~~~~~시/분/초 따로 정리해줘야함 
	Time(int hour, int minute, int second){ 
		if(hour<0 || hour>23) {
			this.hour = 0;
		}else if(minute<0 || minute>59) {
			this.minute = 0;
		}else if(second<0 || second>59) {
			this.second = 0;
		}else
		this.hour = hour;
		this.minute = minute; 
		this.second = second; 
		
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println("기본 생성자 호출 후 시간 : " + time1);
		Time time2 = new Time(22,15,48); 
		System.out.println("두번째 생성자 호출 후 시간 : " + time2);
		Time time3 = new Time(15,66,77);
		System.out.println("올바르지 않은 시간 설정 후 시간: " + time3);
	}
}
