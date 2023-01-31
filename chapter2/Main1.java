package chapter2;

public class Main1 {
	public static void main(String[] args) {
		String test1 = "Double";
		double test2 = 5.8;

		boolean isTest1Double = Main1.isDouble(test1);
		boolean isTest2Double = Main1.isDouble(test2);

		System.out.println("test1 is double - " + isTest1Double);
		System.out.println("test2 is double - " + isTest2Double);
	}

	public static <T> boolean isDouble(T object) {
		return object instanceof Double;
	}

}
