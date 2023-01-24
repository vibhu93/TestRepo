package InterviewPractice;

public class CalculatePercentageOfUpperAndLowerCaseLatter {

	public static void main(String[] args) {
		calPercentageOfLowerAndUpperCaseLetters();
	}

	public static void calPercentageOfLowerAndUpperCaseLetters() {

		String inputData = "VaibhavGawande123456789298&*(@&#";
		int inputSize = inputData.length();
		System.out.println(inputSize);
		double lowerCase = 0;
		double upperCase = 0;
		double digitCase = 0;
		double specialCase = 0;
		for (int i = 0; i <= inputData.length() - 1; i++) {
			if (Character.isUpperCase(inputData.charAt(i))) {
				upperCase++;
			} else if (Character.isLowerCase(inputData.charAt(i))) {
				lowerCase++;
			} else if (Character.isDigit(inputData.charAt(i))) {
				digitCase++;
			} else {
				specialCase++;
			}
		}
		System.out.println(" Percentage Of Upper Case Letter: " + upperCase / inputSize * 100);
		System.out.println(" Percentage Of Lower Case Letter: " + lowerCase / inputSize * 100);
		System.out.println(" Percentage Of digit Case Letter: " + digitCase / inputSize * 100);
		System.out.println(" Percentage Of special Case Letter: " + specialCase / inputSize * 100);
	}

}
