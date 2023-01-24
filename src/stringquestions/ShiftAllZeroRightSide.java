package stringquestions;

import java.util.Arrays;

public class ShiftAllZeroRightSide {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(shiftZeroRight()));
		System.out.println(Arrays.toString(shiftZeroLeft()));
	}

	public static int[] shiftZeroRight() {
		int[] ar = { 10, 56, 0, 8, 6, 7, 6, 0, 0, 4, 0 };
		int[] arr1 = new int[ar.length];
		int count = 0;
		for (int a : ar) {
			if (a != 0) {
				arr1[count] = a;
				count++;
			}
		}
		return arr1;
	}

	public static int[] shiftZeroLeft() {
		int[] ar = { 10, 56, 0, 8, 6, 7, 6, 0, 0, 4, 0 };
		int[] arr1 = new int[ar.length];
		int count = ar.length-1;
		for (int ac : ar) {
			if (ac != 0) {
				arr1[count]=ac;
				count--;

			}
		}
		return arr1;
	}

}
