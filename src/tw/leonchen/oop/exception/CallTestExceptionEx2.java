package tw.leonchen.oop.exception;

public class CallTestExceptionEx2 {

	public static void main(String[] args) {
		int a = 6, b = 2;
		
		try {
			System.out.println("a/b=" + (a / b));
		} catch (ArithmeticException e) {
			System.out.println("e=" + e);
		}finally {
			System.out.println("always execute here.");
		}

	}

}
