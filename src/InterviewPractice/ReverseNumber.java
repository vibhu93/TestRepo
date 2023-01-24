package InterviewPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		reverseNumber(321);
	}

	public static int reverseNumber(int number) {
		while (number > 0) {
			int rev = number % 10;
			System.out.print(rev);
			number = number / 10;
		}
		return number;
	}

}
