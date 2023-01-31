package chapter1;

import java.util.ArrayList;
import java.util.LinkedList;

public class HelloWorld {
	public static void main(String[] args) {
		ArrayList<String> months = new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add(0, "测试");
		months.remove(3);
		System.out.println(months);

		LinkedList<String> days = new LinkedList<String>();
		days.add("Monday");
		days.add("Tuesday");
		days.add(0, "Sunday");
		days.remove(2);
		System.out.println(days);
	}
}