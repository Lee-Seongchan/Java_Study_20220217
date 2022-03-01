package a_08함수;

	// 메서드는 똑같은 이름 똑같은 매개변수로 만들 수 없다.

public class MethodEx1 {
	// 리턴값은 있지만 매개변수는 없는 형태
	public static int outputNumber() {
		return 10;
	}
	
	// 매개변수도 없고 리턴 자료형도 없음
	public static void showName() {
		String name = "이성찬";
		System.out.println("이름 : " + name);
	}
	
	// 매개변수 전달
	// 리턴 자료형도 있고 매개 변수도 있음
	public static int outputNumber2(int number) {
		return number;
	}
	
	
	public static int outputNumber3(int number) {
		if(number%2 ==0) {
			return 0;
		}else {
			return 1;
		}
	}
	// return값은 하나만 있는 것이 아니라 여러 형태로 리턴할 수 있다.
	
	public static void showName2(String name) {
		if(name == null) {
			return;
		}
		System.out.println(name);
	}
	// void인 경우 어떠한 값도 return하지 않음  
	// 그러나 return이 있을 경우 name이 null이라면 
	// 더 이상 실행하지 않음
	// 따라서 System.out.println(name);은 실행되지 않음
	// break와 유사
	
	public static void main(String[] args) {
		//프로그램은 main에서 부터 시작
		int number = outputNumber();
		System.out.println(number);
		showName(); 
		// System.out.println(showName); 
		// 리턴 타입이 있는 것은 값이 된다. 그러나 showName은 void로 되어져 있어 값으로 활용할 수 없기 때문에 출력 불가능.
		showName2(null);
		int number2 = outputNumber2(100);
		System.out.println(number2);
	}

}
