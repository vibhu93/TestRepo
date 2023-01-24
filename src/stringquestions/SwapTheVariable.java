package stringquestions;

public class SwapTheVariable {

	public static void main(String[] args) {
		// swap2Variable();
		//swap2VariableWithThrid();
		swap3VAriable();
		//swap3VariableWithThridVariable();
	}

	static int a = 20;
	static int b = 30;
	static int temp = 0;

	public static void swap2Variable() {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a);
		System.out.println(b);
	}

	public static void swap2VariableWithThrid() {
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}

	public static void swap3VAriable() {
		int x = 10;
		int y = 20;
		int z = 30;
		
		x=x^y^z;
		y=x^y^z;
		z=x^y^z;
		x=x^y^z;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	public static void swap3VariableWithThridVariable() {
		int x = 10;
		int y = 20;
		int z = 30;
		int temVariable =0;
		
		temVariable=x;
		x=y;
		y=z;
		z=temVariable;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	

}
