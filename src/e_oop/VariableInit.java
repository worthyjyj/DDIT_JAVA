package e_oop;

import java.util.Random;
import java.util.Scanner;

public class VariableInit {
	int _int;
	//명시적 초기화
	int var =10; 
	static int staticVar = 20; 
	
	//초기화 블럭
	{
		var = 20; 
	   staticVar =30; //일반 초기화 블럭에서 초기화할 수 있다. 
	}
	
	static {
		staticVar = 40;
//		var = 30; //스태틱 블럭에서 초기화 할 수 없다 
	}
	
	/*
	 * 생성자
	 * - 클래스와 이름이 같은 메서드
	 * - 인스턴스 변수를 초기화하기 위해 사용한다. 
	 * - 클래스에 생성자는 반드시 하나 이상 존재해야한다. 
	 * - 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다. 
	 * - 생성자는 리턴타입이 없다. 
	 */
	
	VariableInit(){ //기본생성자 
		var = 50; 
		//생성자 사용이유
		// - 초기화에 여러줄의 코드가 필요할 때
		// - 초기화에 파라미터가 필요할 때 
	}
	//오버로딩 : 변수명같은데 파라미터가 다름 
	VariableInit(int var){
		this.var=var; 
		//this : 클래스 자체 
	}
	
	
	public static void main(String[] args) {
	System.out.println(new VariableInit()._int);	
    Random rnd = new Random(); 
    System.out.println(new VariableInit().var);	
    System.out.println(new VariableInit(70).var);	
    
    System.out.println("======================================");
    
    DditClass class405 = new DditClass();
    System.out.println(class405.컴퓨터);
    class405.컴퓨터 = 25; 
    System.out.println(class405.컴퓨터);
    class405.학생 = 25;
    class405.담임 ="조현준";
    
    DditClass class407 = new DditClass();
    class407.컴퓨터 = 25; 
    class407.학생 = 25;
    class407.담임 ="홍길동";
	
    DditClass class408 = new DditClass();
    class408.컴퓨터 = 25; 
    class408.학생 = 25;
    class408.담임 ="이순신";
    
    DditClass class409 = new DditClass();
    class409.담임 = "아이유";
    System.out.println("class409.컴퓨터 : " + class409.컴퓨터);
    
    
    DditClass class410 = new DditClass("유관순");
//    class410.담임 = "유관순";
    System.out.println("class410 담임 : "+ class410.담임);
    
//    Scanner sc = new Scanner(); 
	}
	
}

class DditClass{
	int 컴퓨터; 
	int 학생; 
	String 담임; 
	
	//오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것 
	DditClass(){
		// this : 인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 사용 
//		this.컴퓨터 = 25;
//		this.학생 = 25; 
		this(null);
	}

	DditClass(String 담임){
		this.컴퓨터 = 25;
		this.학생 = 25; 
		this.담임 = 담임; 
	}
}









