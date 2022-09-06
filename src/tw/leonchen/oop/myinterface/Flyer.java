package tw.leonchen.oop.myinterface;

public interface Flyer {
    public void takeOff();
    public void fly();
    public void land();
    
    default public void action() {
    	System.out.println("do some actions");
    }
}
