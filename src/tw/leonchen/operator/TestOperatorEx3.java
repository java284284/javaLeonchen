package tw.leonchen.operator;

public class TestOperatorEx3 {

	public static void main(String[] args) {
		int i=1, j=2, k;
        k=(i++)+(++j);
        
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
        
	}

}

