package InterviewPractice;

import java.util.SortedSet;
import java.util.TreeSet;

public class FibonacciSeries {

	public static void main(String[] args) {
		printFibonacciSeries();
	}

	public static void printFibonacciSeries() {
		int a = 0;
		int b = 1;
		int c;
		for (int i = 0; i <= 10; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

			SortedSet<String> set = new TreeSet<String>();

		}

	}

}
