package tw.leonchen.oop;

public class TestStaticBlockEx1 {
	private static boolean status;
	
	static {
		status = true;
		System.out.println("initlize start");
	}

	public static void main(String[] args) {
		System.out.println("status:" + TestStaticBlockEx1.status);
	}

}
