package tw.leonchen.oop;

class TestStaticMembersEx1{
	static int level = 10;
	
	public static void play() {
		System.out.println("play for fun !!");
	}
}

public class CallTestStaticMembersEx1 {

	public static void main(String[] args) {
		System.out.println("TestStaticMembersEx1.level=" + TestStaticMembersEx1.level);
		TestStaticMembersEx1.play();
	}

}
