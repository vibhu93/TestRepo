package InterviewPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxRepectedChar {

	public static void main(String[] args) {
		maxRepectedChar("vaibhav gawande");
	}

	public static void maxRepectedChar(String stringInput) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i <= stringInput.length() - 1; i++) {
			if (map.containsKey(stringInput.charAt(i))) {
				map.put(stringInput.charAt(i), map.get(stringInput.charAt(i)) + 1);
			} else {
				map.put(stringInput.charAt(i), 1);
			}
		}
		for (Entry<Character, Integer> mapValues : map.entrySet()) {
			if (mapValues.getValue() == Collections.max(map.values())) {
				System.out.println("Max Repeted Char is: " + mapValues.getKey() + " --> " + mapValues.getValue());
			}
		}
	}

}
