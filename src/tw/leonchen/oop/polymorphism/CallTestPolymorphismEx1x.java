//package tw.leonchen.oop.polymorphism;
//
//import tw.leonchen.oop.inheritance.Animal;
//import tw.leonchen.oop.inheritance.Bird;
//import tw.leonchen.oop.inheritance.Lion;
//
//class Animal {
//	public static void processAction(Animal a) {   //Animal a = lionKing;  Animal a = new Lion();
//		a.eat();                                   //Animal a = new Bird();
//	}
//	
//	public void eat() {
//		System.out.println("eat food.");
//	}
//}
//
//class Lion extends Animal {
//
//	@Override
//	public void eat() {
//        System.out.println("lion eats meat.");
//	}
//
//}
//
//class Bird extends Animal{
//
//	@Override
//	public void eat() {
//        System.out.println("Bird eats seeds.");
//	}
//	
//}
//
//public class CallTestPolymorphismEx1x {
//
//	public static void main(String[] args) {
//		Lion lionKing = new Lion();
//		Animal.processAction(lionKing);
//		Animal.processAction(new Bird());
//		
////        Animal a1 = new Animal();
////        Lion lion = new Lion();        
////        a1 = lion;
//        
////        Animal a1 = new Lion();
////        a1.eat();
////        
////        Animal a2 = new Bird();
////        a2.eat();
//		
////		Animal a;
////		
////		a = new Lion();
////		a.eat();
////		
////		a = new Bird();
////		a.eat();
//	}
//
//}
