package by.academy.classwork.lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[a-c]*b");
        Matcher matcher = pattern.matcher("cab");
        Matcher matcher1 = pattern.matcher("ccab");
        Matcher matcher2= pattern.matcher("cccab");
        boolean b = matcher.matches();
        boolean a = matcher1.matches();
        boolean c = matcher2.matches();
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
	}

}
