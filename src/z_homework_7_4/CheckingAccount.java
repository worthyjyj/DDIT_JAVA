package z_homework_7_4;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	
	public boolean withdraw(int amount) {
		if(this.balance < amount) {
			protectedBy.withdraw(amount - this.balance);
			this.balance = 0; 
		}else {
			this.balance -= amount;
	
	
	}
	return true; 
	
	
}
}
