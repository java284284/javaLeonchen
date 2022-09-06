package tw.leonchen.oop.io;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileByteStreamIOEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("c:/temp/test/hello.txt");
		
        int data;
        while((data = fis1.read())!=-1) {
        	System.out.print((char)data);
        }
        
        fis1.close();
	}

}
