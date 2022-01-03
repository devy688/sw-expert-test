package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome { // 1989. 초심자의 회문 검사

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {

			// 1. My solution
			String words = br.readLine();
			String[] wordsArr = words.split("");
			
			String[] reversed = new String[wordsArr.length];
			int result = 1;

			for (int j = wordsArr.length - 1, k=0; j >= 0; j--,k++) {
				reversed[k] = wordsArr[j];
			}
			
			for (int k = 0; k < wordsArr.length; k++) {
				if (reversed[k].equals(wordsArr[k])) {
					result = 1;
				} else {
					result = 0;
				}
			}
			System.out.printf("#%d %d\n", tc, result);
			
//			2. 다른풀이법			
//			String words = br.readLine();
//			String pel = "";
//			
//			for(int i=words.length()-1; i>=0; i--) {
//				pel += words.substring(i, i+1);
//			}
//			
//			if(words.equals(pel)) System.out.println("#" + tc + " " + 1);
//			else System.out.println("#" + tc + " " + 0);
		}
	}

}
