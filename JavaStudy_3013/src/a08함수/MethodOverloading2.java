package a_08함수;

import java.util.Scanner;
/*
 * 계산기
 * 입력
 * 첫번째 수 입력
 * 
 * 사칙연산(+,-,*,/)
 * 
 * 두번째 수 입력
 * 
 * 결과를 입력
 * 
 * 정수와 실수 모두 계산 가능해야함.
 * 
 * calc()
 */
public class MethodOverloading2 {

	public static String calc(String num1, String num2, char operator) {
		String result = null;
		
		if(operator == '+') {
			result = Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
		}else if(operator == '-') {
			result = Double.toString(Double.parseDouble(num1) - Double.parseDouble(num2));
		}else if(operator == '*') {
			result = Double.toString(Double.parseDouble(num1) * Double.parseDouble(num2));
		}else if(operator == '/') {
			result = Double.toString(Double.parseDouble(num1) / Double.parseDouble(num2));
		}else {
			result = "계산 할 수 없는 연산자 입니다.";
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String num1 = null, num2 =null;
		char operator = ' ';
		
		System.out.println("첫번째 수 입력 : ");
		num1 = scanner.next();
		
		System.out.println("연산할 기호를 입력하세요 : ");
		operator = scanner.next().charAt(0);
		
		System.out.println("두번째 수 입력 : ");
		num2 = scanner.next();
		
		System.out.println("결과 : " + calc(num1, num2, operator));
		
	}

}
