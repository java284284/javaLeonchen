package tw.leonchen.oop.io;

public class MyResourcesCloseable implements AutoCloseable {
	
	public void processResources() {
		System.out.println("process Resources.");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Resources closed.");
	}

}
