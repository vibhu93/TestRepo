
public class ReplaceSpecialCharFromString {

	public static void main(String[] args) {
		replaceSpeacialChar();
	}

	public static void replaceSpeacialChar() {

		// Write a Java program to display numbers b/w 100-200, whose sum of first and
		// third digit is equal to the middle.
		// Ex:- 121,132,143,165,176

		for (int i = 121; i <= 200; i++) {
			String[] numbers = String.valueOf(i).split("");
//			System.out.println(numbers[0]);
//			System.out.println(numbers[1]);
//			System.out.println(numbers[2]);
			int firstThrid = Integer.parseInt(numbers[0])+Integer.parseInt(numbers[2]);
			int Second = Integer.parseInt(numbers[1]);
			//System.out.println(Second);
			if (Second == firstThrid) {
				System.out.println(i);
			}
		}
	}
}
