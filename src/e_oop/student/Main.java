package e_oop.student;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
//		Student s1 = new Student(rnd.nextInt(51)+50,rnd.nextInt(51)+50,
//				rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,"김범수");
//		Student s2 = new Student(rnd.nextInt(51)+50,rnd.nextInt(51)+50,
//				rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,"김범");
//		Student s3 = new Student(rnd.nextInt(51)+50,rnd.nextInt(51)+50,
//				rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,"김수");
//		Student s4 = new Student(rnd.nextInt(51)+50,rnd.nextInt(51)+50,
//				rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,"범수");
//		Student s5 = new Student(rnd.nextInt(51)+50,rnd.nextInt(51)+50,
//				rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,"김범명수");
//		Student s6 = new Student(rnd.nextInt(51)+50,rnd.nextInt(51)+50,
//				rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,"김박수");
//		System.out.println(s1.toString());
//		System.out.println(s2.toString());
//		System.out.println(s3.toString());
//		System.out.println(s4.toString());
//		System.out.println(s5.toString());
//		System.out.println(s6.toString());
		
		
		Student[] studentList = new Student[6];
		for(int i=0; i < studentList.length ; i++) {
			studentList[i] = new Student(rnd.nextInt(51)+50,rnd.nextInt(51)+50,
				rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,rnd.nextInt(51)+50,null);
		}
//		studentList[0].name ="김범수"; //name은 private이라 직접 수정 불가능 
		studentList[0].setName("김범수");
		studentList[0].getName();
		
		studentList[0].setKor(100);
		studentList[0].setMath(100);
		studentList[0].setJava(100);
		
		
		
		for(int i =0 ; i< studentList.length ; i++) {
			System.out.println(studentList[i]);
		
		}
	}
}