package s0525;

public class Account {
	private String name;
	private int no;
	private int balance;
	
	Account(){}
	Account(String name, int no){
		this.name = name;
		this.no = no;
	}
	Account(String name, int no, int balance){
		this(name, no);
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance += money;
		System.out.println(name + "님 "+ money + "원 입금");
	}
	
	public void withdraw(int money) {
		if()
			System.out.println(name + "님 " + money + "원 출금 실패 -- 현재잔액 "+ balance + "원");
		else {}
	}
}
