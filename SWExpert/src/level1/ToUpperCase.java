package level1;

import java.util.Scanner;

public class ToUpperCase {

	public static void main(String[] args) {

		String input= "";
		String output="";
		int tmp;
//		char tmp;
		int limit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		input = sc.nextLine();
		limit = input.getBytes().length;
		
		// input: HELLO WORLD! 
		System.out.println("byte: " + input.getBytes()); // [B@543788f3
		System.out.println("byte: " + input.getBytes().length); // 12
		
		
		if(limit > 80) {
			System.out.println("문자열 최대길이는 80bytes입니다.");
			
		} else {
//			for(int i = 0; i<input.length(); i++) {
//				// The charAt() method returns the character at the specified index in a string.
//				
//				// 1. 내장함수를 사용하지 않는 경우 (int tmp;)
//				tmp = (int)input.charAt(i);
//				if(97 <= tmp && tmp <= 122) {
//					output += (char)(tmp-32);
//				} else {
//					output += (char)tmp;
//				}
//			}
			
			// 2. 내장함수를 사용하는 경우
			
			// 2. for문을 돌리지 않고 바로 내장함수를 사용하는 경우
			System.out.println(input.toUpperCase());
			
		}
				
		sc.close();
	}
}
