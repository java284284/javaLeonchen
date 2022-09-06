package tw.leonchen.oop.array;

public class Test1DimArrayEx1xx {

	public static void main(String[] args) {
		//int a=1, b=2, c=3;
		
		int[] data = new int[3];
		
        data[0]=1;
        data[1]=2;
        //data[2]=3;
        
        System.out.println("Length:" + data.length);
        
        for(int i=0;i<data.length;i++) {
        	System.out.println("data[" + i + "]=" + data[i]);
        }
	}

}
