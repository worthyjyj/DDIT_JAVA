package z_homework_7_3;

public class Customer  {

	private String firstName;
	private String lastName;
	private BankAccount account; //고객소유계좌 
	
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
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return String.format("이름 : %s%s, 잔액 : %, d원", getFirstName(), getLastName(), getAccount().getBalance());
	} 
	
	
	
	

}
