package a05_입력;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {

		/**
		 * username(아이디)
		 * password(비밀번호)
		 * year()
		 * month(월)
		 * day(일)
		 * name(이름)
		 * address(주소) 부산시 동래구 사직동 
		 * 
		 */
		
		//import 단축키 : ctrl + shift + o 
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String username = sc.next();
		String password = sc.next();
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		String name = sc.next();
		sc.nextLine();
		//nextLine 을 제외한 나머지는 버퍼를 가지고 있기 때문에 엔터 or 스페이스 값을 날리기 위해 의미 없는 nextLine을 씀  
		String address = sc.nextLine();

		System.out.println("아이디 : " + username);
		System.out.println("비밀번호 : " + password);
		System.out.println("생년월일: " + year + "/" + month + "/" + day);
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
	
		
	}

}
