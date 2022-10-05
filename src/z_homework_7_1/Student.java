package z_homework_7_1;

public class Student extends Human {
	/**
	 * field
	 */
	private String major;
	
	/**
	 * 생성자
	 */
	Student(String name, int age, String major){
		super(name,age); 
	 this.major = major;	
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() +", 전공 : "+ this.major;
	}
}

