package level2;

import java.util.Arrays;
import java.util.Scanner;

public class NumberArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] A = new int[N];
			int[] B = new int[M];
			
			for(int j=0; j<N; j++) {
				A[j] = sc.nextInt();
			}
			
			for(int k=0; k<M; k++) {
				B[k] = sc.nextInt();
			}
		
			int max;
			
			if(N < M) {
				for(int x = 0; x<M-N+1; x++) {
					int sum = 0;
					for(int y=0; y<N; y++) {
						sum += A[y] * B[y];
					}
					System.out.println(sum);
				}
			}
			
			else if(N > M) {
				
			}
			
			else {
				
			}
		}
	}
}
