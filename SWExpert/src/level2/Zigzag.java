package level2;

import java.util.Scanner;

public class Zigzag {

	public static void main(String[] args) { // 1986. 지그재그 숫자

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int num = sc.nextInt();
			int sum = 0;

			for (int j = 1; j <= num; j++) {
				if (j % 2 != 0) {
					sum += j;
				} else {
					sum -= j;
				}
			}
			
			System.out.printf("#%d %d\n", i, sum);
		}
		
		sc.close();
	}
}
