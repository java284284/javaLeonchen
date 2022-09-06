package tw.leonchen.oop.encapsulation;

class TestEncapsulatinSetNGet{
	private String name = "mary";
	private int age = 18;
	private String address = "taiwan";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class CallTestEncapsulationEx2 {

	public static void main(String[] args) {
		TestEncapsulatinSetNGet encap2 = new TestEncapsulatinSetNGet();
		encap2.setName("kitty");
		String resultName = encap2.getName();
		System.out.println("resultName=" + resultName);
	}

}
