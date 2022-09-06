package tw.leonchen.oop.thread;

class Ball implements Runnable {

	private int width = 100;
	private int x = 5;
	private int speedx = 2;

	@Override
	public void run() {
		while (true) {
			x = x + speedx;
			if (x >= width) {                //>100
				System.out.println("stop");
				break;
			}
			System.out.println("x:" + x);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class TestBallMoveEx1 {

	public static void main(String[] args) {
		Ball xBall = new Ball();
		Thread ballThread1 = new Thread(xBall);
		ballThread1.start();
	}

}
