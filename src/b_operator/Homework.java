package b_operator;


public class Homework {

	public static void main(String[] args) {
		
		//1광년 : 빛의 속도가 300000/초속 이므로 1광년으로 단위를 변환하기 위해서 
		double a = 300000.0*60*60*24*365; 
		System.out.printf("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 %s광년이다.", 
				(40e12)/a);
		
		double distance = 40e12;
		double speed = 60*60*24*365;
		double b = 300000*speed;
		System.out.printf("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 %s광년이다.", 
				(40e12)/b);

	}
}
