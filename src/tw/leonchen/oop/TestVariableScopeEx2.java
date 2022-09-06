package tw.leonchen.oop;

public class TestVariableScopeEx2 {
	static int num = 3;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		TestVariableScopeEx2.num = 5;
		System.out.println("TestVariableScopeEx2.num=" + TestVariableScopeEx2.num);

		TestVariableScopeEx2 scope2 = new TestVariableScopeEx2();
		// System.out.println("scope2.num=" + scope2.num);
		System.out.println("TestVariableScopeEx2.num=" + TestVariableScopeEx2.num);
		System.out.println("num=" + num);
	}

}
