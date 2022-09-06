package tw.leonchen.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestBufferedCharStreamIOEx2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Please Input Your Name:(use Q or q to exit)");
		
//		InputStream is1 = System.in;
//		InputStreamReader isr1 = new InputStreamReader(is1);
//		BufferedReader br1 = new BufferedReader(isr1);
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
//		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/myFile01.txt");
//		OutputStreamWriter osw1 = new OutputStreamWriter(fos1);
//		BufferedWriter bw1 = new BufferedWriter(osw1);
		
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/myFile01.txt")));
		
		String data;
		while((data = br1.readLine())!=null) {
			
			if("Q".equalsIgnoreCase(data)) {
				System.out.println("System Exit.");
				break;
			}
			
			System.out.println(data);
			bw1.write(data);
			bw1.newLine();
			bw1.flush();
		}
		
		bw1.close();
		br1.close();
//		isr1.close();
//		is1.close();
	}

}
