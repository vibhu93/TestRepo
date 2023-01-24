package InterviewPractice;

public class Print1To100 {

	public static void main(String[] args) {
		oneTo100();
		//oneToHunderd();
		//printOneToHunderdByRecurrsion(1);
	}

	public static void oneTo100() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	public static void oneToHunderd() {
		for (int i = 'b' - 'a'; i <= 'd'; i++) {
			System.out.println(i);
		}
	}
	
	public static void printOneToHunderdByRecurrsion(int i) {
		if(i<=100) {
			System.out.println(i);
			i++;
			printOneToHunderdByRecurrsion(i);
		}
	}

}
