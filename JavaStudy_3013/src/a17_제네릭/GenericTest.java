package a17_제네릭;

import a13_인터페이스2.model.User;

public class GenericTest {

	//genericTest 클래스 안에 메서드를 하나 선언
	//static을 안 붙음 ->  메모리 어딘가에 생성이 되어 있어야 호출 가능.
	
	public GenericEx<String> getExData(String data) {
		GenericEx<String> ex = new GenericEx<String>(data);
		return ex;
		
	}
	
	public GenericEx<User> getExData(User data) {
		GenericEx<User> ex = new GenericEx<User>(data);
		return ex;
				
	}
		
		
	public static void main(String[] args) {
		GenericTest genericTest = new GenericTest(); 
		//생성이 getData 메서드를 생성하기 위해 생성이 무조건 되어 있어야 함.
		GenericEx<String> ex = genericTest.getExData("100");
		GenericEx<User> ex2 = genericTest.getExData(new User("seongchan","1234","이성찬","a@gmail.com"));
		System.out.println(ex);		
		System.out.println(ex2);		
		
	}

	
}
