package z_homework_7_3;

public class BankTest {
	public static void main(String[] args) {
        Bank bank = new Bank();

        Customer customer1 = new Customer("Tony", "Stark");
        customer1.setAccount(new BankAccount(100000));
        bank.addCustomer(customer1);

        Customer customer2 = new Customer("Peter", "Parker");
        customer2.setAccount(new BankAccount(100));
        bank.addCustomer(customer2);

        Customer customer3 = new Customer("Thor", "Odinson");
        customer3.setAccount(new BankAccount(30000));
        bank.addCustomer(customer3);

        int max = Integer.MIN_VALUE; //최대금액
        int min = Integer.MAX_VALUE; //최소금액
        Customer maxBalanceCustomer = null; //잔고 최대로 많은 사람 일단 널값
        Customer minBalanceCustomer = null; //잔고 최소인 사람 일단 널값 
        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            Customer account = bank.getCustomer(i);
            if (account.getAccount().getBalance() > max) {
                max = account.getAccount().getBalance();
                maxBalanceCustomer = account;
            }
            if (account.getAccount().getBalance() < min) {
                min = account.getAccount().getBalance();
                minBalanceCustomer = account;
            }
        }
        System.out.println("잔고가 가장 많은 사람");
        System.out.println(maxBalanceCustomer);
        System.out.println("잔고가 가장 적은 사람");
        System.out.println(minBalanceCustomer); 
        if (maxBalanceCustomer.getAccount().transfer(max / 2, minBalanceCustomer.getAccount())) {
            System.out.println(maxBalanceCustomer.getFirstName() + "가 " + minBalanceCustomer.getFirstName() + "에게 잔고의 반을 송금");
        } else {
            System.out.println("송금되지 않았습니다.");
        }
        System.out.println("송금 후 모든 고객의 정보");
        for (Customer c : bank.getCustomers()) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }
}

