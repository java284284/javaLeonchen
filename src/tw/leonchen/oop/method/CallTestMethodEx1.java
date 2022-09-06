package tw.leonchen.oop.method;

public class CallTestMethodEx1 {
	
	public void sayHello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		CallTestMethodEx1 test1 = new CallTestMethodEx1();
		test1.sayHello();
		System.out.println("finished");
	}

}
