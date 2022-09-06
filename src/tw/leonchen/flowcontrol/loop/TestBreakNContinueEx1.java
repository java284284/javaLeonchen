package tw.leonchen.flowcontrol.loop;

public class TestBreakNContinueEx1 {

	public static void main(String[] args) {		
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println("i=" + i);			
		}
		
		System.out.println("finished");

	}

}
