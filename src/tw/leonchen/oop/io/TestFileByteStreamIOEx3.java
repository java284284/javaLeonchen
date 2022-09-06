package tw.leonchen.oop.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileByteStreamIOEx3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("c:/temp/test/hello.txt");
		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/dest.txt");  //1.
//		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/dest.txt",true); 		
		
        int data;
        while((data = fis1.read())!=-1) {
        	System.out.print((char)data);
        	fos1.write(data);  //2.
        }
        
        fos1.close();  //3.
        fis1.close();
	}

}
