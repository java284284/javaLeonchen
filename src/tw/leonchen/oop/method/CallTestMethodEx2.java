package tw.leonchen.oop.method;

class TestMethodEx2 {
	// instance method
	public void sayHello() {
		System.out.println("hello");
		sayGoodBye();
	}

	// instance method
	public void sayGoodBye() {
		System.out.println("adios");
		// sayHello();
	}
}

public class CallTestMethodEx2 {

	public static void main(String[] args) {
		TestMethodEx2 test2 = new TestMethodEx2();
		test2.sayHello();
		// test1.sayGoodBye();
		System.out.println("finished");
	}

}
