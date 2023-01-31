package chapter3;

public class BurritoCalculator2 {
	public static int getTip(int budget) {
		int maxDigit = 0;

		while (budget > 0) {
			int digit = budget % 10;
			if (digit > maxDigit) {
				maxDigit = digit;
			}

			budget /= 10;
		}

		return maxDigit * 900;
	}

	public static void main(String[] args) {
		System.out.println(getTip(599));
	}
}
