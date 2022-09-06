package tw.leonchen.oop.method;

public class CallTestMethodEx1x {
	
	//instance method
	public void sayHello() {
		System.out.println("hello");
	}
	//
	public void sayGoodBye() {
		System.out.println("adios");
	}

	public static void main(String[] args) {
		CallTestMethodEx1x test1 = new CallTestMethodEx1x();
		test1.sayHello();
		test1.sayGoodBye();
		System.out.println("finished");
	}

}
