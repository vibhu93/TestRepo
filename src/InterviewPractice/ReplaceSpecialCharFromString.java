package InterviewPractice;

public class ReplaceSpecialCharFromString {
	
	public static void main(String[] args) {
		String ac ="vaibhavgawande!$#$@#%!@%";
		System.out.println(ac.replaceAll("[^ a-z A-Z]", ""));
	}
}
