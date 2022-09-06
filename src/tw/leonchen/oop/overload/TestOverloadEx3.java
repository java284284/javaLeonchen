package tw.leonchen.oop.overload;

public class TestOverloadEx3 {
	
	public TestOverloadEx3() {
		this("john");
		System.out.println("step1");
	}
	
	public TestOverloadEx3(String name) {
		System.out.println("name=" + name);
		System.out.println("step2");
	}
	
	public static void main(String[] args) {
		TestOverloadEx3 overload3 = new TestOverloadEx3();
		overload3.action();
		System.out.println("finished");
	}
	
	public void action() {
		System.out.println("action");
	}

}
