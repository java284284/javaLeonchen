package tw.leonchen.oop;

public class TestStringEx2 {

	public static void main(String[] args) {
		String data = "abcdefghijabcdefghij";
		
		System.out.println("length=" + data.length());
		System.out.println("data.charAt(2)=" + data.charAt(2));
		System.out.println("data.indexOf('de')=" + data.indexOf("de"));
		System.out.println("data.substring(2, 5)=" + data.substring(2, 5));
		System.out.println("data.toUpperCase()=" + data.toUpperCase());
		System.out.println("data.lastIndexOf('de')=" + data.lastIndexOf("de"));
	}

}
