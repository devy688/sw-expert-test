package level1;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int value = 1;
		
		int num = sc.nextInt(); // 8
		
		for(int i=0; i<=num; i++) {
			System.out.print(value + " ");
			value *= 2; 
		}
		
		sc.close();
	}
}
