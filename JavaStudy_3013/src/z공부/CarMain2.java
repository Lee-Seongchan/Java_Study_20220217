package z공부;

public class CarMain2 {

	public static void main(String[] args) {
		Car[] cars = new Car[3];
		
		Car c1 = new Car();
		
		c1.color = "화이트";
		c1.company = "대우";
		c1.type = "경차";
		
		for (int i = 0; i < cars.length; i++) { 
			cars[i] = c1;
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
		System.out.println();
		System.out.println("cars[0] : " + cars[0].color);
		System.out.println("cars[1] : " + cars[1].color);
		System.out.println("cars[2] : " + cars[2].color);
		
	}

}
