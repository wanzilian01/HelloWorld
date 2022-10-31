public class Zuoye27 {
	public static void main(String[] args) {
//		double sum = 0;
//		for(double i = 1; i <= 100; i++) {
//			if(i%2 != 0) {
//				sum = sum + 1/i;
//			}else {
//				sum = sum - 1/i;
//			}
//		}
//		System.out.println(sum);
		
		
		
		
		
		
				
	
		double sum = 0;
		for(double x = 1; x <=50; x++) {
			double a = 1/(2*x-1);
			double b = -1/(2*x);
			System.out.println(a+b);
			sum += (a + b);
		}
		System.out.println("算式求和=" + sum);
	}
}