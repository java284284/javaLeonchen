package tw.leonchen.oop.array;

public class Test1DimArrayEx1 {

	public static void main(String[] args) {
		//int a=1, b=2, c=3;
		
		int[] data = new int[3];
		
        data[0]=1;
        data[1]=2;
        data[2]=3;
        
        
        
        for(int i=0;i<3;i++) {
        	System.out.println("data[" + i + "]=" + data[i]);
        }
	}

}
