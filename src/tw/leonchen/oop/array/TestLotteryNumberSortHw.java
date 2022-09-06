package tw.leonchen.oop.array;

public class TestLotteryNumberSortHw {

	public static void main(String[] args) {
		int[] count = new int[42];
		int[] number = new int[42];
		
		for (int i = 1; i <= 100000; i++) {
			int num = (int) (Math.random() * 42) + 1;
			count[num-1]++;
		}
		
		for(int k=1;k<=42;k++) {
			number[k-1]=k;
		}

		for(int j=0;j<count.length;j++) {
			System.out.println(number[j] + " " + count[j]);
		}
		
		System.out.println("----------------------------------------------------------");
		
		for(int m=0;m<count.length-1;m++) {
			for(int n=m+1;n<count.length;n++) {
				int temp1=0, temp2=0;
				if(count[m]<count[n]) {
					temp1 = count[m];
					count[m] = count[n];
					count[n] = temp1;
					
					temp2 = number[m];
					number[m] = number[n];
					number[n] = temp2;
				}
			}
		}
		
		for(int j=0;j<count.length;j++) {
			System.out.println(number[j] + " " + count[j]);
		}
	}

}
