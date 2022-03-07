package a10_배열;

public class MaxAndMin {

	public static void main(String[] args) {
		int[] numbers = {10, 30, 2, 5, 8, 21, 16, 14};
		/*
		 * numbers 배열 안에서 가장 큰 값과 가장 작은 값을 찾아 출력하시오.
		 */
		
		int min = 0;
		int max = 0;
		
		for(int i= 0; i < numbers.length; i++) {
			if(i == 0) {
				max = numbers[i];  
				min = numbers[i];
				continue;
			}
			if(min > numbers[i]) {
				min = numbers[i];
			}
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);

	}
}
