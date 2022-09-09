package z_homework.work04;

public class W06 {

	public static void main(String[] args) {
//		System.out.println("현재 시간 : 0일 00:00:00");
//		System.out.println();
//		System.out.println("(123,456초 이후)");
//		int input = 
////		System.out.println("1일 " + );
//		
//		//못품
//	}
		int days = 0, hours = 0, minutes =0 , secondes = 0;
		System.out.printf("[%d일 %02d:%02d:%02d]", days, hours, minutes, secondes );
		int past = 123456;
		secondes += past % 60; //나머지가 현재 시계의 초
		past /= 60; //몫이 앞으로 계산해야할 분
		minutes+= past % 60; //나머지가 현재 시계의 분
		past /= 60; //몫이 앞으로 계산해야할 시간
		hours += past % 24; //나머지가 현재 시계의 시간
		past /= 24; // 몫이 앞으로 계산해야할 일자
		days += past; //지난 일자
		
//		int day = 60*60*24;
//		days = past /day;
//		past %= days;
//		int hour = 60*60;
//		hours = past /hour;
//		
//		int minute =60;
//		minutes =past /minute;
//		
//		secondes = past % 60;
//		
//		System.out.printf("[%d일 %02d:%02d:%02d]\n", days, hours, minutes, secondes );
//		
		past = 654321;
		secondes += past % 60; //나머지가 현재 시계의 초
		if(secondes >= 60) {
			secondes -= 60;
			minutes++;
			}
		past /= 60; //몫이 앞으로 계산해야할 분
		minutes+= past % 60;
		if(minutes >= 60) {
			minutes -= 60;
			hours++;
			}//나머지가 현재 시계의 분
		past /= 60; //몫이 앞으로 계산해야할 시간
		hours += past % 24;//나머지가 현재 시계의 시간
		if(hours >= 60) {
			hours -= 60;
			days++;
			}
		past /= 24; // 몫이 앞으로 계산해야할 일자
		days += past; //지난 일자
		System.out.printf("[%d일 %02d:%02d:%02d]\n", days, hours, minutes, secondes );
		
		//문제3
		int before = 234567;
		secondes -= before %60;
		if(secondes < 0) {
			minutes --;
			secondes += 60;
		}
		before /= 60;
		minutes -= before %60;
		if(minutes < 0) {
			hours --;
			minutes += 60;
		}
		before /= 60;
		hours -= before %24;
		if(hours < 0) {
			days --;
			hours += 24;
		}
		before /= 24;
		days -= before;
		System.out.printf("[%d일 %02d:%02d:%02d]\n", days, hours, minutes, secondes);
	}
}
