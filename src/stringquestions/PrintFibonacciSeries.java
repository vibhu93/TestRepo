package stringquestions;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		System.out.print(a + " " + b);
		//fiboncciSeries2();
		fibonacciSeriesByRecursion();
	}

	static int a = 0, b = 1, c;
	public static void fiboncciSeries2() {
		for (int i = 0; i <= 10; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

	static int count = 0;
	public static void fibonacciSeriesByRecursion() {
 		if (count <= 10) {
 			c=a+b;
 			System.out.print(" "+c);
 			a=b;
 			b=c;
 			count++;
 			fibonacciSeriesByRecursion();
		}
	}

}
