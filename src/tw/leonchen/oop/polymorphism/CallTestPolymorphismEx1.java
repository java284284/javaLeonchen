package tw.leonchen.oop.polymorphism;

class Animal {
	public void eat() {
		System.out.println("eat food.");
	}
}

class Lion extends Animal {

	@Override
	public void eat() {
        System.out.println("lion eats meat.");
	}

}

class Bird extends Animal{

	@Override
	public void eat() {
        System.out.println("Bird eats seeds.");
	}
	
}

public class CallTestPolymorphismEx1 {

	public static void main(String[] args) {
//        Animal a1 = new Animal();
//        Lion lion = new Lion();        
//        a1 = lion;
        
//        Animal a1 = new Lion();
//        a1.eat();
//        
//        Animal a2 = new Bird();
//        a2.eat();
		
		Animal a;
		
		a = new Lion();
		a.eat();
		
		a = new Bird();
		a.eat();
	}

}
