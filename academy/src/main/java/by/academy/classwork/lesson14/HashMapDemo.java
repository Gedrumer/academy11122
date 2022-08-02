package by.academy.classwork.lesson14;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
	Map<String, Double> marks = new HashMap<String, Double>();
	Map<String, Double> marks1 = new HashMap<String, Double>();

	System.out.println(marks.isEmpty());
	marks.put("������", 9.0);
	marks.put("�������", 8.0);
	marks.put("�������", 7.0);

	if (marks.containsKey("������")) {
		Double newValue = (marks.get("������") + 6.0) / 2;
		marks.put("������", newValue);
	} else {
		marks.put("������", 6.0);
	}

	for (String key : marks.keySet()) {
		System.out.println(key);
	}

	for (Double key : marks.values()) {
		System.out.println(key);
	}

	for (String key : marks.keySet()) {
		System.out.println(key + " : " + marks.get(key));
	}
	marks1.putAll(marks);
	System.out.println(marks.isEmpty());
	marks.remove("������");

	for (String key : marks.keySet()) {
		System.out.println(key + " : " + marks.get(key));
	}
//	System.out.println(marks.size());
//
//	System.out.println(marks.get("������"));

//	WrongHashCat cat1 = new WrongHashCat("����");
//	WrongHashCat cat2 = new WrongHashCat("������");
//	WrongHashCat cat3 = new WrongHashCat("������");
//	WrongHashCat cat4 = new WrongHashCat("����");
//	WrongHashCat cat5 = new WrongHashCat("����");
//	WrongHashCat cat6 = new WrongHashCat("����");
//
//	Map<WrongHashCat, Integer> hashMap = new HashMap<>();
//
//	hashMap.put(cat1, 1);
//	hashMap.put(cat2, 2);
//	hashMap.put(cat3, 3);
//	hashMap.put(cat4, 4);
//
////	hashMap.put("������2", 1.0);
////	hashMap.put("������", 123.22);
////	hashMap.put("�������", 1378.00);
//
//	Set<WrongHashCat> keys = hashMap.keySet();
//
//	for (WrongHashCat key : keys) {
//		System.out.print(key + ": ");
//		System.out.println(hashMap.get(key));
//	}
}

}
