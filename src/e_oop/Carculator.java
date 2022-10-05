package e_oop;

public class Carculator {

	public long method1(long a,long b) {
		return a+b;
	}
	
	public long method2(long a,long b) {
		return a*b;
	}
	
	public long method3(long a,long b) {
		return a/b;
	}
	
	public long method4(long a,long b) {
		return a-b;
	}
	
	public long method5(long a,long b) {
		return a%b;
	}
	
	public static void main(String[] args) {
	 Carculator cc = new Carculator();
	 long result = cc.method1(123456,654321);
	 System.out.println(result);
	 result = cc.method2(result,123456);
	 System.out.println(result);
	 result = cc.method3(result,123456);
	 System.out.println(result);
	 result = cc.method4(result,654321);
	 System.out.println(result);
	 result = cc.method5(result,123456);
	 System.out.println(result);
	 
//	 //전역변수를 이용하는 방법 
//	 long a = 123456;
//	 long b = 654321; 
//	 long result = 0; 
	 
//	 Public void method1() {
//		 this.result = this.a + this.b;
//		 System.out.println(this.result);
//	 }
//	 
//	 Public void method2() {
//		 this.result = this.result * this.a;
//		 System.out.println(this.result);
//	 } ....이런식으로! 

	}
}
