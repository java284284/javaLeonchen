package tw.leonchen.oop.method;

public class CallTestMethodEx1xx {
	
	//instance method
	public void sayHello() {
		System.out.println("hello");
		sayGoodBye();
	}
	
	//instance method
	public void sayGoodBye() {
		System.out.println("adios");
		//sayHello();
	}

	public static void main(String[] args) {
		CallTestMethodEx1xx test1 = new CallTestMethodEx1xx();
		test1.sayHello();
		//test1.sayGoodBye();
		System.out.println("finished");
	}

}
