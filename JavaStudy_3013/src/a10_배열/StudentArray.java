package a10_배열;

public class StudentArray {

	public static void main(String[] args) {

		Student[] students = new Student[5];
		students[0] = new Student("이성찬",1);
		students[1] = new Student("김성찬",4);
		students[2] = new Student("박성찬",3);
		students[3] = new Student("찬성찬",1);
		students[4] = new Student("호성찬",2);
				
		/*
		 * 1학년 : 2명
		 * 2학년 : 1명
		 * 3학년 : 1명
		 * 4학년 : 1명
		 */
		
		int yearCount1 = 0;
		int yearCount2 = 0;
		int yearCount3 = 0;
		int yearCount4 = 0;
		
		
		for(int i = 0; i < students.length; i++) {
			int studentYear = students[i].getStudentYear();
			if(studentYear == 1) {
				yearCount1++;
			}else if(studentYear == 2) {
				yearCount2++;
			}else if(studentYear == 3) {
				yearCount3++;
			}else if(studentYear == 4) {
				yearCount4++;	
			}
		}
				
			System.out.println("1학년 : " + yearCount1 + "명");
			System.out.println("2학년 : " + yearCount2 + "명");
			System.out.println("3학년 : " + yearCount3 + "명");
			System.out.println("4학년 : " + yearCount4 + "명");
			
		
		
			
		
	}

}
