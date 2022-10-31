public class Zuoye23 {
	public static void main(String[] args) {
		int year = 2024;
		if(year%4 == 0 && year%100 != 0) {
			System.out.println("该年为闰年");
		}else {
			System.out.println("该年不是闰年");
		}
		
	}

}