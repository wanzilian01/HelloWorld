package chapter3;

public class BurritoCalculator3 {
	public static int getReverseBudget(int budget) {
		int reverseBudget = 0;

		while (budget > 0) {
			int digit = budget % 10;
			budget /= 10;
			reverseBudget = (reverseBudget * 10) + digit;
		}

		return reverseBudget;
	}

	public static void main(String[] args) {
		System.out.println(getReverseBudget(374));
	}
}
