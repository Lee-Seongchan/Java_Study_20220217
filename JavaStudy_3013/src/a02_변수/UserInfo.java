package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
/*
 * 	학번 : 2022001 - > studentCode(정수)
 *  이름 :  이성찬 -> name1, name2, name3(문자)
 *  학년 : 1 -> studentYear(정수)
 *  성적 : 85.5 - > score(실수)
 *  평점 : B -> grade(문자)
 *  성별 : 남성(true), 여성(flase) - > gender(boolean)
 */
		
		int studentCode = 2022001;
		System.out.print("학번 : ");
		System.out.println(studentCode);
		
		
		char name1 = '이';
		char name2 = '성';
		char name3 = '찬';
				
		
		System.out.print("이름 : ");
		System.out.println(""+name1 + name2 + name3);
		
		
		
		int studentYear = 1;
		System.out.println("학년 : " + studentYear);
		
		
		double score = 85.5;
		System.out.print("성적 : ");
		System.out.println(score + 5);
		
		char grade = 'B';
		System.out.print("평점 : ");
		System.out.println(grade);
		
		boolean gender = true;
		System.out.print("성별 : ");
		System.out.println(gender);
	}

}
