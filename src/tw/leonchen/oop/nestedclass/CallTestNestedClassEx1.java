package tw.leonchen.oop.nestedclass;

class A{
	private String info = "nice";
	
	class B{
		public void execute() {
			System.out.println("info:" + info);
		}
	}
	
	public void action() {
		B b1 = new B();
		b1.execute();
	}
	
}

public class CallTestNestedClassEx1 {

	public static void main(String[] args) {
        A a1 = new A();
        a1.action();
        
        A.B b1 = a1.new B();
        b1.execute();
	}

}
