package InterviewPractice;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		if (anagramStringChecker()) {
			System.out.println("Given string is anagram");
		} else {
			System.err.println("Given string is not anagram");
		}
	}
	public static boolean anagramStringChecker() {
		String ac = "tea";
		String ac1 = "eat";
		if (ac.length() != ac1.length()) {
			return false;
		} else {
			char[] acArr = ac.toCharArray();
			char[] acArr1 = ac1.toCharArray();
			Arrays.sort(acArr);
			Arrays.sort(acArr1);
			return Arrays.equals(acArr, acArr1);
		}
	}

}
