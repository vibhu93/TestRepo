package InterviewPractice;

public class SeparateEvenAndOddNumber {
	
	public static void main(String[] args) {
		
		for(int i =1; i<=20; i++) {
			
			if(i % 2==0) {
				System.err.println("Even Number: " +i);
			}else {
				System.out.println("Odd Number: " +i);
			}
		}
	}

}
