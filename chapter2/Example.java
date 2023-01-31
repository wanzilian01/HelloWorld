package chapter2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Example {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("nap time");
		Matcher matcher = pattern.matcher("Every morning starts with some nap time!");
//		boolean findPattern = matcher.find();
		while (matcher.find()) {
			System.out.println(matcher.group(0));
		}

	}
}