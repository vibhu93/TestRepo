package stringquestions;

public class PelindronStringChecker {

	public static void main(String[] args) {
		pelindromStringChecker();
	}

	public static void pelindromStringChecker() {
		String pelindromString = "Madam";
		String reverseString = "";
		for (int i = pelindromString.length() - 1; i >= 0; i--) {
			reverseString += pelindromString.charAt(i);
		}
		if (pelindromString.equals(reverseString)) {
			System.out.println("Given String is pelindrom String: " + pelindromString);
		}else {
			System.err.println("Given String is Not pelindrom String: " + pelindromString);
		}
	}
	
}
