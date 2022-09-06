package tw.leonchen.oop.exception;

public class CallTestExceptionEx1x1 {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5 };
		
		try {
			for (int i = 0; i <= 6; i++) {
				System.out.println("data[" + i + "]=" + data[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println("e1:" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("e2:" + e);
            e.printStackTrace();
		} catch(Exception e) {
			System.out.println("e3:" + e);
		}

	}

}
