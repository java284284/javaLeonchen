package tw.leonchen.oop.overload;

public class TestOverloadEx1 {
	
	public void sum(int x1, int y1) {
		System.out.println("x1+y1=" + (x1+y1));
	}
	
	public double sum(double x2, double y2) {
		return (x2+y2);
	}

	public static void main(String[] args) {
		TestOverloadEx1 overload1 = new TestOverloadEx1();
		overload1.sum(2, 5);
		double result = overload1.sum(3.0, 6.25);
		System.out.println("result=" + result);
		
		overload1.sum('A', 'a');
	}

}
