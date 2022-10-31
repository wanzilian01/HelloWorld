import java.util.Scanner;

public class Zuoye22 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入任意整数值");
		int i = myScanner.nextInt();
		if(i > 0) {
			System.out.println("i大于0");
		}else if(i < 0) {
			System.out.println("i小于0");
		}else {
			System.out.println("i等于0");
		}
		
	}
}