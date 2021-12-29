package level1;

import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		result(a,b);
		
	}
	
	public static void result(int a, int b) {
		// 가위 1, 바위 2, 보 3
		
		
//		if(a == 1) {
//			if(b == 2) {
//				System.out.println("B");
//			} else if (b == 3) {
//				System.out.println("A");
//			}
//		} else if (a == 2) {
//			if(b == 1) {
//				System.out.println("A");
//			} else if (b == 3) {
//				System.out.println("B");
//			}
//		} else if(a == 3) {
//			if(b == 1) {
//				System.out.println("B");
//			} else if (b == 2) {
//				System.out.println("A");
//			}
//		}
		
		if(a - b == 1 || a - b == -2) {
			System.out.println("A");
		} else if (a - b == -1 || a - b == 2) {
			System.out.println("B");
		}
		
		// 1  3 => A   1 - 3 = -2
		// 2  1 => A   2 - 1 = 1
		// 3  2 => A   3 - 2 = 1
		
		// 1  2 => B   1 - 2 = -1
		// 2  3 => B   2 - 3 = -1
		// 3  1 => B   3 - 1 = 2
		
	}
}
