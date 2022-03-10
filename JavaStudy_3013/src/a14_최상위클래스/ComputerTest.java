package a14_최상위클래스;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Computer laptop = new Laptop("삼성", "갤러시북 프로");
		
		Object obj = new Computer();
		Object obj2 = new Laptop("LG","그램2022");
		//((Computer)obj). 다운 캐스팅한 후에 참조
		// 모든 클래스가 Object 클래스를 상속 받고 있다. -> 모든 클래스는 Object로 묶을 수 있다. 
		// 최상위 클래스
		Object[] objs = new Object[2];
		objs[0] = computer;
		System.out.println(computer);
		
		System.out.println(laptop);
		System.out.println(obj2);
	}

}
