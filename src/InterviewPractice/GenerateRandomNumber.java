package InterviewPractice;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// System.out.println(genrateRandomNunber());
		// System.out.println(unquieNumberGenerator("5"));
		System.out.println(unquieNumberGen(19));
	}

	public static int genrateRandomNunber() {
		Random randomNumber = new Random();
		return randomNumber.nextInt(456321789);
	}

	public static long unquieNumberGen(int number) {
		String max = "1";
		String min = "9";
		int count = 1;
		for (int i = 1; i < number; i++) {
			if (i > 10) {
				max += count;
				min += count;
			} else {
				max += count;
				min += count;
			}
		}
		return (long) (Math.random() * (Long.parseLong(max) - Long.parseLong(min) + 1) + Long.parseLong(min));
	}

}
