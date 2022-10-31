public class Array05 {
	public static void main(String[] args) {
		int[] arr = {4,-1,9,10,23};
		int[] abc = new int[5];
		for(int i = 0; i < 5; i++) {
			abc[i] = arr[i];
		}
		abc[0] = 88;
		System.out.println(arr[0]);
	}
}