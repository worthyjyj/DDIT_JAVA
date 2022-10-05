package e.oop2;

public abstract class SampleAbstractParent {
	public void method() {
		System.out.println("method()");
	}
	
	//추상 메서드 : 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod();
}

class SampleAb extends SampleAbstractParent {

	//추상클래스를 상속받으면 추상클래스 안에 있는 추상 메서드를 
	//반드시 재정의 해야한다. 
	@Override
	void abstractMethod() {
		System.out.println("멍");
		
	}
}
	class SampleAbstractchild extends SampleAbstractParent {
		
		//추상클래스를 상속받으면 추상클래스 안에 있는 추상 메서드를 
		//반드시 재정의 해야한다. 
		@Override
		void abstractMethod() {
			System.out.println("야옹");
			
		}
	
}