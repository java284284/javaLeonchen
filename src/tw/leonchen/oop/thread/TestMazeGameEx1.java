package tw.leonchen.oop.thread;

class MazeGame {
	private int x = 0, y = 0;

	// threadA
	public void move(int x, int y) {
		synchronized (this) {
			this.x = x;
			this.y = y;
			System.out.println("x:" + x + " y:" + y);
			this.notify();
		}
	}

	// threadB
	public void checkExit() {
		synchronized (this) {
			try {
				this.wait();
				if (x == 0 && y == 0) {
					System.out.println("Game Exit.");
					System.exit(-1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class Hero implements Runnable {

	private MazeGame mg;

	public Hero(MazeGame mg) {
		this.mg = mg;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep((int) (Math.random() * 500) + 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int x = (int) (Math.random() * 5);
			int y = (int) (Math.random() * 5);

			mg.move(x, y);
		}
	}

}

class RescueRanger implements Runnable {

	private MazeGame mg;

	public RescueRanger(MazeGame mg) {
		this.mg = mg;
	}

	@Override
	public void run() {
		while (true) {
			try {
				mg.checkExit();
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class TestMazeGameEx1 {

	public static void main(String[] args) {
		MazeGame mg = new MazeGame();

		Hero poseidon = new Hero(mg);
		Thread thread1 = new Thread(poseidon);
		thread1.start();
		
		RescueRanger rr1 = new RescueRanger(mg);
		Thread thread2 = new Thread(rr1);
		thread2.start();
	}

}
