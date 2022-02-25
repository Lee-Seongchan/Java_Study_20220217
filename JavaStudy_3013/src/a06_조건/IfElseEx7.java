package a06_조건;

import java.util.Scanner;

public class IfElseEx7 {

	public static void main(String[] args) {

		
		/*
		 * 윤년 구분하기 
		 * 1. year 변수를 만들어서 년도를 입력받는다
		 * 2. 연도는 1보다 크거나 같고 4000보다 작거나 같은 자연수
		 * 3. 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때, 또는 400의 배수일 때 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		System.out.print("년도를 입력하세요");
		
		year = sc.nextInt();
		
		
		if (year > 0 && year < 4001 ) {
			if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				System.out.println(1);
			}else {
					System.out.println(0);
				}
		}else { 
			System.out.println("계산할 수 없는 년도 입니다.");
		}
		
	}

}
