package tw.leonchen.common;

public class TestPrintFormatEx1 {

	public static void main(String[] args) {
		String name = "mary";
		int age = 18;
		
		System.out.println("my name is " + name + ", i am " + age + " years old.");
		System.out.printf("my name is %s, i am %d years old.\n", name, age);
		
		System.out.printf("PI:%f\n",3.1415);
		System.out.printf("PI:%.2f\n",3.1415);
		
		System.out.printf("The number is %d.\n",50);
		System.out.printf("The number is %3d.\n",50);
		System.out.printf("The number is %05d.\n",50);
	}

}
