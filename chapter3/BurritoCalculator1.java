package chapter3;

public class BurritoCalculator1 {
	public static int getBurritosSold(int lastOrderNumber) {
		int totalBurritosSold = 0;

		for (int i = 0; i <= lastOrderNumber; i++) {
			totalBurritosSold += i;
		}

		return totalBurritosSold;
	}

	public static void main(String[] args) {
		System.out.println(getBurritosSold(548));
	}
}
