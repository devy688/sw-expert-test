package level1;

import java.util.Scanner;

public class DivisionValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int a, b;

		int[][] arr = new int[T][3];

		for (int i = 0; i < T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			arr[i][0] = i;
			arr[i][1] = a / b;
			arr[i][2] = a % b;
		}

		for (int i = 0; i < arr.length; i++) {
			// 2차원배열 출력하는 법
			// System.out.println(Arrays.toString(arr[i]));
			System.out.printf("#%d %d %d\n", i + 1, arr[i][1], arr[i][2]);
		}
		
		sc.close();

	}
}
