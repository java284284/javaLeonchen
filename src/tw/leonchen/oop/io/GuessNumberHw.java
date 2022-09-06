package tw.leonchen.oop.io;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class GuessNumberHw {

	private ArrayList<Integer> myGuessNumber;
	private LinkedList<Integer> inputNumbers;

	public void generateGuessNumber() {
		LinkedHashSet<Integer> guessNumber = new LinkedHashSet<Integer>();

		while (guessNumber.size() < 4) {
			int num = (int) (Math.random() * 10);
			guessNumber.add(num);
		}

		System.out.println(guessNumber);

		myGuessNumber = new ArrayList<Integer>(guessNumber);
		System.out.println(myGuessNumber);
	}

	public void guessNumber() {
		Scanner s1 = new Scanner(System.in);
		while (s1.hasNextInt()) {
			Integer guess = s1.nextInt();
			char[] numbers = guess.toString().toCharArray(); // 1234%10 -> 4
																// 1234/10 -> 123
			if (numbers.length != 4) {
				System.out.println("請輸入4位整數數字");
				return;
			}

			inputNumbers = new LinkedList<Integer>();
			for (int i = 1; i <= 4; i++) {
				inputNumbers.addFirst(guess % 10);
				guess = guess / 10;
			}

			System.out.println(inputNumbers);

			if(checkResult()) {
				break;
			}
		}
	}   // myGuessNumber: 2531
		// inputNumbers: 3164

	private boolean checkResult() {
		int a = 0, b = 0;
		for (int k = 0; k < myGuessNumber.size(); k++) {
			if (myGuessNumber.contains(inputNumbers.get(k))) {
				if (myGuessNumber.get(k) == inputNumbers.get(k)) {
					a++;
				} else {
					b++;
				}
			}
		}
		System.out.println(a + "A" + b + "B");
		
		if(a==4) {
			System.out.println("You Win !!");
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		GuessNumberHw gn = new GuessNumberHw();
		gn.generateGuessNumber();
		gn.guessNumber();
	}

}
