package tw.leonchen.oop.collection;

import java.util.LinkedHashSet;

public class TestLinkedHashSetEx1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedHashSet set1 = new LinkedHashSet();
		set1.add("mary");
		set1.add("john");
		set1.add(6);
		set1.add(6);
		set1.add(3.14);
		System.out.println("set1=" + set1);
		
		System.out.println("size:" + set1.size());
	}

}
