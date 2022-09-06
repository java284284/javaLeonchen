package tw.leonchen.oop.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCharStreamIOEx2 {

	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("c:/temp/test/hello.txt");
		FileWriter fw1 = new FileWriter("c:/temp/test/result.txt");  //1.

		int data;
		while((data = fr1.read())!=-1) {
			System.out.print((char)data);
			fw1.write(data);  //2.
		}
		
		fw1.close();  //3.
		fr1.close();
	}

}
