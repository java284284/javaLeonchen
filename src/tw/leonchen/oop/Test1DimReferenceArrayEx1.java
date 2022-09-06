package tw.leonchen.oop;

public class Test1DimReferenceArrayEx1 {

	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = "mary";
	    names[1] = "john";
	    names[2] = "judy";
	    
	    for(String name:names) {
	    	System.out.println("name=" + name);
	    }
	}

}
