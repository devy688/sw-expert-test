package level1;

import java.util.Scanner;

public class DrawerPassword {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a > b) {
				System.out.println(a - b + 1);
			} else if (a == b) {
				System.out.println("0");
			} else {
				int c = 999 - b;
				System.out.println(c + a + 2);
			}

		}

		sc.close();

		// b에서부터 시작해서 1씩 증가

		// 123 100
		// 150 900 (999 -> 001) 251번

		// 항상 1씩 증가하면서 계산하기 때문에 ( P - K +1 ) 연산을 통해 쉽게 답을 찾을 수 있습니다.
	}
}
