package level1;

import java.util.Scanner;

public class NumberComparison {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int a, b;
		String[] arr = new String[T];
		int index = 1;

		for (int i = 0; i < T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			if (a > b) {
				arr[i] = ">";
			} else if (a == b) {
				arr[i] = "=";
			} else {
				arr[i] = "<";
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.printf("#%d %s\n", i+1, arr[i]);
//		}

		for (String result : arr) {
			System.out.printf("#%d %s\n", index, result);
			index++;
		}
		
		sc.close();
	}
}
