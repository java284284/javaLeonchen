package tw.leonchen.flowcontrol;

public class TestSwitchCaseEx2 {

	public static void main(String[] args) {
		Byte level = 1;

		switch (level) {
		case 100:
			System.out.println("machine gun");
			// break;
		case 50:
			System.out.println("axe");
			// break;
		case 25:
			System.out.println("sword");
			// break;
		case 10:
			System.out.println("knife");
			// break;
		case 5:
			System.out.println("stick");
			// break;
		default:
			System.out.println("hands");
			// break;
		}

		System.out.println("finished");
	}

}
