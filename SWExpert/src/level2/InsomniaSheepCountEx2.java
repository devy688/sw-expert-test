package level2;

import java.util.Scanner;

public class InsomniaSheepCountEx2 { // 1288. 새로운 불면증 치료법

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int tc = 1; tc <= count; tc++) {
			String A = sc.next();
			int N = Integer.parseInt(A);

			// 확인배열
			boolean[] arr = new boolean[10]; // 배열값은 false로 초기화됨

			// 곱해주는 변수
			int num = 1;

			// 확인배열에 값이 있으면 cnt 1씩 증가
			int cnt = 0;

			while (true) {
				// 값이 있는 경우 인덱스 위치 배열 1씩 증가
				for (int i = 0; i < A.length(); i++) {
					int temp = Integer.parseInt(A.substring(i, i + 1));
					if (arr[temp] == false) {
						arr[temp] = true;
						cnt++;
					}
				}
				if (cnt == 10)
					break;
				else {
					num++;
					A = Integer.toString(num * N);
				}
			}
			System.out.printf("#%d %s\n", tc, A);
		}
	}
}
