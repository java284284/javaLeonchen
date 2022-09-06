//package tw.leonchen.oop.polymorphism;
//
//class Animal {
//	public static void processAction(Animal a) {   //Animal a = lionKing;  Animal a = new Lion();
//		a.eat();                                   //Animal a = new Bird();
//	    
//		if(a instanceof Lion) {
//	    	Lion l1 = (Lion)a;
//	    	l1.roar();
//	    }
//		
//		if(a instanceof Bird) {
//			Bird b1 = (Bird)a;
//			b1.fly();
//		}
//	}
//	
//	public void eat() {
//		System.out.println("eat food.");
//	}
//}
//
//class Lion extends Animal {
//	@Override
//	public void eat() {
//        System.out.println("lion eats meat.");
//	}
//	
//	public void roar() {
//		System.out.println("lion roars loud.");
//	}
//}
//
//class Bird extends Animal{
//	@Override
//	public void eat() {
//        System.out.println("Bird eats seeds.");
//	}	
//	
//	public void fly() {
//		System.out.println("bird can fly.");
//	}
//}
//
//public class CallTestPolymorphismEx1xxx {
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
