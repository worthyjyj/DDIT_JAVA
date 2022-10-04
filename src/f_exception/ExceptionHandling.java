package f_exception;

import java.util.concurrent.TimeUnit;

import e_oop.ScanUtil;

public class ExceptionHandling {

	/*
	 * 에러 - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄) - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 에러(버그) -
	 * 런타임 에러 : 실행시에 발생되는 에러
	 * 
	 * 런타임 에러 - 런타임 에러 발생 시 발생한 위치에서 프로그램이 비정상적으로 종료된다. 
	 * - 에러 : 프로그램코드에 의해 수습될 수 없는
	 * 심각한 오류(처리 불가) - 예외 : 프로그램코드에 의해 수습될 수 있는 다소 미약한 오류 (처리 가능)
	 * 
	 * 예외 - 모든 예외는 Exception 클래스의 자식 클래스이다. 
	 * - RuntimeException클래스와 그 자식들은 예외처리가 강제되지않는다. 
	 * - (RuntimeException클래스와 그 자식들을 제외한) Exception클래스의 자식들은 예외처리가 강제된다.
	 * 
	 * 예외처리(try-catch) -예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다. 
	 * - try{} catch(Exceptione){} - try 블럭안의 내용을 실행중 예외가 발생하면 catch로 넘어간다. 
	 * - catch의 ()안에는 처리할 예외를 지정해줄 수 있다. 
	 * - 여러종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다. 
	 * - 발생한 예외와 일치하는 catch블럭안의 내용이 수행된 후 try-catch를 빠져나간다. 
	 * - 발생한 예외와 일치하느 catch가 없을 경우 예외는 처리되지 않는다.
	 */

	public static void main(String[] args) {
		int input = ScanUtil.nextInt();
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (NumberFormatException e) {
			System.out.println("타임유닛 에러!");
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.out.println("타임유닛 에러!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			int result = 10/0;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace(); //에러메시지를 출력한다. 
			System.out.println("숫자를 0으로 나눌 수 없습니다.");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace(); //에러메시지를 출력한다. 
		}catch(NullPointerException e) {
			// 아무 조치도 하지 않지만 프로그램이 종료되지 않는다. 
		}catch (Exception e) {
			//예상치 못한 모든 에러 처리
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료!");
		//개발자가원할 때 프로그램을 종료할 수 있음 
	}

}
