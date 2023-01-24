package InterviewPractice;

public class swapVariable {

	public static void main(String[] args) {
		//swapTwo();
		swapWithThridVariable();
	}

	public static void swapTwo() {
		int a = 10;
		int b = 20;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a);
		System.out.println(b);
	}

	public static void swapWithThridVariable() {
		int a = 10;
		int b = 20;
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);

	}

}
