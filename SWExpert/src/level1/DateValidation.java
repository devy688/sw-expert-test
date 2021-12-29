package level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DateValidation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] result = new String[t];
		int index = 1;
		
		int[] arr = {1,3,5,7,8,10,12};
		int[] arr2 = {2,4,6,9,11};

		for(int i=0; i<t; i++) {
			String test_case = sc.next();
			
			// 8글자 확인
			if(test_case.length() != 8) {
				result[i] = "-1";
				continue;
			}
			
			String years_s = test_case.substring(0, 4);
			String months_s = test_case.substring(4, 6);
			String days_s = test_case.substring(6, 8);
			
			int months = Integer.parseInt(months_s);
			int days = Integer.parseInt(days_s);
			
			// months
			if(months < 1 || months > 13) {
				result[i] = "-1";
				continue;
			}
			
			boolean test = IntStream.of(arr).anyMatch(x -> x == months);
			boolean test2 = IntStream.of(arr2).anyMatch(x -> x == months);
			
			if(months == 2) {
				if(days < 1 || days > 28) {
					result[i] = "-1";
					continue;
				} 
			} else {
				if(test) {
					if(days < 1 || days > 31) {
						result[i] = "-1";
						continue;
					} 
				} else if (test2) {
					if(days < 1 || days > 30) {
						result[i] = "-1";
						continue;
					}
				}
			}
			
			result[i] = years_s + "/" + months_s + "/" + days_s;
		}
		
		for(String output: result) {
			System.out.printf("#%d %s\n",index, output);
			index++;
		}
		
		sc.close();
		
//		try {
//			SimpleDateFormat dateFormatParser = new SimpleDateFormat("yyyy/MM/dd");
//			String test = "01010101";
//			
//			dateFormatParser.setLenient(false);
//			System.out.println(dateFormatParser.parse(test));
//			// Unparseable date: "01010101"
//			
//		} catch(Exception error) {
//			System.out.println(error);
//		}
	}
}
