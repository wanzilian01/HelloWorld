public class Zuoye24 {
	public static void main(String[] args) {
		
		int n = 155;
		int a = n/100;
		int b = n%100/10;
		int c = n%10;
		if(a*a*a + b*b*b + c*c*c == n) {
			System.out.println(n + "是水仙花数");
		}else {
			System.out.println(n + "不是水仙花数");
		}
	}
}