package by.academy.classwork.lesson11;

public class YearTest {

	public static void main(String[] args) {
		Year first = Year.Summer;
		switch (first) {
		case Winter:
			System.out.println("I love Winter!");
			break;
		case Spring:
			System.out.println("I love Spring!");
			break;
		case Summer:
			System.out.println("I love Summer!");
			break;
		case Autumn:
			System.out.println("I love Autumn!");
			break;
			default:
				System.out.println("NOPE!");
		}
		Year[] arr = Year.values();
		for (Year c : arr) {
			System.out.println(c+":"+c.getTemp()+"t.");
			c.getDescription();
		}
		

	}

}
