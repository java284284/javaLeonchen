package tw.leonchen.oop;

public class TestConstructorEx1x {
	
	public TestConstructorEx1x() {
		System.out.println("execute here.");
	}
	
	public TestConstructorEx1x(int num) {
		System.out.println("num=" + num);
	}

	public static void main(String[] args) {
		TestConstructorEx1x construct1 = new TestConstructorEx1x();
		construct1.play();
		
		TestConstructorEx1x construct2 = new TestConstructorEx1x(6);
		construct2.play();
	}
	
	public void play() {
		System.out.println("play"); 
	}

}
