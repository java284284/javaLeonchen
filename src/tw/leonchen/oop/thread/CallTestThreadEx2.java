package tw.leonchen.oop.thread;

class TestThreadEx2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i=" + i + " " + Thread.currentThread().getName());
			// System.out.print("i=" + i + " ");
			// System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);                  //sleep
			} catch (InterruptedException e) {
                e.printStackTrace();
			}
		}
	}

}

public class CallTestThreadEx2 {

	public static void main(String[] args) {
		TestThreadEx2 test1 = new TestThreadEx2();
		TestThreadEx2 test2 = new TestThreadEx2();

		Thread thread1 = new Thread(test1);
		Thread thread2 = new Thread(test2);
		
		thread1.setPriority(Thread.MAX_PRIORITY);      //PRIORITY優先
		thread2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Thread1 Priority:" + thread1.getPriority());
		System.out.println("Thread2 Priority:" + thread2.getPriority());

		thread1.start();
		thread2.start();
		
		try {
			thread1.join(); //join         
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("finished");
	}

}
