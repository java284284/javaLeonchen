package tw.leonchen.oop.collection;

import java.util.HashMap;
import java.util.Set;

public class TestHashMapEx1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		
		map1.put("1st", "john");
		map1.put("2nd", "louis");
		map1.put("3rd", "judy");
		map1.put("3rd", "janet");
		
		Set keys = map1.keySet();
		System.out.println("keys:" + keys);
		
		for(Object key:keys) {
			System.out.println("key:" + key);
		}
	}

}
