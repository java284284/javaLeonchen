package tw.leonchen.oop;

class Person {
	String name = "john";
	int age = 25;
	String phone = "0987654321";

	@Override
	public boolean equals(Object obj) {
		if (this.age == ((Person) obj).age) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "hi,mary";
	}

}

public class TestObjectEx1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		p2.age = 18;
		
		System.out.println(p1.equals(p2));
		System.out.println(p1);
		System.out.println(p1.toString());
	}

}
