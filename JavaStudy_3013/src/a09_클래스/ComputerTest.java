package a09_클래스;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = null;
		Computer c2 = null;
		
		c1 = new Computer(); //생성(생성자 호출) heap 메모리 영역에 생성
		c2 = new Computer(); 
		
		
		System.out.println(c1);
		System.out.println(c2);
		//c1과 c2의 주소값이 다름 
		
		c1.model = "삼성컴퓨터";
		c2.model = "LG컴퓨터";
		
		System.out.println(c1.model);
		System.out.println(c2.model);
		
		String model = "삼성컴퓨터";
		model = "LG컴퓨터";
		
		c1.printInfo();
		c2.printInfo();
		
	} //end main

} //end class 
