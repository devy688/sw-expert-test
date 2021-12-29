package level1;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int tmp;
		int sum = 0;
		int output = 0;
		
		int n = Integer.toString(input).length();
		
		sc.close();
		
		for(int i=0; i<n; i++) {
		 sum += input % 10;
		 input /= 10;
		}
		
		System.out.println(sum);

		// 아래 if문안에 for문 넣으면 결과가 제대로 나오지 않는 이유?
		//	if(input <= 1 && input <= 9999) {}
//			String number = String.valueOf(input);
//			String[] digits = number.split("");
//
//			for(int i=0; i<digits.length; i++) {
//				tmp = Integer.parseInt(digits[i]);
//				output += tmp;
//			}
//			
//			System.out.println(output);
		
		sc.close();
		
	}
}
