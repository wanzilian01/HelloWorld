import java.util.Scanner;
public class ArrayAdd02 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		Scanner myScanner = new Scanner(System.in);
		while(true) {
			int[] arrNew = new int[arr.length + 1];
			for(int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
				
			}
			System.out.println("请输入增加的整数值");
			int addNum = myScanner.nextInt();
			
			arrNew[arrNew.length -1] = addNum;
			arr = arrNew;
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
				
				
			 
			System.out.println("是否继续添加数值（y/n）");
			char key = myScanner.next().charAt(0);
			if(key == 'n') {
				break;
			}
		}
		System.out.println("你退出了添加。。。");
		
	}
}