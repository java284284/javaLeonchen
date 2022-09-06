package tw.leonchen.oop.inheritance;

class Fish{
	public void eat() {
		System.out.println("fish can eat.");
	}
}

class Shark extends Fish{
	public void eat() {
		System.out.println("i eat meat.");
	}
}

class GoldFish extends Fish{
	public void eat() {
		System.out.println("i eat sea weed.");
	}
}

public class CallTestOverrideEx1 {

	public static void main(String[] args) {
		Shark tigerShark = new Shark();
		tigerShark.eat();
		
		GoldFish gf = new GoldFish();
		gf.eat();
	}

}
