package stringquestions;

import java.util.HashSet;

public class DuplicateFinder {

	public static void main(String[] args) {
		// duplicateFinder();
		// Duplicate("vaibhav");
		findDuplicateFromArray("Vaibhav", "Tushar", "Ganesh", "Vaibhav", "Vaibhav");
	}

	public static void duplicateFinder() {
		String ac = "vaibhav";
		HashSet<Character> map = new HashSet<Character>();
		for (int i = 0; i <= ac.length() - 1; i++) {
			if (!map.contains(ac.charAt(i))) {
				map.add(ac.charAt(i));
			} else {
				System.out.println("Duplicate: >>" + ac.charAt(i));
				if (map.contains(ac.charAt(i))) {
					map.remove(ac.charAt(i));
				}
			}
		}
		System.out.println(map);
	}

	public static void Duplicate(String duplicateFinder) {
		HashSet<Character> setMap = new HashSet<Character>();
		for (int i = 0; i <= duplicateFinder.length() - 1; i++) {
			if (!setMap.contains(duplicateFinder.charAt(i))) {
				setMap.add(duplicateFinder.charAt(i));
			} else {
				System.out.println("Found this Duplicates: " + duplicateFinder.charAt(i));
			}
		}
	}

	public static void findDuplicateFromArray(String... ac) {
		HashSet<String> setHash = new HashSet<String>();
		for (int i = 0; i <= ac.length - 1; i++) {
			if (!setHash.contains(ac[i])) {
				setHash.add(ac[i]);
			} else {
				System.out.println("Duplicate Found: " + ac[i]);
			}
		}

	}
}
