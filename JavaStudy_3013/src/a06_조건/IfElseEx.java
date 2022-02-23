package a06_조건;

public class IfElseEx {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		
		x = 10;
		y = 20;
		
		if(x > y) 
			{ System.out.println("x가 y보다 큽니다."); 
			 System.out.println("test");
			}
		//if 안에 두가지 이상의 실행문을 완성 시키고 시키고 싶으면 중괄호를 이용함.
		
		else 
			System.out.println("x가 y보다 작습니다.");
	}

}
