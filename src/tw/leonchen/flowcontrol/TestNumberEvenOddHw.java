package tw.leonchen.flowcontrol;

public class TestNumberEvenOddHw {

	public static void main(String[] args) {
		int number = -3;
		
		if(number>=0) {
			System.out.println(number + " is positive");
			
			if(number%2==0) {
				System.out.println(number + " is even");
			}else {
				System.out.println(number + " is odd");
			}
		}else {
			System.out.println(number + " is negative");
			
			if(number%2==0) {
				System.out.println(number + " is even");
			}else {
				System.out.println(number + " is odd");
			}
		}

	}

}
