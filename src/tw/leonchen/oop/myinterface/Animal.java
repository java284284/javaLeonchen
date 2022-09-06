package tw.leonchen.oop.myinterface;

public abstract class Animal {

	private String name = "nemo";
	
    public Animal() {    	
    }
    
    public abstract void eat();
    
    public void play() {
    	System.out.println("animal play");
    }
}
