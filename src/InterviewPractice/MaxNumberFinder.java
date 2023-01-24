package InterviewPractice;

public class MaxNumberFinder {

	public static void main(String[] args) {

		int[] ac = { 12, 56, 7, 89, 26, 12, 45, 63, 67, 85 };
		int max = 0, min = ac[0];

		for (int i = 0; i <= ac.length - 1; i++) {

			if (max < ac[i]) {
				max = ac[i];
			} else if (min > ac[i]) {
				min = ac[i];
			}
		}
		System.out.println("Max Number is: " + max);
		System.out.println("Min Number is: " + min);
	}

}
