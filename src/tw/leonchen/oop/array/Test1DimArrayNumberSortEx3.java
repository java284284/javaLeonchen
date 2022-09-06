package tw.leonchen.oop.array;

import java.util.Arrays;
import java.util.Comparator;

public class Test1DimArrayNumberSortEx3 {

	public static void main(String[] args) {
		Integer[] data = { 5, 12, 7, 9, 26 };
   
		//Arrays.sort(data);
		
		Arrays.sort(data, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		for (int k = 0; k < data.length; k++) {
			System.out.printf("data1[%d]=%d\n", k, data[k]);
		}
	}

}
