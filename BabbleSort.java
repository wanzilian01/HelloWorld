public class BabbleSort {
	public static void main(String[] args) {
		int[] arr = {24,69,80,57,13	};
		//int temp = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}