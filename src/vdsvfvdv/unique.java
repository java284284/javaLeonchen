package vdsvfvdv;

class Test{
	int x = 3;	


  void show() {
	System.out.println("x = " + x);
  }
}
public class unique {

	public static void main(String[] args) {
      Test a,b,c;
      
      a = new Test ();
      b = new Test ();
      System.out.println("a == b ?" + (a == b));

      c = b;
      c.x = 10;
      System.out.println("c == b ?" + (c == b));
      System.out.print(  "a.");		
      a.show();
      System.out.print("b.");		
      b.show();
      System.out.print("c.");		
      c.show();
	}

}
