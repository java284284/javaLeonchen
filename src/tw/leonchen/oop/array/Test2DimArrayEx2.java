package tw.leonchen.oop.array;

public class Test2DimArrayEx2 {

	public static void main(String[] args) {
		//int[] a = new int[3];
		//int[] b = new int[3];

		int[][] data = new int[2][3];
		//a
		data[0][0]=1;
	    data[0][1]=2;
		data[0][2]=3;
		//b
		data[1][0]=4;
		data[1][1]=5;
		data[1][2]=6;
		
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.println("data[" + i + "][" + j + "]=" + data[i][j]);
			}
		}
	}

}
