
public class FactorialNumber {

	public static void main(String[] args) {
		findFactorialNumber();
		findFactorialNumber2();
	}

	// Q Find the factorial number
	public static void findFactorialNumber() {
		int factNumber = 5, temp = 1;
		// 5 =5*5*4*3*2*1;
		for (int i = factNumber; i >= 1; i--) {
			temp = temp * i;
		}
		System.out.println(temp);
	}

	public static void findFactorialNumber2() {
		int factorialOf = 10;
		int temp = 1;

		for (int i = factorialOf; i >= 1; i--) {
			temp = temp * i;
		}
		System.out.println("Factorial of " + factorialOf + " is: " + temp);
	}

}
