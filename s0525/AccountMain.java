package s0525;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("김태희", 123 456 6789);
		a1.setBalance(8000);
		Account a2 = new Account("배수지", 987 654 4321, 0);
		
		a1.printInfo();
		a2.printInfo();
		
		a1.withdraw(5000);
		a2.deposit(10000);
		a1.deposit(10000);
		a2.withdraw(7000);
		
		a1.printInfo();
		a2.printInfo();
		
		a1.withdraw(5000)
	}

}
