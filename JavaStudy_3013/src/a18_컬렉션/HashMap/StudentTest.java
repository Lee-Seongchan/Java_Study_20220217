package a18_컬렉션.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new HashMap<String,Student>());
		
		service.showStduentAll();
		
		service.addStduent("AAA", "a@gmail.com", "부산시 동래구");
		service.addStduent("BBB", "b@gmail.com", "부산시 동래구");
		service.addStduent("CCC", "c@gmail.com", "부산시 동래구");
		service.showStduentAll();

		service.updateStudentByName("AAA","AA@gmail.com","부산 북구");
		service.showStduentByName("BBB");
		
		service.deleteStudentByName("BBB");
		service.showStduentAll();
	}

}
