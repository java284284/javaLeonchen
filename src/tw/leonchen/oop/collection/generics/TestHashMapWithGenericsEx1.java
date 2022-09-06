package tw.leonchen.oop.collection.generics;

import java.util.HashMap;

public class TestHashMapWithGenericsEx1 {

	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("name", "julia");
		map1.put("address", "taiwan");
		
		System.out.println("map1:" + map1);
		
		System.out.println("mapping:" + map1.entrySet());
		System.out.println("keys:" + map1.keySet());
		System.out.println("values:" + map1.values());

		System.out.println("name:" + map1.get("name"));
		System.out.println("address:" + map1.get("address"));
	}

}
