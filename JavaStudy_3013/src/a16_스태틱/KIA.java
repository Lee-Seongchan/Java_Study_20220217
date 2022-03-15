package a16_스태틱;

import java.time.LocalDate;

public class KIA {
	private static KIA instance;
	//클래스 내부에서 자기 자신을 생성하여 private 인스턴스 변수에 대입
	private String companyName;
	private int serialNumber;
	
	
	private KIA() {
	//생성자의 접근 지정자가 private
		companyName = getClass().getSimpleName();
								//getSimpleName 클래스 이름만 가져옴
		serialNumber = LocalDate.now().getYear() * 10000;
	}								
	public static KIA getInstance() {
		//누구나 접근 가능할 수 있어야 한다.
		//getInstance를 호출할 때마다 생성
		if(instance == null) {
			instance = new KIA();
		}
		//그렇기 때문에 if문을 이용하여 인스턴스가 비어있을 때만 생성
		return instance;
		//생성된 인스턴스를 반환해줄 수 있는 스태틱 메소드가 존재해야한다.
	}
	
	public Car createCar(String model) {
		return new Car(++serialNumber, companyName, model);
	}
	
}
