package tw.leonchen.oop.nestedclass;

class C{
	
	private String name = "mary";
	private static int age = 18;
	
	static class D{
		public void execute() {
			//System.out.println("name:" + name);  //compile error
			System.out.println("age:" + age);
		}
	}
			
}

public class CallTestNestedClassEx2 {

	public static void main(String[] args) {
       C.D d1 = new C.D();
       d1.execute();
	}

}
