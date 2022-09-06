package tw.leonchen.oop.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestBufferedCharStreamIOEx1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Please Input Your Name:(use Q or q to exit)");
		
//		InputStream is1 = System.in;
//		InputStreamReader isr1 = new InputStreamReader(is1);
//		BufferedReader br1 = new BufferedReader(isr1);
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); //取代
		
		String data;
		while((data = br1.readLine())!=null) {
			
			if("Q".equalsIgnoreCase(data)) {
				System.out.println("System Exit.");
				break;
			}
			
			System.out.println(data);
		}
		
		br1.close();
//		isr1.close();
//		is1.close();
	}

}
