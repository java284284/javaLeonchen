package tw.leonchen.oop.io;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestStringIOEx1 {

	public static void main(String[] args) throws IOException {
		String info = "This message is from Tr.Leon";
		byte[] infoValues = info.getBytes();
		
//		ByteArrayInputStream bais1 = new ByteArrayInputStream(infoValues);
//		InputStreamReader isr1 = new InputStreamReader(bais1);
//		BufferedReader br1 = new BufferedReader(isr1);
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(infoValues)));
		
		String data;
		while((data = br1.readLine())!=null) {
			System.out.println(data);
		}
		
		br1.close();	
	}

}
