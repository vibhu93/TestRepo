package stringquestions;

public class OneToHundred {

	public static void main(String[] args) {
		// ontoHundred();
		// oneToHundred();
		hundredToOneByRecursion();
		//oneToHundredByRecursion();
	}

	public static void ontoHundred() {
		// Withount using numbers
		for (int i = 'e' - 'd'; i <= 'd'; i++) {
			System.out.println(i);
		}
	}

	public static void oneToHundred() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	static int i = 'd';

	public static void hundredToOneByRecursion() {
		if (i >= 1) {
			System.out.println(i);
			i--;
			hundredToOneByRecursion();
		}
	}

	static int j = 'e' - 'd';;
	public static void oneToHundredByRecursion() {
		if (j <= 'd') {
			System.out.println(j);
			j++;
			oneToHundredByRecursion();
		}
	}

}
