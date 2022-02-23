package a06_조건;

import java.util.Scanner;

public class IfElseEx2 {

	public static void main(String[] args) {
		
		/*
		 * 두 수 중 큰 값을 출력하는 프로그램
		 * x,y 
		 * 
		 *  두 수를 입력해주세요 : 10 20
		 *  
		 *  두 수 중 큰 값은 20 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int result = 0;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x==y) {
			System.out.println("두 수가 같습니다.");
		}else {
			if (x > y) {
				result = x;
			} else {
				result = y;
			}
			System.out.println("두 수중 큰 값은 "+ result + "입니다.");	
		}
		
		
	}

}
