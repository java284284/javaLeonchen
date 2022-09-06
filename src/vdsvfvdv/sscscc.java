package vdsvfvdv;

class Singleton{
	private static final Singleton s2 = new Singleton();
	
	private Singleton() {		
	}
	
	public void sayHello() {
		System.out.println("hola");
	}
	
	public static Singleton processAction() {
		return new Singleton();
	}
	
	public static Singleton processAction2() {
		return s2;
	}
}

public class sscscc {

	public static void main(String[] args) {
		Singleton s1 = Singleton.processAction();
		s1.sayHello();
		
		Singleton s3 = Singleton.processAction2();
		s3.sayHello();
	}

}
