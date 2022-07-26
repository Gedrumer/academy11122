package by.academy.classwork.lesson13;

import java.util.ArrayList;
import java.util.List;
public class ArrayListTest {

	public static void main(String[] args) {
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("H");
		arraylist.add("E");
		arraylist.add("L");
		arraylist.add("L");
		arraylist.add("O");
		System.out.println("ArrayList:"+arraylist);
		arraylist.add(2,"O");
		System.out.println("ArrayList:"+arraylist);
		arraylist.set(2,"E");
		System.out.println("ArrayList:"+arraylist);



	}

}
