package chapter1;

class KoalaCounting {
	public static int largestColumn(int[][] arr2D) {

		int largestColumn = 0;
		int largestLie = 0;
		for (int i = 0; i < arr2D[0].length; i++) {
			int columnSum = 0;
			for (int j = 0; j < arr2D.length; j++) {
				columnSum += arr2D[j][i];
			}
			if (largestColumn < columnSum) {
				largestColumn = columnSum;
				largestLie = i;
			}

		}
		return largestLie;
	}

//	public static int largestColumn(int[][] arr2D) {
//		int largestColumn = 0;
//		int largestNumber = 0;
//		for (int col = 0; col < arr2D[0].length; col++) {
//			int columnVal = 0;
//			for (int row = 0; row < arr2D.length; row++) {
//				columnVal += arr2D[row][col];
//			}
//			if (columnVal > largestNumber) {
//				largestNumber = columnVal;
//				largestColumn = col;
//			}
//		}
//		return largestColumn;
//	}

	public static void main(String[] args) {

		int[][] koalaSpottings = { { 17, 13, 19, 22 }, { 12, 18, 25, 20 }, { 15, 18, 21, 24 }, { 19, 23, 23, 22 },
				{ 18, 20, 21, 26 } };
		System.out.println(largestColumn(koalaSpottings));
	}
}
