package stringquestions;

public class MaxNumberFinder {

	public static void main(String[] args) {
		//maxNumberFinder(2, 5, 7, 10, 9, 8);
		//findMaxNumberFromStringArr("8", "5", "1", "6");
		findMaxNumberByRecursion(2, 5, 7, 10, 9, 8);
		System.out.println("Max number found is: " + max);
		
	}

	public static void maxNumberFinder(int... numbers) {
		int max = 0;
		for (int i = 0; i <= numbers.length - 1; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max number found is: " + max);
	}

	public static void findMaxNumberFromStringArr(String... stringNumber) {
		String max = "0";
		for (int i = 0; i <= stringNumber.length - 1; i++) {
			if (Integer.parseInt(stringNumber[i]) > Integer.parseInt(max)) {
				max = stringNumber[i];
			}
		}
		System.out.println("Max number found is: " + max);
	}

	static int max = 0, count = 0;

	public static void findMaxNumberByRecursion(int... numbers) {
		if (numbers[count] > max) {
			max=numbers[count];
			count++;
			findMaxNumberByRecursion(numbers);
		}
	}

}
