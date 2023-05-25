package s0525;

public class Account1 {
	String name;
	int no, balance;
	
	Account1(){
		System.out.println("====계정====");
	}
	Account1(String name, int no){
		this();
		this.name = name;
		this.no = no;
	}
	Account1(String name, int no, int balance){
		this(name, no);
		this.balance = balance;
	}
	void printInfo() {
		System.out.println("[계좌정보] 예금주: " + name + "계좌정보: "+ no + "잔고: "+balance);
	}
	void inputMoney(int money) {
		balance += money;
		printInfo();
	}
	void outputMoney(int money) {
		if(balance<money) {
			System.out.println("잔고가 부족합니다.");
		}else {
		balance -= money;
		}
		printInfo();
	}
	void printMenu() {
		System.out.println("\n 작업을 선택하세요\n"
				+ "1.입금\n"
				+ "2.출금\n"
				+ "3.잔고조희\n"
				+ "4.종료");
	}
}
