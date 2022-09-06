package tw.leonchen.flowcontrol;

public class TestIfElseIfEx1 {

	public static void main(String[] args) {
		//0.0<= Math.random():double <1.0
		//(int)(0.0*6)+1<= (int)(Math.random()*6)+1:double <(int)(1.0*6)+1
        //System.out.println("Math.random():" + Math.random());
        //System.out.println("(int)(Math.random()*6)+1:" + ((int)(Math.random()*6)+1));
        
        int diceNumber = (int)(Math.random()*6)+1;
        System.out.println("diceNumber:" + diceNumber);
        
        if(diceNumber==6) {
        	System.out.println("You Win !!");
        }else {
        	System.out.println("Try Again.");
        }
        
        System.out.println("finished");
	}

}
