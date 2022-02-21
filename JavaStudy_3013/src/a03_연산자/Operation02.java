package a03_연산자;

public class Operation02 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 30;

	
		
		System.out.println(num1 + (num2++));
		System.out.println(num2);
		
		/*
		 * 정수형 변수 dan = 2
		 * 정수형 변수 num = 1
		 * 정수형 변수 result = dan * num
		 * 
		 * 2 * 1 = 2
		 */
		
		int dan = 2;
		int num = 1;
		int result = dan * num;
		
		System.out.println(dan + " * " +  num + " = "  + result);
		
		//증감 연산자를 사용하여 2023년 3월 22일을 출력 
		
		int year = 2022;
		int month = 2;
		int day = 21;
		
		System.out.println((++year) +"년 " + (++month) +"월 " + (++day) + "일");
		
		 
	}

}
