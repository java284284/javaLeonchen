package tw.leonchen.oop.exception;

public class CallTestExceptionEx4 {

	public static void main(String[] args) {
		int statusCode = 6;

		try {
			if (statusCode % 2 == 0) {
				//throw new Exception();
				throw new Exception("system error");
			}else {
				System.out.println("system operates normal.");
			}
		} catch (Exception e) {
			System.out.println("msg:" + e.getMessage());
            e.printStackTrace();
		}

	}

}
