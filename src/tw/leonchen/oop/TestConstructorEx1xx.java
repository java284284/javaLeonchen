package tw.leonchen.oop;

public class TestConstructorEx1xx {
	
	public TestConstructorEx1xx() {
		System.out.println("execute here.");
	}
	
	public TestConstructorEx1xx(int num) {
		System.out.println("num=" + num);
	}

	public static void main(String[] args) {
		TestConstructorEx1xx construct1 = new TestConstructorEx1xx();
		construct1.play();
		
		//anonymous object
		new TestConstructorEx1xx().play();
		
		TestConstructorEx1xx construct2 = new TestConstructorEx1xx(6);
		construct2.play();
		
		new TestConstructorEx1xx(9).play();
		
//		int i=1;
//		i=i+1;
//		System.out.println("i=" + i);
//		System.out.println("1+1=" + (1+1));
	}
	
	public void play() {
		System.out.println("play"); 
	}

}
