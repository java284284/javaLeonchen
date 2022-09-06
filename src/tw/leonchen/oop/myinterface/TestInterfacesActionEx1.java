package tw.leonchen.oop.myinterface;

public class TestInterfacesActionEx1 {
	
	public void processAction(Flyer f) {  //Flyer f = new AirPlane();
		f.takeOff();                      //Flyer f = new Bird();
		f.fly();
		f.land();
		f.action();
	}

	public static void main(String[] args) {
		TestInterfacesActionEx1 action1 = new TestInterfacesActionEx1();
		action1.processAction(new AirPlane());
		action1.processAction(new Bird());
		action1.processAction(new Helicopter());
	}

}
