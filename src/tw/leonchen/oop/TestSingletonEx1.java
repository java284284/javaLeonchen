package tw.leonchen.oop;

class Singleton{
	private Singleton() {		
	}
	
	public void sayHello() {
		System.out.println("hola");
	}
	
	public static Singleton processAction() {
		return new Singleton();
	}
}

public class TestSingletonEx1 {

	public static void main(String[] args) {
		Singleton s1 = Singleton.processAction();
		s1.sayHello();
	}

}
