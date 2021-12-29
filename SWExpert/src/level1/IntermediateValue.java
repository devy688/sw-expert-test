package level1;

import java.util.Arrays;
import java.util.Scanner;

public class IntermediateValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] score = new int[num];
		int index = num/2;
		
		for(int i=0; i<num; i++) {
			score[i] = sc.nextInt();
		}
		
		Arrays.sort(score);
		
		System.out.print(score[index]);
		
		sc.close();
	}
}
