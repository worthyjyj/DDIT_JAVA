package z_homework_7_4;

public class BankAccount {
	protected int balance;
	
//	public BankAccount() {};

	public BankAccount(int balance) { //balance(잔액) 초기화 
		this.balance = balance;
	}

	public int getBalance() { //현재계좌의 잔액 
		return balance;
	} 
	
	void deposit(int amount) { //입금메소드
		balance += amount; 
	}
	
	boolean withdraw(int amount) { //출금메소드
		
		if(amount<=balance) {
			balance -= amount;
			return true;  
		}else 
			return false; 
	}
	
	boolean transfer(int amount, BankAccount account) {
		boolean isSucess = this.withdraw(amount);
		
		if(isSucess) {
			account.deposit(amount);
		}
		return isSucess; 
	}
	
	@Override
	public String toString() {
		return this.balance + ""; //문자열로 만듬
	}
}
