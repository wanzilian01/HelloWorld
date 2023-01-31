package chapter6;

public class Factorial4 {
	public static int recursiveFactorial(int n) {
		if (n > 0) {
			return n * recursiveFactorial(n - 1);
		} else {
			return 1;
		}
	}

	public static int iterativeFactorial(int n) {
		int result = 1;

		while (n > 0) {
			result *= n;
			n -= 1;
		}

		return result;
	}

	public static void main(String[] args) {
		int i = 10;
		int recursiveSolution = recursiveFactorial(i);
		System.out.println("The recursive solution to "+ i + "! is: " + recursiveSolution);

		int iterativeSolution = iterativeFactorial(i);
		System.out.println("The iterative solution to "+ i + "! is: " + iterativeSolution);
	}
}
