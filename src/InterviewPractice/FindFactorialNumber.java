package InterviewPractice;

public class FindFactorialNumber {

	public static void main(String[] args) {
		factorialNUmber();
	}

	public static void factorialNUmber() {
		int factorialNumber = 5, temp=1;
		for (int i = factorialNumber; i >= 1; i--) {
			temp = temp * i;
		}
		System.out.println(temp);

	}
	
}
