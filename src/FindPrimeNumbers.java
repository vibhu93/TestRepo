
public class FindPrimeNumbers {

	public static void main(String[] args) {
		//findPrimeNunber();
		findPrimeNumber(7);
	}

	public static void findPrimeNunber() {
		int primeNumner = 11;
		int temp = 0;
		for (int i = 2; i <= primeNumner - 1; i++) {

			if (primeNumner % i == 0) {
				temp=temp+1;
			}
		}
		if (temp > 0) {
			System.out.println("it'not an prime number");
		} else {
			System.out.println("It's an prime number");
		}
	}

	public static void findPrimeNumber(int prime) {

		int temp = 0;
		for (int i = 2; i <= prime - 1; i++) {
			if (prime % i == 0) {
				temp++;
			}
		}
		
		if (temp > 0) {
			System.out.println("it'not an prime number");
		} else {
			System.out.println("It's an prime number");
		}

	}
}
