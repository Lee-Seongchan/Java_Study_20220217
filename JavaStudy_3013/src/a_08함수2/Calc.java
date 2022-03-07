package a_08함수2;

import java.util.Scanner;

public class Calc {

	/* 
	 * 매개변수는 모두 2개 모두 정수
	 * sum 덧셈
	 * sub 뺄셈
	 * mul 곱셈
	 * div 나눗셈
	 * 나눗셈은 매개변수 둘 중 하나라도 0이면 0을 리턴한다.
	 */
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	public static int div(int a, int b) {
		if( a == 0 || b == 0 ) {
			return 0;
		}else {
			return a / b;	
		}
			
		}
		

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("sum = " + sum(a,b));
		System.out.println("sub = " + sub(a,b));
		System.out.println("mul = " + mul(a,b));
		System.out.println("div = " + div(a,b));
	}

}
