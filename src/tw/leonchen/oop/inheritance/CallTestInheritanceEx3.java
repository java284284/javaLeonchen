package tw.leonchen.oop.inheritance;

class Insect{
	String name = "insect";
	
	public Insect() {		
	}
	
	public Insect(String name) {
		this.name = name;
	}
	
	public void bite() {
		System.out.println(name + " can bite.");
	}
}

class LadyBug extends Insect{
	public LadyBug() {
		//super();
		super("ladybug");
	}
}

public class CallTestInheritanceEx3 {

	public static void main(String[] args) {
		LadyBug spot = new LadyBug();
		spot.bite();
	}

}
