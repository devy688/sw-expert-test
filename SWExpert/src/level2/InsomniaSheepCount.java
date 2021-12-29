package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class InsomniaSheepCount { // 1288. 새로운 불면증 치료법
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int input = sc.nextInt();
			int count = 0;
			ArrayList<String> result = new ArrayList<>();
			
			while(result.size() < 10) {
				count++;
				String countedNum = Integer.toString(input * count);
				String[] strArr = countedNum.split("");

				for (int k = 0; k < strArr.length; k++) {
					if (!result.contains(strArr[k])) {
						result.add(strArr[k]);
					}
				}
			}

			System.out.printf("#%d %d\n", i, input * count);
		}
		sc.close();
	}
}
