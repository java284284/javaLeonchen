package tw.leonchen.oop.exception;

public class CallTestExceptionEx3 {

	public void divide(int a, int b) throws ArithmeticException, Exception {
		System.out.println("a/b=" + (a / b));
	}

	public static void main(String[] args) {// throws Exception {
		CallTestExceptionEx3 except3 = new CallTestExceptionEx3();
		try {
			except3.divide(5, 0);
		} catch (ArithmeticException e) {
			System.out.println("e1=" + e);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("e2=" + e);
			e.printStackTrace();
		}
	}

}
