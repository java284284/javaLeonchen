package tw.leonchen.flowcontrol.loop;

public class TestThrowDiceEx2 {

	public static void main(String[] args) {
		int yourLuckyNumber = 6;
		int times=0;
		int flag = 3;
 
        int count=0;		
		while (true) {
			count++;
			
			int diceNumber = (int) (Math.random() * 6) + 1;
			//System.out.println("diceNumber:" + diceNumber);

			if (diceNumber == yourLuckyNumber) {
				times++;
				if(times==flag) {
					System.out.println("You Win !!");
					break;
				}				
				
			} else {
				System.out.println("Try Again !!");
			}
			
		}
	    System.out.println("total count:" + count + " try again:" + (count-1));
		System.out.println("Enjoy your Life.");

	}

}
