package stringquestions;

import java.util.Arrays;

public class ReplaceParticularValue {

	public static void main(String[] args) {
		// System.out.println(Arrays.toString(replaceValueFromArr("Vaibhav", "Satish",
		// "Nikhil")));
		replaceCharFromString();
	}

	public static String[] replaceValueFromArr(String... stringArr) {
		stringArr[1] = "Sagar";
		return stringArr;
	}

	public static void replaceCharFromString() {
		// Replace 7 and 8 index and print remaing String
		String ac = "qwqewg78wghrjbdx";
		for (int i = 0; i <= ac.length() - 1; i++) {
			if(i==6 || i==7) {
				
			}else {
				System.out.print(ac.charAt(i));
			}
		}
	}
}
