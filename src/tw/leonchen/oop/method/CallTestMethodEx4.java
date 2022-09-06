package tw.leonchen.oop.method;

class TestMethodEx4{
	public int f(int x) {
		return 2*x+1;
	}
}

public class CallTestMethodEx4 {

	public static void main(String[] args) {
		TestMethodEx4 test4 = new TestMethodEx4();
		int result = test4.f(5);
		System.out.println("result=" + result);
	}

}
