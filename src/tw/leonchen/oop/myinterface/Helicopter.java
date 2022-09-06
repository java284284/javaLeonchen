package tw.leonchen.oop.myinterface;

public class Helicopter extends AirPlane {

	@Override
	public void takeOff() {
		System.out.println("helos takes off.");
	}

	@Override
	public void fly() {
		System.out.println("helos flies.");
	}

	@Override
	public void land() {
		System.out.println("helos lands.");
	}

}
