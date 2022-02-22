package a03_연산자;

public class Operation04 {

	/*
	 * 논리연산자(boolean)
	 * AND -> && -> 곱
	 * OR  -> || -> 합
	 * NOT ->  ! -> 부정
	 * 
	 * true(1), false(0)
	 * true && true -> true
	 * true && false -> false
	 * 
	 * true || true -> true
	 * true || false -> true 
	 * false || false -> false
	 * 
	 * !(true || false) -> false
	 * !true || false -> false  
	 */
	
	
	public static void main(String[] args) {
		
		int score = -10;
		
		boolean result;
		
		//score가 음수도 안되고 100 초과도 안된다 
		
		result = !(score < 0 || score > 100);
		
		System.out.println("결과 : " + result);
		
		
		char grade = 'A';
		
		// grade 소문자여도 되고 대문자여도 되는데 a,b,c,A,B,C 만 가능
		
		result = (grade == 'a' || grade == 'A' || grade == 'b' || grade == 'B' || grade == 'c'  || grade == 'C');
        
		System.out.println("결과2 : " + result);
		
		//아스키코드를 이용한 조건식
		result = (97 <= grade && grade <= 99 ) || (65 <= grade && grade <= 67) ;
		
		System.out.println("결과3 : " + result);
		
		
	}

}
