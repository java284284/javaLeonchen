package tw.leonchen.oop.abstractclass;

abstract class Company{
	public abstract void calFuel();
	public abstract void calDistance();
}

class Truck extends Company{

	@Override
	public void calFuel() {
		System.out.println("Truck calculates Fuel");
	}

	@Override
	public void calDistance() {
		System.out.println("Truck calculates Distance");
	}
	
}

class RiverBarge extends Company{

	@Override
	public void calFuel() {
		System.out.println("RiverBarge calculates Fuel");
	}

	@Override
	public void calDistance() {
		System.out.println("RiverBarge calculates Distance");
	}
	
}

public class CallTestAbstractClassesEx1 {

	public static void main(String[] args) {

	}

}
