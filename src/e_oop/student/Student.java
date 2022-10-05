package e_oop.student;

public class Student {
	//Alt + shift+ a: 세로 줄 혹은 블럭 선택 가능(취소는 단축키 한번 더) 
	
	private int kor, eng, math, social, science, java, oracle;
	private int sum;
	private double avg; 
	private int rank; 
	private String name; 
	
	
	
	
	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
		this.sum = sum();
		this.avg = avg();
	}



	public int getEng() {
		return eng;
	}



	public void setEng(int eng) {
		this.eng = eng;
		this.sum = sum();
		this.avg = avg();
	}



	public int getMath() {
		return math;
	}



	public void setMath(int math) {
		this.math = math;
		this.sum = sum();
		this.avg = avg();
	}



	public int getSocial() {
		return social;
	}



	public void setSocial(int social) {
		this.social = social;
		this.sum = sum();
		this.avg = avg();
	}



	public int getScience() {
		return science;
		
	}



	public void setScience(int science) {
		this.science = science;
		this.sum = sum();
		this.avg = avg();
	}



	public int getJava() {
		return java;
	}



	public void setJava(int java) {
		this.java = java;
		this.sum = sum();
		this.avg = avg();
	}



	public int getOracle() {
		return oracle;
	}



	public void setOracle(int oracle) {
		this.oracle = oracle;
		this.sum = sum();
		this.avg = avg();
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Student(int kor, int eng, int math, int social, int science, int java, int oracle, String name) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.social = social;
		this.science = science;
		this.java = java;
		this.oracle = oracle;
		this.name = name;
		this.sum = sum();
		this.avg = avg();
		this.rank = 1;
	}



	private double avg() {
		return (double)sum/7;
	}



	private int sum() {
		return  kor + eng + math + social + science + java + oracle;
	}



	public String toString() {
		String str = "";
		str = new String().format("%5s\t| %d\t%d\t%d\t%d\t%d\t%d\t%d\t| %d\t%.2f\t%d", 
				name, kor, eng, math, social, science, java, oracle, sum, avg, rank);
		return str;
	}
}
