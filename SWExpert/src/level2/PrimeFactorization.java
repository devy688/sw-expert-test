package level2;

import java.util.Scanner;

public class PrimeFactorization { // 1945. 소인수분해

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int num = sc.nextInt();
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			
			while(num % 2 == 0) {
				a++;
				num /= 2;
			}
			
			while(num % 3 == 0) {
				b++;
				num /= 3;
			}
			
			while(num % 5 == 0) {
				c++;
				num /= 5;
			}
			
			while(num % 7 == 0) {
				d++;
				num /= 7;
			}
			
			while(num % 11 == 0) {
				e++;
				num /= 11;
			}
			
			System.out.printf("#%d %d %d %d %d %d\n", i+1, a, b,c,d,e);
		}
		sc.close();
	}
}
