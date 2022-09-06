package tw.leonchen.oop.array;

public class Test1DimArrayEx2 {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

		for (int i = 0; i < data.length; i++) {
			System.out.printf("data[%d]=%d\n", i, data[i]);
		}
		
		//enhanced for(for-each)
		for(int result:data) {
			System.out.println("result:" + result);
		}
	}

}
