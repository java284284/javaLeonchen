package tw.leonchen.oop.inheritance;

class Parent{
	String name = "john";
	
	public void sayeHello() {
		System.out.println("hello," + name);
	}
	
	public void sayGoodBye() {
		System.out.println("goodbye," + name);
	}
}

class Child extends Parent{
	
	public void play() {
		System.out.println("play game");
	}
	
}

public class CallTestInheritanceEx1 {

	public static void main(String[] args) {
		Child child1 = new Child();
		child1.name = "mike";
		child1.sayeHello();
		child1.sayGoodBye();
		child1.play();
	}

}
