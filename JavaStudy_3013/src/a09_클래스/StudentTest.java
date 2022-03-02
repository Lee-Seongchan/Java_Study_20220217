package a09_클래스;

/*
 * Student(클래스)
 * 속성
 * 
 * schoolName 
 * studentYear 
 * studentGroup
 * studentnumber
 * studentName
 * studentAdderess
 * studentphone
 * graduationFlag(boolean)
 * 
 * 기능(메소드)
 * showStudentInfo()
 * 학교명 : 부산고등학교
 * 학년 : 3
 * 반 : 2
 * 번호 : 10
 * 이름 : 이성찬
 * 주소 : 부산 동래구
 * 연락처 : 010-5397-3013
 * 졸업구분 : 재학중 [true(졸업) false(재학중)];
 * 
 * incrementYear()
 * 학년 + 1
 * 학년 3학년을 넘어서면 graduationFlag = true;
 * 
 */
public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.schoolName = "부산고등학교";
		s1.studentYear = 1;
		s1.studentGroup = 2;
		s1.studentnumber = 10;
		s1.studentName = "이성찬";
		s1.studentAdderess = "부산시 동래구";
		s1.studentphone = "010-5397-3013";
		s1.graduationFlag = false;
		
		
		
		s1.incrementYear();
		s1.showStudentInfo();
		
		Student s2 = new Student("경남고등학교",1,3,15,"김성찬","부산 서구","010-0000-0000",false);
		s2.showStudentInfo();
		
		Student s3 = new Student("성일남고등학교","박성찬");		
		s3.showStudentInfo();
		
		
	}

}
