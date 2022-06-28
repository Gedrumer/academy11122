package by.academy.classwork.lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		// Ќайти все подстроки "Java <X>" и распечатать их.
		String q = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
		Pattern pattern = Pattern.compile("Java\\s*\\d*");
		Matcher matcher = pattern.matcher(q);
		while (matcher.find()) {
			System.out.println(q.substring(matcher.start(), matcher.end()));
		}

	}

}
