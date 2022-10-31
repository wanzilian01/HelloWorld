import java.util.Scanner;
public class Break01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;
		for(int i =1; i <= 3; i++) {
			System.out.println("请输入姓名");
			name = myScanner.next();
			System.out.println("请输入密码");	
			passwd = myScanner.next();
			chance--;
			if("丁真".equals(name)&&"666".equals(passwd)) {
				System.out.println("恭喜登陆成功");	
				break;
			}else {
				System.out.println("还有" + chance + "次机会");
			}
		}
	}		
}			
	