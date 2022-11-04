package stringquestions;

public class StringJoinner {

	public static void main(String[] args) {
		//soluction2();
		soluction3();
	}

	static String[] ac = { "a", "b", "c" };

	public static void soluction1() {
		String temp = ac[0] + "|" + ac[1] + "|" + ac[2];
		System.out.println(temp);
	}

	public static void soluction2() {
		String newstring = String.join(";", ac);
		System.out.println(newstring);
	}
	
	public static void soluction3() {
		String temp="";
		for(int i =0; i<= ac.length-1; i++) {
				temp +=(String) ac[i]+';';
		}
	}

}
