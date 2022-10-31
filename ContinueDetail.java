public class ContinueDetail {
	public static void main(String[] args) {
		
		for(int j = 0; j <= 2; j++) {
			for(int i = 0; i < 10; i++) {
				if(i == 2) {
					continue;
				}
				System.out.println("i=" + i);
			}
		}
	}
}