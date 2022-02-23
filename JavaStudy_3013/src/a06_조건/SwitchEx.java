package a06_조건;

public class SwitchEx {

	public static void main(String[] args) {
		
		int select = 4;
		
		switch(select) {
			case 1 : 
				System.out.println("1을 선택하셨습니다.");
				break;
			case 2 : 
				System.out.println("2를 선택하셨습니다.");
				break;
			case 3 : 
				System.out.println("3을 선택하셨습니다.");
				break;
			default :
				System.out.println("해당 case는 없습니다.");
			//default는 해당 case 값에 없을 때 if문의 else와 비슷하다.
		}
		
		String selcet2 = "이성찬";
		
		switch(selcet2) {
			case "이성찬" : 
				System.out.println("선택하신 이름은 이성찬 입니다.");
				break;
			case "김성찬" : 
				System.out.println("선택하신 이름은 김성찬 입니다.");
			case "정성찬" : 
				System.out.println("선택하신 이름은 정성찬 입니다.");
		}
		
		int num = 21;
		if(num == 0) {
			System.out.println("0입니다.");
		}else {
			switch((num % 2)) {
				case 1 :
					System.out.println("홀수 입니다.");
					break;
				case 0 :
					System.out.println("홀수 입니다.");	
//				default :
//				System.out.println("짝수 입니다.");
			}
		}
		
		//삼항 연산자를 활용한 switch문
		
		int x = 24;
				switch(x == 0 ? 2 : x % 2 ) {
					case 0 :
						System.out.println("짝수 입니다.");
						break;
					case 1 :
						System.out.println("홀수 입니다.");
						break;
					default :
						System.out.println("num이 0입니다.");
				}
	}

}
