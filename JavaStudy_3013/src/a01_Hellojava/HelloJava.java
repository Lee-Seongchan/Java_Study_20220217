package a01_Hellojava;

/**
 * 
 * 여러줄 주석(클래스 또는 메소드를 설명하는 주석)
 *
 */

/*
 * 
 *  여러줄 주석(여러줄 메모용)
 * 
 */

// 한줄 주석

// 주석의 단축키 Ctrl + /




public class HelloJava { 
/**
 * 
 * main은 프로그램 시작지점
 * 
 */
	public static void main(String[] args) {
//		'문자' -> 'ㅁ'
//		"문자열" -> "ㅁㅁㅁㅁㅁㅁ"
//		프로그램 실행 Ctrl + F11
//		\n은 엔터
		
		System.out.print("Hello, java\n");
		System.out.println("이성찬\n");
		System.out.println("");
	
		System.out.print("이름: ");
		System.out.println("이성찬");
		System.out.print("연락처:");
		System.out.println("010-5397-3013");
		System.out.print("주소: ");
		System.out.println("부산 동래구 사직동");
	}

}
