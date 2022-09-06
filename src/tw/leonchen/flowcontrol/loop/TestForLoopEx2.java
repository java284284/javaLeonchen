package tw.leonchen.flowcontrol.loop;

public class TestForLoopEx2 {

	public static void main(String[] args) {
		// 1+2+...+10
		int sum=0;
		
        for(int i=1;i<=10;i++) {
        	sum = sum + i;   //sum+=i;
        	System.out.println("i=" + i + " sum=" + sum);
        }
        
        System.out.println("total:" + sum);
	}

}
