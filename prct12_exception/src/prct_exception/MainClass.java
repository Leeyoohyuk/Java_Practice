package prct_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, j;
		ArrayList<String> list= null;
		int[] arr = {0, 1, 2, 3, 4};
		
		System.out.println("Exception Before");
		
		try {
			System.out.println("input i :");
			i = scanner.nextInt();
			System.out.println("input j :");
			j = scanner.nextInt();
			// If exception occur in above line, the next try loop isn't executed
			// It jump to catch loop.
			
			System.out.println("i / j = "+ i/j);
			for(int k = 0; k<5; k++) {
				System.out.println("arr[" + k + "] : " + arr[k]);
			}
			
			System.out.println("list.size : " + list.size());
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("This sentence must be executed regardless of exception occurrence");
		}
		
		System.out.println("Exception After");
	}
}
