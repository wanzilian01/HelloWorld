package chapter4;

public class ATM1 {
	public static int totalMoney = 0;
	public static int numATMs = 0;

	public int money;

	public ATM1(int inputMoney){
	    this.money = inputMoney;

	    numATMs += 1;
	    totalMoney += inputMoney;
	  }

	public void withdrawMoney(int amountToWithdraw) {
		if (amountToWithdraw <= this.money) {
			this.money -= amountToWithdraw;
			totalMoney -= amountToWithdraw;
		}
	}

	public static void main(String[] args) {

		System.out.println("Total number of ATMs: " + ATM1.numATMs);
		ATM1 firstATM = new ATM1(1000);
		ATM1 secondATM = new ATM1(500);
		System.out.println("Total number of ATMs: " + ATM1.numATMs);

		System.out.println("Total amount of money in all ATMs: " + ATM1.totalMoney);
		firstATM.withdrawMoney(500);
		secondATM.withdrawMoney(200);
		System.out.println("Total amount of money in all ATMs: " + ATM1.totalMoney);

	}

}