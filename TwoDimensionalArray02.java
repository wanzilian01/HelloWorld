public class TwoDimensionalArray02 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		for(int i = 0; i < 3; i++) {
			arr[i] = new int[i+1];
			for(int j = 0; j < i+1; j++) {
				arr[i][j] = i + 1;
				System.out.print(arr[i][j] + " ");	
			}
			System.out.println();	
		}
		
		
	}
}