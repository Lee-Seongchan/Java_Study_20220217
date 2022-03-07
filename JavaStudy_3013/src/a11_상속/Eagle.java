package a11_상속;

public class Eagle extends Animal{
	@Override //어노테이션
	public void move() {
		super.move();
		// super : 부모의 주소
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 하늘로 날아 올라 갑니다.");
	}
	
}
