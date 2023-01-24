package stringquestions;

public class RevsersTheNumber {

	public static void main(String[] args) {
		// reverseTheNumber();
		// revrseNumber();
		reverseNumberByRecursion();
	}

	public static void reverseTheNumber() {
		int number = 123;
		String stringNumber = String.valueOf(number);
		for (int i = stringNumber.length() - 1; i >= 0; i--) {
			System.out.print(stringNumber.charAt(i));
		}
	}

	public static void revrseNumber() {
		int number = 321;
		while (number > 0) {
			int rev = number % 10;
			System.out.print(rev);
			number = number / 10;
		}
	}

	static int number = 321;
	public static void reverseNumberByRecursion() {
		if (number > 0) {
			int rev = number % 10;
			System.out.println(rev);
			number = number / 10;
			reverseNumberByRecursion();
		}
	}

}
