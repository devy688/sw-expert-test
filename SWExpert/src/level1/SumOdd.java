package level1;

import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] result = new int[t];
		int index = 1;
		
		for(int i=0; i<t; i++) {
			int sum = 0;
			
			for(int j=0; j<10; j++) {
				int[] input = new int[10];
				input[j] = sc.nextInt();
				
				if(input[j] % 2 == 1) {
					sum += input[j];
				}
			}
			
			result[i] = sum;
		}
			
		for(int arr: result) {
			System.out.printf("#%d %d\n", index, arr);
			index++;
		}
		
		sc.close();
	}
}
