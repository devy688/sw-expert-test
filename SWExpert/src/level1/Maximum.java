package level1;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		int[] arr = new int[10];
		int[] maxNum = new int[T];
		int index = 1;

		for (int test_case = 1; test_case <= T; test_case++) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();

				if (arr[i] > maxNum[test_case - 1]) {
					maxNum[test_case - 1] = arr[i];
				}
			}
		}

		for (int result : maxNum) {
			System.out.printf("#%d %d\n", index, result);
			index++;
		}

		sc.close();
	}
}
