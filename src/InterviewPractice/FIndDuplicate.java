package InterviewPractice;

import java.util.HashSet;

public class FIndDuplicate {

	public static void main(String[] args) {
		findDuplicateFromString("vaibhav");
	}

	public static void findDuplicateFromString(String duplicate) {
		HashSet<Character> setValues = new HashSet<Character>();
		for (int i = 0; i <= duplicate.length() - 1; i++) {
			if (setValues.add(duplicate.charAt(i))) {

			}else {
				System.out.println("Duplicate Found: " +duplicate.charAt(i));
			}
		} 
	}

}
