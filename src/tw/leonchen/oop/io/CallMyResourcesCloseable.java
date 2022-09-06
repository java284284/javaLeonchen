package tw.leonchen.oop.io;

public class CallMyResourcesCloseable {

	public static void main(String[] args) {
		try(MyResourcesCloseable resource = new MyResourcesCloseable()){
			resource.processResources();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
