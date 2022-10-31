import java.util.Scanner;

public class MulForExercise01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double sum = 0;//单个班级总分
		double total =0;//所有班级总分
		int passNum = 0;//及格人数
		
		for(int i = 1;i <=3;i++) {
			for(int j = 1;j <= 5;j++) {
				System.out.println("请输入第"+i+"个班级的第"+j+"个学生的成绩");
				double score = myScanner.nextDouble();
				if(score >= 60) {
					passNum++;
				}
				System.out.println("成绩为"+ score);
				sum += score;
			}
			System.out.println("该班级的平均分为"+ sum/5);
			total += sum;
		}
		System.out.println("所有班级平均分为"+ total/15);
		System.out.println("及格人数为"+ passNum);
	}
}	
	
	