package tw.leonchen.flowcontrol.loop;

public class TestThrowDiceEx1 {

	public static void main(String[] args) {
		int yourLuckyNumber = 6;

		while (true) {
			
			int diceNumber = (int) (Math.random() * 6) + 1;
			System.out.println("diceNumber:" + diceNumber);

			if (diceNumber == yourLuckyNumber) {
				System.out.println("You Win !!");
				break;
			} else {
				System.out.println("Try Again !!");
			}
			
		}
		
		System.out.println("Enjoy your Life.");

	}

}
