package z_homework_7_4;

public class Customer  {

	private String firstName;
	private String lastName;
	private BankAccount[] accounts; //고객소유계좌 
	private int numberOfAccounts;
	
	/**
	 * 생성자
	 * @param balance
	 * @param lastName
	 * @param firstname
	 * @param account
	 */
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5]; 
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts++] = account; 
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts; 
	}

	@Override
	public String toString() {
		return "";
	} 
	
	
	
	

}
