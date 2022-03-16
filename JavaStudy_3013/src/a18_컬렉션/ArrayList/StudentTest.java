package a18_컬렉션.ArrayList;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new ArrayList<Student>());
		
		service.showStduentAll();
		
		service.addStduent("AAA", "a@gmail.com", "부산시 동래구");
		service.addStduent("BBB", "b@gmail.com", "부산시 동래구");
		service.addStduent("CCC", "c@gmail.com", "부산시 동래구");
		service.showStduentAll();

		service.updateStudentByName("AAA","AA@gmail.com","부산 북구");
		service.showStduentByName("BBB");
		
		service.deleteStudentByName("CCC");
		service.showStduentAll();
	}

}
