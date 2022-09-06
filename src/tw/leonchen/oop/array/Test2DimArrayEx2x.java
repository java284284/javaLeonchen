package tw.leonchen.oop.array;

public class Test2DimArrayEx2x {

	public static void main(String[] args) {
		// int[][] data = new int[2][3];
		int[][] data = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int[] num : data) {
			for (int value : num) {
                System.out.println("value=" + value);
			}
		}

	}

}
