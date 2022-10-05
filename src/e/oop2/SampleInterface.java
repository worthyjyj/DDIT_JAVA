package e.oop2;

public interface SampleInterface {
	//인터페이스의 모든 멤버변수(전역변수)는 public static final 제어자를 사용한다. 
	public static final int NUM1 = 1; 
	
	//모든 멤버변수(전역변수)의 제어자가 같기 때문에 생략이 가능하다. 
	int NUM2 = 2; 
	
	// 인터페이스의 모든 메서드는 public abstract 제어자를 사용한다. 
	public abstract void method1(); 
	
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다. 
	void method2(); 

}

interface SampleInterface2{
	void method3();
	void method4(); 
}

interface SampleInterface3{
	void method5(); 
}

class SampleImplement extends SampleAbstractParent implements SampleInterface, SampleInterface2, SampleInterface3  {
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
	}
	
}