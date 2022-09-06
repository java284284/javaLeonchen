package tw.leonchen.oop.myinterface;

public class AirPlane implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("AirPlane takes off.");
	}

	@Override
	public void fly() {
		System.out.println("AirPlane flies.");
	}

	@Override
	public void land() {
		System.out.println("AirPlane lands.");
	}

}
