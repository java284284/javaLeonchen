package tw.leonchen.oop.myinterface;

public class Bird extends Animal implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Bird takes off");

	}

	@Override
	public void fly() {
		System.out.println("Bird flies");

	}

	@Override
	public void land() {
		System.out.println("Bird lands.");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
         System.out.println("Bird eat worms and seed.");
	}

}
