//package tw.leonchen.oop.inheritance;
//
//class Fish{
//	public void eat() {
//		System.out.println("fish can eat.");
//	}
//}
//
//class Shark extends Fish{
//	@Override
//	public void eat() {
//		System.out.println("i eat meat.");
//	}
//}
//
//class GoldFish extends Fish{
//	private String name = "sweety";
//	private String color = "yellow";
//	
//	public GoldFish(String name, String color) {
//		this.name = name;
//		this.color = color;
//	}
//	
//	public void printResult() {
//		System.out.println("name=" + name);
//		System.out.println("color=" + color);
//	}
//	
//	@Override
//	public void eat() {
//		super.eat();
//		System.out.println("i eat sea weed.");
//	}
//	
////	public static void execute() {
////		super.eat();
////	}
//}
//
//public class CallTestOverrideEx1xxx {
//
//	public static void main(String[] args) {
//		Shark tigerShark = new Shark();
//		tigerShark.eat();
//		
//		GoldFish gf = new GoldFish();
//		gf.eat();
//	}
//
//}
