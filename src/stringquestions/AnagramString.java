package stringquestions;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		if(anagramStringChecker()==true) {
			System.out.println("Given String is Anagram String: ");
		}else {
			System.err.println("Given String is not Anagram String");
		}

	}

	public static boolean anagramStringChecker() {
		String string1 = "tea";
		String string2 = "eat";
		char[] arr1 = string1.toLowerCase().toCharArray();
		char[] arr2 = string2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(arr1.length != arr2.length) {
			return false;
		}else {
			return Arrays.equals(arr1, arr2); 
		}
		
	}

}
