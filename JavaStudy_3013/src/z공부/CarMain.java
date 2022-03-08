package z공부;

public class CarMain {

	public static void main(String[] args) {

		Car c1 = new Car(); //객체 생성
		Car c2 = new Car(); 
		
		if(c1 == c2) {
			System.out.println("c1과 c2의 저장된 주소는 같다. ");
		}else {
			System.out.println("c1과 c2의 저장된 주소는 다르다");
		}
	}

}
