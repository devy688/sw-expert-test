package level1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. long type 
//		int t = sc.nextInt();
//		long[] result = new long[t];
//		int index = 1;
//		
//		for(int i=0; i<t; i++) {
//			int sum = 0;
//			
//			for(int j=0; j<10; j++) {
//				int[] input = new int[10];
//				input[j] = sc.nextInt();
//				sum += input[j];
//			}
//			result[i] = Math.round((sum)/10.0);
//		}
		
		
		// 2. int type
		int t = sc.nextInt();
		int[] result = new int[t];
		int index = 1;
		
		for(int i=0; i<t; i++) {
			int sum = 0;
			
			for(int j=0; j<10; j++) {
				int[] input = new int[10];
				input[j] = sc.nextInt();
				sum += input[j];
			}
			
			System.out.println(Math.round((sum)/10)); // 28
			System.out.println(Math.round((sum)/10.0)); // 29
			
			result[i] = (int)Math.round((sum)/10.0);
		}
			
		for(int arr: result) {
			System.out.printf("#%d %d\n", index, arr);
			index++;
		}
		sc.close();
	}
}
