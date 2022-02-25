package a07_반복.퀴즈;

public class Quize8 {

	public static void main(String[] args) {
	
		/*
		 *	윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때, 또는 400의 배수일 때 
		 */
		
		int year = 0;
		
		for (int i = 0; i < 2001; i ++) {
			year = i + 1;
			if(!(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
				continue;
			}
			System.out.println(year);
		}
		
	}

}
