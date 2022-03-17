package a19_예외;

import java.io.IOException;
import java.util.ArrayList;

import a18_컬렉션.ArrayList.Student;

public class ExceptionEx2 {

	public void array() throws IOException ,IndexOutOfBoundsException, NullPointerException{
		//IOException ,IndexOutOfBoundsException, NullPointerException 예외가 발생할 수 있다고 throws로 명시 
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student());	//0
		students.add(new Student());	//1
		students.add(new Student());	//2
		students.add(new Student());	//3
		students.add(null);				//4
		students.add(new Student());	//5
		students.add(new Student());	//6
		students.add(new Student());	//7
		
		for(int i = 0; i <students.size()+1; i++) {
			Student student = students.get(i);
			student.setName("이성찬");
			System.out.println(student.getName());
		}
			System.out.println("메서드 끝까지 실행 될까?"); 
		
	}
	
	
	public static void main(String[] args) {
		ExceptionEx2 ex2 = new ExceptionEx2();
		try {
			ex2.array(); // 예외처리 강제로 해야함.
		} catch (IndexOutOfBoundsException | NullPointerException | IOException e) {//멀티캐치
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		
//		try {	
//			
//		
//		}catch(NullPointerException e) {
//				System.out.println("주소를 참조할 수 없습니다.");
//		}catch(IndexOutOfBoundsException e) {
//			System.out.println("참조할 수 있는 인덱스의 크기를 초과하였습니다.");
//		}catch(Exception e) {
//		//Exception은 모든 예외의 부모로 마지막에 위치 
//			e.printStackTrace(); // 어떤 예외인지 출력
//		}finally {
//			System.out.println("예외가 발생하든 하지 않든 무조건 실행");
//		}
		System.out.println("프로그램 종료");
		
	}

}
