package chapter4;

public class CheckingAccount {
	private String name;
	private int balance;

	public CheckingAccount(String inputName, int inputBalance) {
		name = inputName;
		balance = inputBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}