package tw.leonchen.oop;

public class TestStringEx1 {

	public static void main(String[] args) {
		String str1 = "hello";
		//String str
		String str2 = new String("Hello");
		
		System.out.println("(str1==str2)=" + (str1==str2));
		System.out.println("str1.equals(str2)=" + str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2)=" + str1.equalsIgnoreCase(str2));
	}

}
