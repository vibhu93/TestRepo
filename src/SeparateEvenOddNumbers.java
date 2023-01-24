
public class SeparateEvenOddNumbers {

	public static void main(String... args) {
		separarteEvenAndOddNumber(10, 8, 6, 3, 13, 14, 15, 17, 21);
	}

	public static void separarteEvenAndOddNumber(int... numbers) {
		for (int i = 0; i <= numbers.length - 1; i++) {
			if (numbers[i] % 2 == 0) {
				System.err.println("Even Numbers: " + numbers[i]);
			} else {
				System.out.println("Odd Number: " + numbers[i]);
			}

		}
	}

}
