package stringquestions;

public class ReplaceSpecialCharFromString {

	public static void main(String[] args) {
		replaceSpecialCharr("vaibhav46456!@#$%^&*()_+");
		compareTwoNumber();
	}

	public static void replaceSpecialCharr(String specialString) {
		System.out.println(specialString.replaceAll("[^A-Z a-z 0-9]", ""));
	}

	public static void compareTwoNumber() {
		int a = 100;
		int b = 100;

		if (a == b) {
			System.out.println("Varibale are same: ");

		}else {
			System.err.println("Varibale are not match");
		}
	}

}
