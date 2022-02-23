package a06_조건;

import java.util.Scanner;

public class IfElseEx6 {

	public static void main(String[] args) {

		/*
		 * x, y
		 * 
		 * x축 : 10
		 * y축 : 5
		 * 
		 * 3사분면 입니다.
		 * 원점 입니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int result = 0;
		
		
		System.out.print("좌표를 입력하세요 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x == 0 && y == 0) {
			System.out.println("원점 입니다.");
		}else {
			if( x > 0 && y > 0) {
				result = 1;
			}else if ( x < 0 && y > 0 ) {
				result = 2;
			}else if ( x < 0 && y < 0) {
				result = 3;
			}else if ( x > 0 && y < 0) {
				result = 4;
			}
				System.out.println(result + "사분면 입니다.");
		}
		
		
		
		
	}

}
