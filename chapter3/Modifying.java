package chapter3;

import java.util.Arrays;

public class Modifying {
	public static void main(String[] args) {
		int[][] intMatrix = { { 1, 1, 1, 1, 1 }, { 2, 4, 6, 8, 0 }, { 9, 8, 7, 6, 5 } };

		intMatrix[1][1] = 0;

		int[][] subMatrix = new int[2][2];

		subMatrix[0][0] = intMatrix[0][0] * 5;
		subMatrix[0][1] = intMatrix[0][1] * 5;
		subMatrix[1][0] = intMatrix[1][0] * 5;
		subMatrix[1][1] = intMatrix[1][1] * 5;

		System.out.println(Arrays.deepToString(subMatrix));
	}
}