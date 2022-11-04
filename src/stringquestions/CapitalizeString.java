package stringquestions;

import java.util.Arrays;

public class CapitalizeString {

	public static void main(String[] args) {

		String ac = "vaibhav ganeshrao gawande";
		String[] newString = ac.split(" ");
		String temp ="";
		for (int i = 0; i <= newString.length - 1; i++) {
			String firstModify= newString[i].substring(0, 1).toUpperCase();
			String secnond =(String) newString[i].subSequence(1, newString[i].length());
			temp+=firstModify+secnond;
		}
		System.out.println(temp);
	}
	
	public void GRCFileAdder() {
		
	}

}
