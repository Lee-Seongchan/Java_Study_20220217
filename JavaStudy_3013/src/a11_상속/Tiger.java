package a11_상속;

public class Tiger extends Animal{
	@Override // Override : 애니멀로 부터 상속받은 건데 나만의 동작으로 새로 재정의 한 것읠 의미
	public void move() {
		System.out.println("호랑이가 네발로 뛰어다닙니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
