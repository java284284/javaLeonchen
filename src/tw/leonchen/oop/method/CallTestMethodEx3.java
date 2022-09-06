package tw.leonchen.oop.method;

class Calculator{
	public void plus(int x1, int y1) {
		System.out.println("x1+y1=" + (x1+y1));
	}
}

public class CallTestMethodEx3 {

	public static void main(String[] args) {
		Calculator casio = new Calculator();
		casio.plus(2, 3);
		System.out.println("finished");
	}

}
