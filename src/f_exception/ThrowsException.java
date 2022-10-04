package f_exception;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class ThrowsException {
	/*
	 * 메서드에 에외 선언하기
	 * - 메서드 호출 시 발생할 수 있는 예외를 선언해줄 수 있다
	 * - 반환타입 method() throws Exception{}
	 * - 메서드의 구현부 끝에 throws 예약어와 예외 클래스명으로 예외를 선언할 수 있다.
	 * - 예외를 선언하면 예외처리를 하지 않고 자식을 호출한 메서드로 예외처리를 미룬다. 
	 */
	
	public static void main(String[] args) {
			 new ThrowsException().start();
	}
	
	private void start() {
		try {
			test();
		} catch (InterruptedException e) {
			System.out.println("오류류류류류류");
		}
	}

	private void test() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		InterruptedException ie = new InterruptedException();
		throw ie; 
	}
	
	
	//미루는 이유? 각각 예외 처리가 다를 수 있으므로?
	//throws를 써서 미룰경우 try catch를 그 전 단계에서 써줘야함 (그메소드를 호출한 다른 메소드들에서 예외처리를 각각 해줄 수 있음)
}
