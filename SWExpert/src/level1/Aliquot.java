package level1;

import java.util.Scanner;

public class Aliquot {

	// 약수구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}
}
