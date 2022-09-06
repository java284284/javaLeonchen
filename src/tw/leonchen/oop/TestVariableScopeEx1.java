package tw.leonchen.oop;

public class TestVariableScopeEx1 {
	//instance variable
	int a=1;
	//static variable
	static int b=2;
	
	//instance method
	public void f1(int c) {  //local variable
		//local variable
		int d=4;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
	}

	public static void main(String[] args) {
		TestVariableScopeEx1 scope = new TestVariableScopeEx1();
		scope.f1(3);
	}

}
