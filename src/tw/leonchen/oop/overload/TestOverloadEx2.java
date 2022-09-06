package tw.leonchen.oop.overload;

public class TestOverloadEx2 {
	
    public void plus(int... data) {
    	int total = 0;
    	for(int i=0;i<data.length;i++) {
    		total = total + data[i];    		
    	}
    	System.out.println("total=" + total);
    }

	public static void main(String[] args) {
		TestOverloadEx2 overload2 = new TestOverloadEx2();
		overload2.plus(1,2,3,4,5,6,7,8,9,10);
		overload2.plus();
	}

}
