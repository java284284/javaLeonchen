package tw.leonchen.oop.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListWithGenericsEx1 {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<String>();
		
		fruit.add("apple");
		fruit.add("pineapple");
		fruit.add("banana");
		fruit.add("grape");
		fruit.add("jackfruit");
		fruit.add("durain");
		
		System.out.println("fruit:" + fruit);
		System.out.println("size:" + fruit.size());
		
		Iterator<String> i1 = fruit.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
