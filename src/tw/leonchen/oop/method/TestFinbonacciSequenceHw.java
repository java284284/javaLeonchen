package tw.leonchen.oop.method;

public class TestFinbonacciSequenceHw {

	public long f(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return f(n - 1) + f(n - 2);
	}

	public static void main(String[] args) {
		TestFinbonacciSequenceHw fibo = new TestFinbonacciSequenceHw();
		for (int i = 0; i <= 47; i++) {
			System.out.println(fibo.f(i));
		}
	}

}
