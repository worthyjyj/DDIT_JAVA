package e.oop2;

public class SampleChild extends SampleParent {
	String var2;
	
	public void childMethod() {
		//상속받은 변수와 메서드를 사용할 수 있음 
		System.out.println(var);
		System.out.println(methodA(1,2));
	}
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것
	//             재정의하기 위해서는 리턴타입 및 파라미터의 갯수와 종류가 동일히야함
	@Override // 어노테이션 : 클래스, 변수, 메서드 등에 표시해놓은 태그
	public int methodA(int a, int b) {
		return a*b;
	
	}
	
	int var; 
	
	public void testMethod(double var) {
		System.out.println(var); //지역변수 (파라미터)
		System.out.println(this.var); //자식클래스의 전역변수 
		System.out.println(super.var); //부모클래스의 전역변수 
		//super : 부모클래스의 멤버와 자식클래스의 멤버가 이름이 중복될 때 둘을 구분하기위해 사용 
		System.out.println(this.methodA(1, 2));
		System.out.println(super.methodA(1, 2));
	}
	
	public SampleChild() {
    	super("홍길동"); //sampleParent();
//		super();
		//super()를 통해 클래스의 생성자를 호출하고 부모클래스의 인스턴스 변수도 초기화한다. 
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다. 
	}
	
	
	
	public static void main(String[] args) {
	//	SampleChild sc = new SampleChild();
	//	sc.testMethod(1.1);
		
		
		
		//다형성
		//부모타입의 변수로 자식타입의 객체를 사용하는 것
	SampleParent sp = new SampleChild(); // 자식 생성자 호출 
//		SampleParent sp = (SampleParent)(new SampleChild()); 
		System.out.println(sp.methodA(2,3));
//		System.out.println(sp.methodA(2, 3)); //오버라이딩된 자식클래스에 잇는 메소드 실행
//		((SampleChild)(sp)).testMethod(2.2); //?
		
//		SampleParent sp2 = new SampleParent();
//		((SampleChild)(sp2)).testMethod(2.2); //오류
		
//		sc = (SampleChild) new SampleParent(); 
//		sc.testMethod(2.2); 컴파일 오류 
//		//자식이 부모가 될 수는 있어도 부모가 자식이 될 수는 없다.
		
	}	
}
