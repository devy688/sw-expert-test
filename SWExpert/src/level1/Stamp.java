package level1;

import java.util.Scanner;

public class Stamp {

	public static void main(String[] args) {

		int input;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		if(input <= 100000) {
			for(int i=0; i<input; i++) {
				System.out.print("#");
			}
		} else {
			System.out.println("100,000 이하의 숫자만 가능합니다.");
		}

		sc.close();
	}

}
