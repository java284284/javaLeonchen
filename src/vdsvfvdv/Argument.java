package vdsvfvdv;

public class Argument {

	public static void main(String[] args) {
		Argument a = new Argument();
		int i = 20;

		System.out.println("呼叫方法前 i = " + i);
		a.changePara(i);
		System.out.println("呼叫方法後 i = " + i);
	}
  
	void changePara(int x) {
		System.out.println("...方法參數 x = " + x);
		System.out.println("...修改中");
		x ++;
		System.out.println("...現在參數 x = " + x);
	}
}
