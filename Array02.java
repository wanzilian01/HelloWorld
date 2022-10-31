import java.util.Scanner;
public class Array02 {
	public static void main(String[] args) {
		double[] score = new double[3];
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0; i < score.length ; i++) {
			System.out.println("请输入第" + (i+1) + "个元素的值");
			score[i] = myScanner.nextDouble();
//			System.out.println("第" + (i+1) + "个元素的值" + score[i]);
		}
		for(int i = 0; i < score.length ; i++) {
			
			System.out.println("第" + (i+1) + "个元素的值" + score[i]);
		}	
	}	
}