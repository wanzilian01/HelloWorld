public class Zuoye21 {
	public static void main(String[] args) {
		double cash = 100000;
		int i = 0;
		while(50000<cash) {
			cash = cash - cash*5/100;
			i++;
			
		}
		System.out.println("i=" + i);System.out.println("cash=" + cash);
		
		while(cash <=50000) {
			cash -= 1000;
			i++;
			if(cash < 1000) {
				break;
			}
		}
		System.out.println("经过的路口次数为" + i);System.out.println("cash=" + cash);
	}
}