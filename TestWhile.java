public class TestWhile {
	public static void main(String[] arg) {
		int x = 10;
		while(x < 20) {
		
			System.out.println("x的值是"	+ x);
			x++;
			if (x == 16) {
				continue;
			}
			System.out.println("\n");
		}
	}
}