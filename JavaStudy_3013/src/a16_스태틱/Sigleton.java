package a16_스태틱;

/**
 * 
 * 싱글톤(sigleton) 디자인 패턴
 * 클래스의 인스턴스가 하나임을 보장하고(생성을 한번만) 접근할 수 있는 전역적인 접근점을 제공하는 
 * 패턴으로 디자인패턴의 가장 많이 알려진 패턴
 * 
 * 특징.
 * 1. 클래스 내부에서 자기 자신을 생성하여 private 인스턴스 변수에 대입한다. 
 * 2. 생성자의 접근 지정자가 private이다.
 * 3. 생성된 인스턴스를 반환해줄 수 있는 스태틱 메소드가 존재해야한다.
 * 
 * 
 */
public class Sigleton {

	public static void main(String[] args) {
		//KIA kia = new KIA(); 생성 불가능
		
		KIA factory1 = KIA.getInstance();
		KIA factory2 = KIA.getInstance();
		KIA factory3 = KIA.getInstance();
		KIA factory4 = KIA.getInstance();
		
		Car[] cars = new Car[4];
		
		factory1.createCar("k5");
		factory2.createCar("k7");
		factory3.createCar("k8");
		factory4.createCar("k9");
		
		
		for(int i =0; i < cars.length; i++) {
			System.out.println(cars[i]);
		

		}
	}

}
