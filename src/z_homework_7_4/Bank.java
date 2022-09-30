package z_homework_7_4;

public class Bank {
	private Customer[] customers; 
	private int numberOfCustomers;
	private int j=0;
		 
	public Bank() {
		this.customers = new Customer[10]; 
	} 
	
	void addCustomer(Customer customer) {
		//인자로 받은 customer를 customers배열에 할당한다. 
		//이 후에 numberOfCustomer의 값을 1 증가시킨다.
//		for(int i=0; i < 1 ; i++) {
//			customers[j] = customer;
			customers[numberOfCustomers++] = customer;
//			j++;
//		}
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	Customer getCustomer(int index) {
		// 배열의 index번째 고객(Customer) 객체 반환
		return customers[index]; 
	}
	
	
}
