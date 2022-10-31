import java.util.Scanner;
public class SeqSearch {
	public static void main(String[] args) {
		String[] names = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String findName = myScanner.next();
		//boolean b = false;
		for(int i = 0; i < names.length ; i++) {
			if(findName.equals(names[i])) {
				System.out.println("找到了对应名称：" + names[i]);
				//b = true;
				return;
			}
		}
	
			System.out.println("没有找到对应名称" );
			
	}
}