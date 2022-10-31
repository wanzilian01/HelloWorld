public class Zuoye25 {
	public static void main(String[] args) {
		int y = 0;
		for(int i =1; i < 100; i++) {
			if(i%5 != 0) {
				System.out.print(i + "\t");
				y++;
				if(y%5 == 0) {
				System.out.println();
				}
			}
	
		}
		
	}
}