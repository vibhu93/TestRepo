package stringquestions;

public class ReverseTheString {

	public static void main(String[] args) {
		reverseStringByRecursion();
		System.out.println();
		reverseString("Vaibhav");
		reverseString2("Vaibhav");
		reverseStringByStringArr("Vaibhav");
		reverseStringStringBuilder("Vaibhav");
		reverseStringStringBuilder("Vaibhav");
	}

	public static void reverseString(String rev) {
		for (int i = rev.length() - 1; i >= 0; i--) {
			System.out.print(rev.charAt(i));
		}
		System.out.println();
	}

	public static void reverseString2(String rev) {
		char[] revCharr = rev.toCharArray();
		for (int i = revCharr.length - 1; i >= 0; i--) {
			System.out.print(revCharr[i]);
		}
		System.out.println();
	}

	public static void reverseStringByStringArr(String rev) {
		String[] stringArr = rev.split("");
		for (int i = stringArr.length - 1; i >= 0; i--) {
			System.out.print(stringArr[i]);
		}
		System.out.println();
	}

	public static void reverseStringStringBuilder(String rev) {
		StringBuilder sb = new StringBuilder(rev);
		System.out.print(sb.reverse());
		System.out.println();
	}

	public static void revreseStringBuffer(String rev) {
		StringBuffer stringbuffer = new StringBuffer(rev);
		System.out.print(stringbuffer.reverse());
		System.out.println();
	}

	static String rev = "Vaibhav";
	static int count = rev.length() - 1;
	public static void reverseStringByRecursion() {
		if (count >= 0) {
			System.out.print(rev.charAt(count));
			count--;
			reverseStringByRecursion();
		}
	}

}
