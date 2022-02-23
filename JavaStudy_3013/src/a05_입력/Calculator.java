package a05_입력;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		/*
		 * x y z
		 * 
		 * 세 수를 입력 받는다
		 * 
		 * 10 20 30
		 * 
		 * 세수의 합 : 60
		 * 
		 * 세 수를 입력 하세요 5  2 1
		 * 
		 * 세수의 곱 10
		 * 
		 * 세 수룰 입력하세요 : 50 2 2
		 * 
		 *  앞의 두수의 곱에 세번째 수로 나눈 나머지 : 0
		 *  
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int z = 0;
		int result  = 0;
		
		
		System.out.print("세 수를 입력하세요 : " + result);
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		result = x + y + z;

		System.out.print("세수의 합 : " + (result));
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		result = x * y * z;

		System.out.print("세수의 곱 : " + (result));
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		result =(x * y) % z;

		System.out.print("앞의 두 수의 곱에 세번째 수로 나눈 나머지 : " + (result));
		
		
		
		
	}

}
