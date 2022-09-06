package tw.leonchen.flowcontrol;

public class TestSquareRootEx1 {

	public static void main(String[] args) {
		//ax^2+bx+c=0, a,b,c->int , x=?
        int a=1, b=5, c=1;
        int judge = b*b-4*a*c;
        double x1, x2;
        
        System.out.println("judge:" + judge);
        
        if(judge>=0) {
        	System.out.println("real roots");
        	
        	x1 = (-b+Math.sqrt(judge))/2*a;
        	x2 = (-b-Math.sqrt(judge))/2*a;
        	
        	System.out.println("x1:" + x1);
        	System.out.println("x2:" + x2);
        	
        }else {
        	System.out.println("no real roots");
        }
        
        System.out.println("finished");
	}

}
