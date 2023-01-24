package stringquestions;

public class RemoveIndex {

	public static void main(String[] args) {
		System.out.println(removeChar("vaibhavideshmukh"));
		System.out.println(removeChars("vaibhavideshmukh"));
	}

	// String name ="vaibhavideshmukh"
	// Remove Only i from that above String and print remaining char
	// -->vabhavdeshmukh

	public static String removeChar(String name) {
		return name.replaceAll("i", "");
	}

	// Print without using pre-defined method

	public static String removeChars(String name) {
		String ac="";
		for (int i = 0; i <= name.length() - 1; i++) {
			if(name.charAt(i) != 'i') {
				ac+=name.charAt(i);
			}
		}
		return ac;
	}
	
}
