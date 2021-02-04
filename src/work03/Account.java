package work03;

public class Account {
	private String name;
	private int balance;
	
	Account(String name, int balance){
		this.name=name;
		this.balance=balance;
	}
	
	public void deposit(int amount) {
		balance+=amount;
	}
	
	public int withdraw(int amount) {
		if(amount <= balance) {
			balance-=amount;
			return amount;
		}
		return 0;
	}
	
	public int getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}
}
