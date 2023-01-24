package stringquestions;

public class FindUpperCaseAndLowerCaseLatters {

	public static void main(String[] args) {
		lowerAndUpperCasesFinder("Vaibhav");
		withoutPredefineFunction("Vaibhav");
	}

	public static void lowerAndUpperCasesFinder(String ac) {
		for (int i = 0; i <= ac.length() - 1; i++) {
			if (Character.isLowerCase(ac.charAt(i))) {
				System.out.println("Lower Case Latter: " + ac.charAt(i));
			} else if (Character.isUpperCase(ac.charAt(i))) {
				System.err.println("Upper Case Latter: " + ac.charAt(i));
			} else {
				System.out.println("NUmbers Or Special Characters: " + ac.charAt(i));
			}
		}
	}

	public static void withoutPredefineFunction(String ac) {
		int j ='a';
		int count =0;
		for(int i ='A'; i<='Z'; i++) {
			if(i ==ac.charAt(count)) {
				System.err.println("Upper Case Latter: "+ i);
			}else if(j == ac.charAt(count)) {
				System.out.println("Lower Case Latter: "+ j);
			}j++;count++;
			if(count ==ac.length()-1)break; 
		}
	}

}
