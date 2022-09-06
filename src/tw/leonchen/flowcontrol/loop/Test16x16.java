package tw.leonchen.flowcontrol.loop;

public class Test16x16  {

	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%dx%d=%2d\t", i, j, i * j);
			}
			System.out.println();
		}
		
		for (int j = 1; j <= 16; j++) {
			for (int i = 1; i <= 16; i++) {
				System.out.printf("%2dx%2d=%3d\t", i, j, i * j);
			}
			System.out.println();
		}
	}

}
