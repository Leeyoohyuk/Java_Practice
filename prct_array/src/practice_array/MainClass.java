package practice_array;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50, 60};
		int[] array2 = null;
		int[] array3 = null;
		
		System.out.println("Array Length: " + array1.length);
		System.out.println("array1 : "+ Arrays.toString(array1));
		
		// Copy element
		array2 = Arrays.copyOf(array1, array1.length);
		System.out.println("array2 : "+ Arrays.toString(array2));
		
		// Reference
		array3 = array1;
		
		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
		
		int[][] arrmul = new int[3][2];
		
		arrmul[0][0] = 0;
		arrmul[0][1] = 1;
		arrmul[1][0] = 2;
		arrmul[1][1] = 3;
		arrmul[2][0] = 4;
		arrmul[2][1] = 5;
		
		System.out.println("arrmul[0]: "+ Arrays.toString(arrmul[0]));
		System.out.println("arrmul[1]: "+ Arrays.toString(arrmul[1]));
		System.out.println("arrmul[2]: "+ Arrays.toString(arrmul[2]));
	}
}
