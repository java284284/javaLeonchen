package tw.leonchen.flowcontrol.loop;

public class Test9x9TableHw {

	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				if ((i * j) < 10) {
					System.out.print(i + "x" + j + "= " + (i * j) + "\t ");
				} else {
					System.out.print(i + "x" + j + "=" + (i * j) + "\t ");
				}
			}
			System.out.println();
		}
	}

}
