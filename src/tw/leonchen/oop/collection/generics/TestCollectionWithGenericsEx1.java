package tw.leonchen.oop.collection.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class TestCollectionWithGenericsEx1 {

	public static void main(String[] args) {

		LinkedList<HashMap<String, Double>> line = new LinkedList<HashMap<String, Double>>();

		for (int i = 1; i <= 10; i++) {
			HashMap<String, Double> point = new HashMap<String, Double>();
			double x = Math.random() * 1024;
			double y = Math.random() * 764;
			point.put("x", x);
			point.put("y", y);
			System.out.println("point:" + point);

			line.add(point);
		}
		
		System.out.println("line:" + line);
		
		Iterator<HashMap<String, Double>> i1 = line.iterator();
		while(i1.hasNext()) {
			HashMap<String, Double> p = i1.next();
			double px = p.get("x");
			double py = p.get("y");
			System.out.println("(" + px + "," + py + ")");
		}
	}

}
