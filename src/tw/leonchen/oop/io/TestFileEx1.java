package tw.leonchen.oop.io;

import java.io.File;
import java.io.IOException;

public class TestFileEx1 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("c:/temp/test");
        boolean status = file1.exists();
        System.out.println("status:" + status);
        
        if(status) {
        	System.out.println("Directory Exists.");
        	
        	File file2 = new File(file1, "hello.txt");
        	boolean status2 = file2.exists();
        	System.out.println("status2:" + status2);
        	
        	if(status2) {
        		System.out.println("Name:" + file2.getName());
        		System.out.println("Path:" + file2.getPath());
        		System.out.println("Parent:" + file2.getParent());
        		System.out.println("Length:" + file2.length());
        		file2.delete();
        		System.out.println("file deleted");
        	}else {
        		file2.createNewFile();
        		System.out.println("file created");
        	}
        	
        }else {
        	file1.mkdirs();
        	System.out.println("Directory Created");
        }
	}

}
