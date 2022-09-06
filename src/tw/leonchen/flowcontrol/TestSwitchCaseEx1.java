package tw.leonchen.flowcontrol;

public class TestSwitchCaseEx1 {

	public static void main(String[] args) {
		int level = 2;

		switch(level) {
		    case 5:
		    	System.out.println("stick");
		    	break;
		    case 10:
		    	System.out.println("knife");
		    	break;
		    case 25:
		    	System.out.println("sword");
		    	break;
		    case 50:
		    	System.out.println("axe");
		    	break;
		    case 100:
		    	System.out.println("machine gun");
		    	break;
		    default:
		    	System.out.println("hands");
		    	break;
		}
		
		System.out.println("finished");
	}

}
