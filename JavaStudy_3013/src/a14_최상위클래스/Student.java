package a14_최상위클래스;

import java.util.Objects;

public class Student {
	private int studentYear;
	private int studentGroup;
	private int studentNumber;
	private String name;
	
	
	/*
	 * Object 클래스에 정의되어 있는 hashCode() 메서드는 물리적 주소값을 리턴하는 기능.
	 * 물리적 주소 / 논리적 주소
	 * 물리적 주소 : 실질적으로 메모리에 저장되어 지는 주소(native 주소)
	 * hashCode() 메서드를 재정의(Override)한다는 것은 '논리적 주소'를 만들겠다는 의미이다.
	 */
	 
	@Override
	public int hashCode() {
		return Objects.hash(name, studentGroup, studentNumber, studentYear);
	}
	

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentGroup == other.studentGroup
				&& studentNumber == other.studentNumber && studentYear == other.studentYear;
	}





	public Student(int studentYear, int studentGroup, int studentNumber, String name) {
		super();
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.name = name;
	}





	@Override
	public String toString() {
		return "Student [studentYear=" + studentYear + ", studentGroup=" + studentGroup + ", studentNumber="
				+ studentNumber + ", name=" + name + "]";
	}
	
	
}
