package level2;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Scanner;

public class Base64Decoder { // 1928. Base64 Decode

	public static void main(String[] args) {
		
		// 1. T가 디코드표에서 몇 번인지 찾기
		// 2. expression을 6bit로 쭉 나열
		// 3. 나열한 6bit를 8문자씩 묶어서 8비트로 
		// 4. 8비트에 해당하는 아스키코드값 찾기
		// 5. 아스키코드에 해당하는 문자열 찾기

		String expression =  "TGlmZSBpdHNlbGYgaXMgYSBxdW90YXRpb24u";
		
		Decoder decode = Base64.getDecoder();
		
		byte[] decodeByte = decode.decode(expression);
		
		String test = new String(decodeByte);
		System.out.println(test);
		
//		for (int i = 0; i < decodeByte.length; i++) {
//			if(0 <= decodeByte[i] && decodeByte[i] < 128) {
//				char character = (char)decodeByte[i];
//				System.out.print(character);
//			}
//		}
		
		
		
		/* 1. 라이브러리를 활용한 방법 */
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		
//		for(int i=0; i<t; i++) {
//			String input = sc.next();
//			
//			Decoder decode = Base64.getDecoder();
//			byte[] decodeByte = decode.decode(input);
//			
//			System.out.printf("#%d %s\n", i+1, new String(decodeByte));
//		}
//		
//		sc.close();
	}
}
