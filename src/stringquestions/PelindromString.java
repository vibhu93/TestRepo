package stringquestions;

public class PelindromString {

	public static void main(String[] args) {
		checkPelindromString("madam");
	}

	// Example:- String Name ="madam"
	// If You rever it and then read it then it should sound same as before reverse

	public static void checkPelindromString(String name) {
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev += name.charAt(i);
			System.out.print(name.charAt(i));
		}
		System.out.println();
		if (rev.equals(name)) {
			System.out.println("Given String is Pelindrom String");
		} else {
			System.err.println("Given String is Not Pelindrom String");
		}
	}

}
