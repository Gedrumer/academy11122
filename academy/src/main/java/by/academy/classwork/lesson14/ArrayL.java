package by.academy.classwork.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

//1.	�) ������� ������������ ������, ���������� ������� ������ HeavyBox. 
//�) ����������� ��� ���������� ��������� for each. 
//�) �������� ��� ������� ����� �� 1. 
//�) ������� ��������� ����. 
//�) �������� ������ ���������� ����� �� ��������� ����� ��������� � ������� �� �������. 
//�) ������� ��� �����.

public class ArrayL {
	public static void main(String[] args) {
		ArrayList<HeavyBox> list = new ArrayList<HeavyBox>();
		list.add(new HeavyBox(2,1,1,1));
		list.add(new HeavyBox(2,2,2,2));
		list.add(new HeavyBox(3,3,3,3));
		list.add(new HeavyBox(4,4,4,4));
		list.add(new HeavyBox(5,5,5,5));
		for(HeavyBox h:list) {
			System.out.println(h);
		}
		list.set(0,new HeavyBox(1,1,1,1));
		list.get(0).setWeight(1);
		System.out.println("after change"+list);
		list.remove(4);
		System.out.println("after remove"+list);
		
		Object[] objectArray = list.toArray();
		System.out.println(Arrays.toString(objectArray));

	
		HeavyBox[] stringArray1 = new HeavyBox[list.size()];
		list.toArray(stringArray1);
		System.out.println(Arrays.toString(stringArray1));

		
		HeavyBox[] stringArray2 = list.toArray(new HeavyBox[0]);
		System.out.println(Arrays.toString(stringArray2));
		
		
		list.clear();
		System.out.println("after clear"+list);
		
		SortedSet<HeavyBox> treeSet=new TreeSet<HeavyBox>();
		treeSet.add(new HeavyBox(2,1,1,1));
		treeSet.add(new HeavyBox(2,2,1,1));
		treeSet.add(new HeavyBox(2,2,2,1));
		treeSet.add(new HeavyBox(2,2,2,2));
		for(HeavyBox h:treeSet) {
			System.out.println("TREESET "+h);
		}
		
		
		
	}
	

}
