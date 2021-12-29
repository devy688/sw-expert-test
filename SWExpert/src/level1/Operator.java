package level1;

import java.util.Scanner;

class Calculator {
	static int add(int a, int b) {
		return a + b;
	}
	static int minus(int a, int b) {
		return a - b;
	}
	static int multiply(int a, int b) {
		return a * b;
	}
	static int divide(int a, int b) {
		return a / b;
	}
}


public class Operator {

	public static void main(String[] args) {
		
		System.gc();
		
		// 실행전 메모리 사용량 조회
		long before = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
				
		if(a < 0 || a > 9) {
			System.out.println("1~9 사이의 숫자만 입력하세요.");
			
		} else if (b < 0 || b > 9) {
			System.out.println("1~9 사이의 숫자만 입력하세요.");
			
		} else {
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
		}
		
		sc.close();
		
		// Garbage Collection으로 메모리 정리
		System.gc();
		
		// 실행 후 메모리 사용량 조회
		long after  = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		// 메모리 사용량 측정
		long usedMemory = (before - after)/1024/1024;
		System.out.println("Used Memory : " + usedMemory);
		
		// 애플리케이션에 할당된 힙메모리 사이즈, 이 사이즈를 넘어서면 OOM 발생
		long heapSize = Runtime.getRuntime().maxMemory();
		System.out.println(heapSize/1024/1024);
		
		
		
//		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
//		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
//		System.out.println("시간차이(m) : "+secDiffTime);

	}
}
