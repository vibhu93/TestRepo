package InterviewPractice;

import java.util.HashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		removeDuplicate("vaibhav");
	}

	public static void removeDuplicate(String duplicate) {
		HashSet<Character> setValues = new HashSet<Character>();
		for (int i = 0; i <= duplicate.length() - 1; i++) {
			if(setValues.add(duplicate.charAt(i))) {
			}
		}
		System.out.println(setValues);
	}
}
