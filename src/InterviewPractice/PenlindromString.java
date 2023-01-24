package InterviewPractice;

public class PenlindromString {

	public static void main(String[] args) {
		pelindromStringChecker();
	}

	public static void pelindromStringChecker() {
		String srting1 = "madam";
		String rev = "";
		for (int i = srting1.length() - 1; i >= 0; i--) {
			rev += srting1.charAt(i);
		}
		if (rev.equalsIgnoreCase(srting1)) {
			System.out.println("Given String is pelindrom");
		} else {
			System.out.println("Given String is not pelindrom");
		}

	}

}
