package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {
	/*
	 * finally
	 * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다. 
	 * - finally는 예외 발생여부와 상관없이 가장 마지막에 수행된다. 
	 * 
	 * 자동 자원 반환(JDK 1.7)
	 * - try(변수 선언; 변수 선언) {} catch(Exception e) {}
	 * - 사용 후 반환이필요한 객체를 try의 ()안에 선언하면 
	 *   try블럭 종료시 자동 반환 
	 */
	public static void main(String[] args) {
		FileInputStream fis= null; // 파일 읽기 준비
		
		try {
			fis =new FileInputStream("d:\\file.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
		}finally {
			System.out.println("finally");
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 에외발생 : try -> catch -> finally
		// 예외없음 : try -> finally
		
		try(FileOutputStream fos = new FileOutputStream("d:\\file.txt")){
			String str = "아무내용이나 써보자!";
			
			byte[] byts = str.getBytes();
			for(int i = 0; i < byts.length ; i++ ) {
				fos.write(byts[i]);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
