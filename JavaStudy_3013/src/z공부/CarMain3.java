package z공부;

public class CarMain3 {

	public static void main(String[] args) {
		Car[] cars = new Car[3]; //Car 타입의 배열객체 생성
		
		for (int i = 0; i < cars.length; i++) { //모든 인덱스에 new 연산자로 객체 생성 후 저장
			cars[i] = new Car();
			cars[i].color = "화이트";
			cars[i].company = "대우";
			cars[i].type = "경차";
		}
		System.out.println("cars[0] : " + cars[0].color);
		System.out.println("cars[1] : " + cars[1].color);
		System.out.println("cars[2] : " + cars[2].color);
		
		System.out.println();
		
		System.out.println("cars[0] : " + cars[0].company);
		System.out.println("cars[1] : " + cars[1].company);
		System.out.println("cars[2] : " + cars[2].company);
		
		System.err.println();
		
		cars[1].color = "블랙"; //1번 인덱스 객체의 color 필드에 "블랙" 대입
		cars[2].company = "기아"; //2번 인덱스 객체의 company 필드에 "기아" 대입
		System.out.println();
		System.out.println("cars[0] : " + cars[0].color);
		System.out.println("cars[1] : " + cars[1].color);
		System.out.println("cars[1] : " + cars[1].company);
		System.out.println("cars[2] : " + cars[2].company);
	}
}
