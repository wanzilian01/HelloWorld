package chapter4;

public class Bank {
	private CheckingAccount accountOne;
	private CheckingAccount accountTwo;

	public Bank() {
		accountOne = new CheckingAccount("Zeus", 100);
		accountTwo = new CheckingAccount("Hades", 200);
	}

	public static void main(String[] args) {
		Bank bankOfGods = new Bank();
		System.out.println(bankOfGods.accountOne.getName());
		System.out.println(bankOfGods.accountOne.getBalance());
	}

}