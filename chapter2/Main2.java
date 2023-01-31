package chapter2;

public class Main2 {
	public static void main(String[] args) {
		Container raw1 = new Container("My String"); 

		String s1 = (String) raw1.getData(); 
		System.out.println("s1 is: " + s1);

	

		Container<String> stringContainer = new Container<>("Not raw");
		Container raw2 = stringContainer;

		raw2.setData("new string");
		System.out.println("s2 is: " + raw2.getData());
	}
}