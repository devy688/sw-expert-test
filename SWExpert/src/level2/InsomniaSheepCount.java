package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Scanner;

public class InsomniaSheepCount { // 1288. 새로운 불면증 치료법
	private static boolean[] isSelected;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			isSelected = new boolean[10];
			int input = Integer.parseInt(br.readLine());
			int num = 0;

			while (true) {
				boolean flag = false;
				int val = input * ++num;
				while (val > 0) {
					isSelected[val % 10] = true;
					val /= 10;
				}
				for (int i = 0; i < isSelected.length; i++) {
					if (!isSelected[i]) {
						flag = true;
						break;
					}
				}
				if (!flag) break;
			}
			System.out.println("#" + tc + " " + num * input);
		}

		/* 1. Scanner를 이용한 방법 */
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//
//		for (int i = 1; i <= t; i++) {
//			int input = sc.nextInt();
//			int count = 0;
//			ArrayList<String> result = new ArrayList<>();
//			
//			while(result.size() < 10) {
//				count++;
//				String countedNum = Integer.toString(input * count);
//				String[] strArr = countedNum.split("");
//
//				for (int k = 0; k < strArr.length; k++) {
//					if (!result.contains(strArr[k])) {
//						result.add(strArr[k]);
//					}
//				}
//			}
//
//			System.out.printf("#%d %d\n", i, input * count);
//		}
//		sc.close();
	}
}
