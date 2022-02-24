package a07_반복.퀴즈;

import java.util.Scanner;

public class Quize {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int i = 0;
		
		System.out.print("숫자를 입력하시오 : ");
		
		i = sc.nextInt();
		
		if(i < 0 || i >100) { 
			System.out.println("잘못된 입력 값입니다.");
		}else {
			
				while (i < 100) { 
							i ++;
							System.out.println(i);
							}
		
				}
		
	
		
		int num = 0;
		
		System.out.print("반복 횟수 입력 : ");
		num = sc.nextInt();
		
		
		for(int k = 0; k < num; k ++) {
			System.out.println(k + 1);
		}
		
		
		
		
		
		
	}

}
