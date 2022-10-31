import java.util.Scanner;
public class IfElse01 {
	public static void main(String[] args) {

		int price = 60;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份(1~12)");
		int month =scanner.nextInt();
		
		
		if(3 < month && month< 11) {
			System.out.println("请输入年龄");
			int year =scanner.nextInt();
			if(0<year&&year<18) {
				System.out.println("你的票价是" + price/2);
			}else if(18<=year&&year<=60) {
				System.out.println("你的票价是" + price);
			}else if(year>60){
				System.out.println("你的票价是" + price/3);
			}else {
				System.out.println("你的年龄错误，请重新输入");
			}
			
		}else 		{
			System.out.println("请输入年龄");
				int year =scanner.nextInt();
				
				if(18<=year&&year<=60) {
					System.out.println("你的票价是" + (price-20));
				}else {
					System.out.println("你的票价是" + 20);
			
		}
		}
	}
}
	
