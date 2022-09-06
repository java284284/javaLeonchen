package tw.leonchen.oop.thread;

class TestThreadEx1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("i=" + i);
		}
	}
}

public class CallTestThreadEx1 {

	public static void main(String[] args) {
		TestThreadEx1 thread1 = new TestThreadEx1();
		TestThreadEx1 thread2 = new TestThreadEx1();
		thread2.start();
		thread1.start();
		System.out.println("finished");
	}

}
