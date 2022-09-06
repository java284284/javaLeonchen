package tw.leonchen.oop.collection;

import java.util.ArrayList;

public class TestArrayListEx1 {

	@SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("mary");
		list1.add("john");
		list1.add(6);
		list1.add(new Integer(6));
		list1.add(3.14);
		System.out.println("list1=" + list1);
		
		System.out.println("size=" + list1.size());
		System.out.println("list1.get(1)=" + list1.get(1));
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
	}

}
