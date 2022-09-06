package tw.leonchen.flowcontrol;

public class TestNestedIfEx1 {

	public static void main(String[] args) {
		int num = 66;
		
		if(num>=5) {			
			System.out.println("step 1");
			
			if(num<=20) {
				System.out.println("step 2");
				System.out.println("num:" + num);
			}
			
			System.out.println("step 3");
		}
		
        System.out.println("finished");
	}

}
