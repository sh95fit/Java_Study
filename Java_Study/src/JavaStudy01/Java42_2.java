package JavaStudy01;

public class Java42_2 {
	
	private long balance;
	
	public void Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void Withdraw(int money) throws Java42_1 {
		if (balance < money) {
			throw new Java42_1("잔고부족 : " + (money - balance) + " 모자람");
		}
		balance -= money;
	}
}
