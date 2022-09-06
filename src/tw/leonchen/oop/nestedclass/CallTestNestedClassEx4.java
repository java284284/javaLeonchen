package tw.leonchen.oop.nestedclass;

public class CallTestNestedClassEx4 {
	
	public static void processAction(Work work) {
		work.workHard();
		work.efficent();
	}

	public static void main(String[] args) {
//      Work work2 = new Work() {
//
//		@Override
//		public void workHard() {
//			System.out.println("workhard");
//		}
//
//		@Override
//		public void efficent() {
//			System.out.println("efficent");
//		}
//		
//      };
//      
//      CallTestNestedClassEx4.processAction(work2);
      
      CallTestNestedClassEx4.processAction(new Work() {

		@Override
		public void workHard() {
			System.out.println("workhard2");
		}

		@Override
		public void efficent() {
			System.out.println("efficent2");
		}
		
      });

	}

}
