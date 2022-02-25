package a07_반복;

public class ContinuEx {

	public static void main(String[] args) {

		/*
		 *continue ->  계속하다 
		 *
		 *break는 멈추는 것이고  continue는 다음 반복으로 넘어감		
		 */
		
		
		for(int i = 0; i < 5; i++ ) {
			if( i != 0 && i % 2 ==0) {
				continue;
			}
			if(i==3) {
				break;
			}
			
			System.out.println("break : " + i);
		}
		
		for(int i = 0; i < 5; i++ ) {
			if( i != 0 && i % 2 ==0) {
				continue;
			}
		
			System.out.println("continue : " + i);
		}
			
			
	}

}
