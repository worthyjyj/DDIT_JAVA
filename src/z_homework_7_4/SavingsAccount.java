package z_homework_7_4;

public class SavingsAccount extends BankAccount {

	private double interestRate; //이자율 

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	
	public void updateBalance(int period) {
		this.balance += (this.interestRate * period * this.balance); 
	}

}
