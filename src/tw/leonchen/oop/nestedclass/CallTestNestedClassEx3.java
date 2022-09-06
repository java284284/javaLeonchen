package tw.leonchen.oop.nestedclass;

interface Work{
	public void workHard();
	public void efficent();
}

//class Worker implements Work{
//
//	@Override
//	public void workHard() {
//		System.out.println("i can work hard");
//	}
//
//	@Override
//	public void efficent() {
//		System.out.println("i can work efficent");
//	}
//	
//}

public class CallTestNestedClassEx3 {

	public static void main(String[] args) {
//		Worker worker = new Worker();
//		worker.workHard();
//		worker.efficent();
		
		//anonymous nested class
		new Work() {
			@Override
			public void workHard() {
				System.out.println("i can work hard 2");
			}

			@Override
			public void efficent() {
				System.out.println("i can work efficent 2");
			}
		}.workHard();
		
		Work work1 = new Work() {

			@Override
			public void workHard() {
				System.out.println("i can work hard 3");
			}

			@Override
			public void efficent() {
				System.out.println("i can work efficent 3");
			}
			
		};
		
		work1.workHard();
		work1.efficent();
	}

}
