package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종 진화 형태이다. (변수 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다. 
		 * - 변수와 메서드로 구성할 수 있다. 
		 */
		
		//1차형 데이터 관리 
		int kor; 
		int eng;
		int math;
		int sum;
		double avg;
		String name;
	
		//2차형 데이터 관리
		int[] score = new int[3]; // kor, eng, math
		int sum2;
		double avg2;
		String name2; 
		
		//3차형 데이터 관리 (유저형)
//		Student student = new Student();
//		student.name = "홍길동";
//		student.kor =90; 
//		
//		System.out.println(student.name);
//		System.out.println(student.kor);
//		System.out.println(student.toString());
//	
	
	
	
	
	}

}
//3차형 데이터 관리 
class Student{
	private int kor, eng, math;
	private int sum;
	private double avg;
	private String name;
	
	Student(int kor, int eng, int math, String name){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name; 
		this.sum = sum(); 
		this.avg = avg(); 
	}
	
	private double avg() {
		return (double) sum/3;
	}

	private int sum() {
		return kor+ eng+ math;
	}

	@Override //오버라이드 (오버라이딩) : 부모클래스의 메서드 재정의 
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg + ", name="
				+ name + "]";
	}
	
	
	
	//Alt+Shift +s : 코드 자동제작 
}