package stringquestions;

public class ConversionOfDataTypes {

	public static void main(String[] args) {

		// Integer into double
		int number = 1026;
		double converIntoDouble = (double) number;
		System.out.println(converIntoDouble);

		// double to integer
		double number1 = 102.35;
		int convertIntoInt = (int) number1;
		System.out.println(convertIntoInt);

		// convert Number into String
		int number3 = 8789;
		String convertIntoString = String.valueOf(number3);
		System.out.println(convertIntoString);

		// Convert String into number format

		String numberString = "645645";
		int convertIntoNumber = Integer.parseInt(numberString);
		System.out.println(convertIntoNumber);
	}

}
