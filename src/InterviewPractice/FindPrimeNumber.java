package InterviewPractice;

public class FindPrimeNumber {

	public static void main(String[] args) {
		findPrimeNumber();
	}

	public static void findPrimeNumber() {
		int prime = 8;
		int temp = 0;
		for (int i = 2; i <= prime - 1; i++) {
			if (prime % i == 0) {
				temp++;
			}
		}
		if (temp > 0) {
			System.err.println("It's not an prime number");
		} else {
			System.out.println("It's an prime number");
		}
	}
}
