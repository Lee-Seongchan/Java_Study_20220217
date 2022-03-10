package a14_최상위클래스;

public class StringTest {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Computer computer2 = computer1;
		Computer computer3 = new Computer();
		
		System.out.println(computer1 = computer2);
		System.out.println(computer1 = computer3);
		System.out.println(computer1.equals(computer2)); //주소값 비교
		
		Integer num1 = 10; 
		int num2 = 10;
		System.out.println(num1 + num2);
		
		String name = "이성찬";
		String name2 = "이성찬";
		String name3 = new String("이성찬");
		//생성과 리터럴은 주소가 다름
		System.out.println(name3);
		
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name.equals(name2)); //문자열의 값의 비교
		//String 은 클래스이다. 클래스는 object를 상속받음
		//equals를 쓰면 안에 있는 값을 비교한다. 
		 
	}

}
