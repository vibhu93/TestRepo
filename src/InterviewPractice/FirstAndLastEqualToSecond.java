package InterviewPractice;

public class FirstAndLastEqualToSecond {

	public static void main(String[] args) {
		numberAddtionFirstAndLast();
	}

//	Write a Java program to display numbers b/w 100-200, whose sum of first and third digit is equal to the middle. 
//	Ex:- 121,132,143,165,176
	public static void numberAddtionFirstAndLast() {
		for (int i = 100; i <= 200; i++) {
			String[] numbers = String.valueOf(i).split("");
			if (Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[2]) == Integer.parseInt(numbers[1])) {
				System.out.println(i);
			}
		}
	}
}
