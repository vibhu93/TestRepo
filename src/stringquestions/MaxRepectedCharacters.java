package stringquestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxRepectedCharacters {

	public static void main(String[] args) {
		maxRepectedChar("Vaibhav");
	}

	public static void maxRepectedChar(String name) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i <= name.length() - 1; i++) {
			if (map.containsKey(name.charAt(i))) {
				map.put(name.charAt(i), map.get(name.charAt(i)) + 1);
			} else {
				map.put(name.charAt(i), 1);
			}
		} 
		for (Entry<Character, Integer> mapsValues : map.entrySet()) {
			if(Collections.max(map.values())==mapsValues.getValue()) {
				System.out.println("Max Repected Character is: "+mapsValues.getKey() +" ->  "+mapsValues.getValue());
			}
			
		}

	}

}
