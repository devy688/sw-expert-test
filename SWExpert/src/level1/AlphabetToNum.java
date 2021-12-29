package level1;

import java.util.Scanner;

public class AlphabetToNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alphabet = sc.next();

		char[] array = alphabet.toCharArray();
		int[] arr = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			arr[i] = (int) array[i];
			System.out.print(arr[i] - 64 + " ");
		}
		
		sc.close();
	}
}
