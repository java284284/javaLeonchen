package tw.leonchen.oop;

public class TestConstructorEx1 {
	
	public TestConstructorEx1() {
		System.out.println("execute here.");
	}

	public static void main(String[] args) {
		TestConstructorEx1 construct1 = new TestConstructorEx1();
		construct1.play();
	}
	
	public void play() {
		System.out.println("play"); 
	}

}
