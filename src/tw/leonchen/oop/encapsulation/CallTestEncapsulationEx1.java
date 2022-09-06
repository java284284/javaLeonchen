package tw.leonchen.oop.encapsulation;

class TestEncapsulationEx1{
	private int a = 5;
	public int b = 6;
}

public class CallTestEncapsulationEx1 {

	public static void main(String[] args) {
		TestEncapsulationEx1 encap1 = new TestEncapsulationEx1();
		//System.out.println("encap1.a=" + encap1.a);
		System.out.println("encap1.b=" + encap1.b);
	}

}
