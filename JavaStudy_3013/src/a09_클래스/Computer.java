package a09_클래스;

public class Computer {
	String model; 
	
	
	//생성자의  return값은 무조건 주소값이다.
	//생성자 또한 메소드이므로 사용을 위해 먼저 정의되어야 한다. 
	//일반 메소드와 차이는 리턴 타입이 없다는 것
	public Computer() { 
		System.out.println("컴퓨터 객체를 생성합니다.");
	}
	
	public void printInfo() {
		System.out.println("컴퓨터 모델 : " + model);
	}
}
