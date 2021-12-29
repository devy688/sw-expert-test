package level1;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int value = num;

		for(int i=0; i<=num; i++) {
			System.out.print(value + " ");
			value--;
		}
		
		sc.close();
		
	}

}
