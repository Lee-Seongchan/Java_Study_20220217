package a14_최상위클래스;

public class EqualsAndHashcode {

	public static void main(String[] args) {
		Student s1 = new Student(1,1,1,"이성찬");
		Student s2 = new Student(1,1,2,"이성찬");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}

}
