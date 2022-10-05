package e.oop2;

public class MultiExtends extends ExtendsA {
	//클래스 ExtendsA와 ExtendsB에 있는 메서드를 사용하기 위해 
	//두 클래스를 상속받고 싶다.
	
	public void methodA() {
		super.methodA();
	}
	public void methodB() {
		super.methodB();
	}
}

class ExtendsA extends ExtendsB {
	public void methodA() {}
}

class ExtendsB {
	public void methodB() {}
}