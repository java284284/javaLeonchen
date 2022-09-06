package vdsvfvdv;

public class yyyyyyy {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5 };
		
		try {
			for (int i = 0; i <= 6; i++) {
				System.out.println("data[" + i + "]=" + data[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("e:" + e);
            e.printStackTrace();
		}

	}

}