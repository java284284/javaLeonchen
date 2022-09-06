package tw.leonchen.oop.io;

import java.io.FileReader;
import java.io.IOException;

public class TestFileCharStreamIOEx1 {

	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("c:/temp/test/hello.txt");

		int data;
		while((data = fr1.read())!=-1) {
			System.out.print((char)data);
		}
		
		fr1.close();
	}

}
