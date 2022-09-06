package tw.leonchen.common;

import java.io.Console;
import java.util.Arrays;

public class TestConsoleEx1 {

	public static void main(String[] args) {
		Console console = System.console();

		String yourName = console.readLine("Please Input Your Name:");
		String yourAge = console.readLine("Please Input Your Age:");
		String yourAge2 = console.readLine("Please Input Your Age2:");
		char[] yourPwd = console.readPassword("Please Input Your Password:");
		
		console.printf("yourName:%s\n", yourName);
		console.printf("yourAge:%s\n", yourAge);
		console.printf("yourAge:%d\n", Integer.parseInt(yourAge2));
		console.printf("yourPwd:%s\n", Arrays.toString(yourPwd));
	}

}
