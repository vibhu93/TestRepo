package stringquestions;

public class PrintEvenAndOddNumbers {
	
	public static void main(String[] args) {
		evenOddNumberFinder();
	}
	
	public static void evenOddNumberFinder() {
		for(int i =0; i<=20; i++) {
			if(i%2==0) {
				System.err.println("Even Number are :"+ i);
			}else {
				System.out.println("Odd Numbers are: "+ i);
			}
		}
	}

}
