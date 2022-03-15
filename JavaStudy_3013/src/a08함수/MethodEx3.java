package a08함수;

import java.util.Scanner;

public class MethodEx3 {

	public static void printStar(int startCount) {
		
		if(startCount < 1) {
			System.out.println("별의 개수는 1개 이상을 입력하셔야 합니다.");
		}else {
			for(int i = 0; i < startCount; i ++) {
				for(int j =0; j < startCount-i-1; j++ ) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i*2) + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		}
			
			
	}
	
	public static void main(String[] args) {
		/*
		 * 메소드 명 : printStar(입력받은 별의 개수)
		 * 1보다 작은 음수가 들어왔을 때, 
		 * 별의 개수는 1개 이상을 입력하셔야 합니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("숫자를 입력하시오 : ");
		n = sc.nextInt();
		
		printStar(n);
		
		
	}

}
