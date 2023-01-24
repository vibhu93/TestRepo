package InterviewPractice;

import java.util.Arrays;

public class ReplaceArrayValue {

	public static void main(String[] args) {
		replaceValue();
	}

	public static void replaceValue() {

		String[] ac = { "Vaibhav", "Jay", "Sandip" };
		ac[2] = "Tushar";
		System.out.println(Arrays.toString(ac));
	}

}
