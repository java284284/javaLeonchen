package tw.leonchen.oop;

class Car{
	String brand = "ferrari";
	int age = 5;
}

public class TestReferenceEx1 {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.age=" + car1.age);
		System.out.println("car1.brand=" + car1.brand);
		
		Car car2 = new Car();
		System.out.println("car2.age=" + car2.age);
		System.out.println("car2.brand=" + car2.brand);
	}

}
