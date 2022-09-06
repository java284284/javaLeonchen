package tw.leonchen.oop.array;

public class Test1DimArrayNumberSortEx2 {

	public static void main(String[] args) {
		int[] data = { 5, 12, 7, 9, 26 };

		while (true) {
			int count =0;
			
			for (int i = 0; i < data.length - 1; i++) {
				int temp = 0;
				if (data[i] < data[i + 1]) {
					temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					count++;
				}
			}
			
			if(count==0) {
				break;
			}
		}

		for (int k = 0; k < data.length; k++) {
			System.out.printf("data1[%d]=%d\n", k, data[k]);
		}
	}

}
